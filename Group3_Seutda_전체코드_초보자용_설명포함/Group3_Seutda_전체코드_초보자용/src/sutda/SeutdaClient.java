package sutda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

/**
 * 섯다 서버와 통신하는 클라이언트입니다.
 * 화면 클래스는 이 객체를 통해 START / ACTION / NEXT 명령만 보냅니다.
 */
public class SeutdaClient {
    public interface Listener {
        void onWelcome(int myId, boolean host);

        void onLobby(List<LobbyPlayer> players, int maxPlayers);

        void onState(GameState state);

        void onLog(String message);

        void onResult(String summary, String result);

        void onError(String message);

        void onDisconnected();
    }

    public static class LobbyPlayer {
        public int id;
        public String name;
        public boolean host;
    }

    public static class PlayerState {
        public int id;
        public String name;
        public long money;
        public long currentBet;
        public boolean folded;
        public boolean out;
        public boolean rematchTarget;
        public int card1;
        public int card2;
        public boolean showCard1;
        public boolean showCard2;
        public String handName;
    }

    public static class GameState {
        public int round;
        public int phase;
        public long pot;
        public long targetBet;
        public int currentTurnId;
        public boolean roundFinished;
        public boolean gameOver;
        public boolean revealFirstCards;
        public final List<PlayerState> players = new ArrayList<>();
    }

    private final Listener listener;
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private Thread readerThread;
    private volatile boolean connected;

    public SeutdaClient(Listener listener) {
        this.listener = listener;
    }

    /** 서버 IP에 연결하고 닉네임을 전송합니다. */
    public void connect(String host, int port, String playerName) throws IOException {
        socket = new Socket();
        socket.connect(new InetSocketAddress(host, port), 3000);
        socket.setTcpNoDelay(true);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
        out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);
        connected = true;
        out.println("JOIN\t" + encode(playerName));

        readerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                readLoop();
            }
        }, "sutda-client-reader");
        readerThread.setDaemon(true);
        readerThread.start();
    }

    public void startGame() {
        send("START");
    }

    public void sendAction(int action) {
        send("ACTION\t" + action);
    }

    public void nextRound() {
        send("NEXT");
    }

    public synchronized void close() {
        connected = false;

        try {
            if (socket != null) {
                socket.close();
            }
        } catch (IOException ignored) {
        }
    }

    private synchronized void send(String message) {
        if (connected && out != null) {
            out.println(message);
        }
    }

    private void readLoop() {
        try {
            while (connected) {
                String line = in.readLine();

                if (line == null) {
                    break;
                }

                parse(line);
            }
        } catch (IOException ignored) {
        } finally {
            boolean shouldNotify = connected;
            close();

            if (shouldNotify && listener != null) {
                listener.onDisconnected();
            }
        }
    }

    /** 서버에서 받은 한 줄의 첫 단어를 보고 어떤 메시지인지 구분합니다. */
    private void parse(String line) {
        String[] value = line.split("\\t");

        if (value.length == 0) {
            return;
        }

        String command = value[0];

        try {
            if ("WELCOME".equals(command)) {
                parseWelcome(value);
            } else if ("HOST".equals(command)) {
                parseHost(value);
            } else if ("LOBBY".equals(command)) {
                parseLobby(value);
            } else if ("STATE".equals(command)) {
                listener.onState(parseState(value));
            } else if ("LOG".equals(command)) {
                parseLog(value);
            } else if ("RESULT".equals(command)) {
                parseResult(value);
            } else if ("ERROR".equals(command)) {
                parseError(value);
            }
        } catch (Exception e) {
            if (listener != null) {
                listener.onError("서버 메시지를 읽는 중 오류가 발생했습니다.");
            }
        }
    }

    private void parseWelcome(String[] value) {
        if (value.length < 3) {
            return;
        }

        int id = Integer.parseInt(value[1]);
        boolean host = Boolean.parseBoolean(value[2]);
        listener.onWelcome(id, host);
    }

    private void parseHost(String[] value) {
        if (value.length < 2) {
            return;
        }

        boolean host = Boolean.parseBoolean(value[1]);
        listener.onWelcome(-1, host);
    }

    private void parseLobby(String[] value) {
        if (value.length < 3) {
            return;
        }

        List<LobbyPlayer> players = new ArrayList<LobbyPlayer>();
        int maxPlayers = Integer.parseInt(value[2]);

        for (int i = 3; i < value.length; i++) {
            String[] playerValue = value[i].split(",", 3);

            if (playerValue.length < 3) {
                continue;
            }

            LobbyPlayer player = new LobbyPlayer();
            player.id = Integer.parseInt(playerValue[0]);
            player.name = decode(playerValue[1]);
            player.host = Boolean.parseBoolean(playerValue[2]);
            players.add(player);
        }

        listener.onLobby(players, maxPlayers);
    }

    private void parseLog(String[] value) {
        if (value.length < 2) {
            return;
        }

        listener.onLog(decode(value[1]));
    }

    private void parseResult(String[] value) {
        if (value.length < 3) {
            return;
        }

        String summary = decode(value[1]);
        String result = decode(value[2]);
        listener.onResult(summary, result);
    }

    private void parseError(String[] value) {
        if (value.length < 2) {
            return;
        }

        listener.onError(decode(value[1]));
    }

    /** STATE 메시지 안의 플레이어 정보를 GameState 객체로 옮깁니다. */
    private GameState parseState(String[] value) {
        GameState state = new GameState();

        state.round = Integer.parseInt(value[1]);
        state.phase = Integer.parseInt(value[2]);
        state.pot = Long.parseLong(value[3]);
        state.targetBet = Long.parseLong(value[4]);
        state.currentTurnId = Integer.parseInt(value[5]);
        state.roundFinished = Boolean.parseBoolean(value[6]);
        state.gameOver = Boolean.parseBoolean(value[7]);
        state.revealFirstCards = Boolean.parseBoolean(value[8]);

        int playerCount = Integer.parseInt(value[9]);

        for (int i = 0; i < playerCount; i++) {
            int messageIndex = 10 + i;

            if (messageIndex >= value.length) {
                break;
            }

            PlayerState player = parsePlayerState(value[messageIndex]);

            if (player != null) {
                state.players.add(player);
            }
        }

        return state;
    }

    private PlayerState parsePlayerState(String text) {
        String[] value = text.split(",", 12);

        if (value.length < 12) {
            return null;
        }

        PlayerState player = new PlayerState();

        player.id = Integer.parseInt(value[0]);
        player.name = decode(value[1]);
        player.money = Long.parseLong(value[2]);
        player.currentBet = Long.parseLong(value[3]);
        player.folded = Boolean.parseBoolean(value[4]);
        player.out = Boolean.parseBoolean(value[5]);
        player.rematchTarget = Boolean.parseBoolean(value[6]);
        player.card1 = Integer.parseInt(value[7]);
        player.card2 = Integer.parseInt(value[8]);
        player.showCard1 = Boolean.parseBoolean(value[9]);
        player.showCard2 = Boolean.parseBoolean(value[10]);
        player.handName = decode(value[11]);

        return player;
    }

    static String encode(String value) {
        Base64.Encoder encoder = Base64.getUrlEncoder().withoutPadding();
        byte[] bytes = value.getBytes(StandardCharsets.UTF_8);
        return encoder.encodeToString(bytes);
    }

    static String decode(String value) {
        if (value == null || value.isEmpty()) {
            return "";
        }

        Base64.Decoder decoder = Base64.getUrlDecoder();
        byte[] bytes = decoder.decode(value);
        return new String(bytes, StandardCharsets.UTF_8);
    }
}
