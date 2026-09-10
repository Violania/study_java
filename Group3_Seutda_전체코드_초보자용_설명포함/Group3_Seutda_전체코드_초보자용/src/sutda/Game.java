package sutda;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/** 섯다의 라운드, 베팅, AI, 승패 판정을 담당합니다. */
public class Game {
    private static final int PLAYER_COUNT = 4;
    private static final long START_MONEY = 100_000_000L;
    private static final long ENTRY_FEE = 1_000L;
    private static final long BET_UNIT = 10_000L;
    private static final int BET_PHASES = 4;

    private final Random random = new Random();
    final List<Player> players = new ArrayList<>();
    private final GameEventListener listener;

    long accumulatedPot;
    boolean waitingForAction;
    private int roundCount = 1;
    private int firstPlayerIdx, currentPhase, turnOffset, lastRaiserOffset = -1;
    private long currentMultiplier = 1, targetCallAmount;
    private boolean rematchMode, roundFinished;

    public interface GameEventListener {
        void onStateChanged();
        void onStatusMessage(String message);
        void onRoundFinished(String resultSummary, String resultMessage);
        void onMidRoundCardReveal();
    }

    public Game(GameEventListener listener) {
        this.listener = listener;
    }

    /** 새 게임을 시작합니다. */
    public void initGame(String playerName) {
        players.clear();
        accumulatedPot = 0;
        roundCount = 1;
        firstPlayerIdx = 0;
        rematchMode = false;
        roundFinished = false;
        waitingForAction = false;

        players.add(new Player(playerName, true, START_MONEY));
        for (int i = 1; i < PLAYER_COUNT; i++) {
            players.add(new Player("플레이어 " + i, false, START_MONEY));
        }
        startNewRound();
    }

    public void nextRound() {
        if (!roundFinished) {
            return;
        }

        roundCount++;
        startNewRound();
    }

    /** 라운드 초기화, 입장료 지불, 카드 분배를 처리합니다. */
    private void startNewRound() {
        roundFinished = false;
        waitingForAction = false;
        if (!rematchMode) {
            accumulatedPot = 0;
        }
        removeBrokePlayers();

        int activeCount = 0;
        Player finalWinner = null;
        for (Player p : players) {
            if (!p.out) {
                activeCount++;
                finalWinner = p;
            }
        }

        if (activeCount <= 1) {
            roundFinished = true;
            if (listener != null) {
                String resultMessage;

                if (finalWinner == null) {
                    resultMessage = "무승부";
                } else {
                    resultMessage = "최후의 승자: " + finalWinner.name;
                }

                listener.onRoundFinished("게임 종료", resultMessage);
            }
            return;
        }

        if (activeCount == PLAYER_COUNT) {
            currentMultiplier = 1;
        } else {
            currentMultiplier = (long) Math.pow(3, PLAYER_COUNT - activeCount);
        }

        if (!rematchMode && (firstPlayerIdx >= players.size() || players.get(firstPlayerIdx).out)) {
            firstPlayerIdx = 0;
            while (firstPlayerIdx < players.size() && players.get(firstPlayerIdx).out) {
                firstPlayerIdx++;
            }
        }

        long entryFee = ENTRY_FEE * currentMultiplier;
        for (Player p : players) {
            if (p.out) {
                continue;
            }

            if (!rematchMode) {
                p.rematchTarget = true;
            }
            p.folded = false;
            p.currentBet = 0;
            if (!p.rematchTarget || rematchMode) {
                continue;
            }

            if (p.money < entryFee) {
                p.money = 0;
                p.out = true;
                p.rematchTarget = false;
                status(p.name + " 님이 입장료 부족으로 방에서 나갑니다.");
            } else {
                p.money -= entryFee;
                p.currentBet = entryFee;
                accumulatedPot += entryFee;
            }
        }
        removeBrokePlayers();

        List<Card> deck = Card.createDeck();
        Collections.shuffle(deck);
        int card = 0;
        for (int i = 0; i < players.size(); i++) {
            Player p = players.get((firstPlayerIdx + i) % players.size());
            if (!p.out && p.rematchTarget) {
                Card firstCard = deck.get(card);
                card++;

                Card secondCard = deck.get(card);
                card++;

                p.resetRound(firstCard, secondCard);
            }
        }

        currentPhase = 1;
        targetCallAmount = BET_UNIT * currentMultiplier;
        turnOffset = 0;
        lastRaiserOffset = -1;

        if (listener != null) {
            listener.onStateChanged();
        }
        status(roundCount + "라운드 시작 (배율: " + currentMultiplier
                + "배) - 선: " + players.get(firstPlayerIdx).name);
        processNextBetTurn();
    }

    /** 현재 차례를 확인합니다. */
    private void processNextBetTurn() {
        if (roundFinished) {
            return;
        }

        if (checkSinglePlayerWin()) {
            return;
        }
        if (lastRaiserOffset != -1 && turnOffset == lastRaiserOffset) {
            moveToNextBetPhase();
            return;
        }

        Player p = players.get((firstPlayerIdx + turnOffset) % players.size());
        if (p.out || !p.rematchTarget || p.folded) {
            turnOffset = (turnOffset + 1) % players.size();
            processNextBetTurn();
            return;
        }

        if (p.money <= 0) {
            p.money = 0;
            status(p.name + " : 올인 상태 (자동 통과)");
            if (lastRaiserOffset == -1) {
                lastRaiserOffset = turnOffset;
            }
            turnOffset = (turnOffset + 1) % players.size();
            processNextBetTurn();
            return;
        }

        long call = Math.max(0, targetCallAmount - p.currentBet);
        if (p.human) {
            waitingForAction = true;
            if (listener != null) {
            listener.onStateChanged();
        }
            status("당신의 차례입니다. (콜 금액: " + formatMoney(call) + ")");
        } else {
            startAiTurn(p, call);
        }
    }

    /** 다이하지 않은 플레이어가 한 명이면 기권승으로 끝냅니다. */
    private boolean checkSinglePlayerWin() {
        int count = 0;
        Player winner = null;
        for (Player p : players) {
            if (!p.out && p.rematchTarget && !p.folded) {
                count++;
                winner = p;
            }
        }
        if (count > 1) {
            return false;
        }

        roundFinished = true;
        if (winner != null) {
            winner.money += accumulatedPot;
            firstPlayerIdx = players.indexOf(winner);
        }
        rematchMode = false;
        for (Player p : players) {
            if (!p.out) {
                p.rematchTarget = true;
            }
        }

        if (listener != null) {
            String resultMessage;

            if (winner == null) {
                resultMessage = "무승부";
            } else {
                resultMessage = "🏆 승자: " + winner.name + " (기권승)";
            }

            listener.onRoundFinished("기권승 발생", resultMessage);
        }
        return true;
    }

    /** 다음 베팅 차수 또는 승패 판정으로 넘어갑니다. */
    private void moveToNextBetPhase() {
        if (currentPhase >= BET_PHASES) {
            finishRound();
            return;
        }

        int finishedPhase = currentPhase++;
        long maxBet = 0;
        for (Player p : players) {
            if (!p.out && p.rematchTarget && !p.folded) {
                maxBet = Math.max(maxBet, p.currentBet);
            }
        }

        targetCallAmount = Math.max(maxBet, BET_UNIT * currentMultiplier * currentPhase);
        turnOffset = 0;
        lastRaiserOffset = -1;
        status(finishedPhase + "차 베팅 종료. " + currentPhase + "차 베팅을 시작합니다.");

        if (finishedPhase == 2 && listener != null) {
            status("2차 베팅 종료! 생존한 상대 패가 한 장씩 공개됩니다.");
            listener.onMidRoundCardReveal();
        }
        processNextBetTurn();
    }

    /** AI가 0.5초 뒤 행동하게 합니다. */
    private void startAiTurn(final Player p, final long call) {
        waitingForAction = false;
        status(p.name + " 생각 중...");

        Thread aiThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        processAiAction(p, call);
                    }
                });
            }
        });
        aiThread.setDaemon(true);
        aiThread.start();
    }

    /** 카드 점수와 랜덤 값으로 AI의 행동을 고릅니다. */
    private void processAiAction(Player p, long call) {
        if (roundFinished) {
            return;
        }

        int score = Card.evaluate(p.card1, p.card2).rank.score;
        int choice = chooseAiAction(score);

        doAction(p, choice, call, false);
    }

    /** AI 카드 점수에 따라 행동을 고릅니다. */
    private int chooseAiAction(int score) {
        double randomValue = random.nextDouble();

        if (score < 80) {
            if (randomValue < 0.35) {
                return 2;
            }

            if (randomValue < 0.45) {
                return 3;
            }

            return 1;
        }

        if (score < 150) {
            if (randomValue < 0.10) {
                return 2;
            }

            if (randomValue < 0.30) {
                return 3;
            }

            return 1;
        }

        if (score >= 200 && randomValue < 0.45) {
            return 4;
        }

        return 3;
    }

    /** 사용자의 콜(1), 다이(2), 더블(3), 올인(4)을 받습니다. */
    public void humanAction(int choice) {
        if (roundFinished || !waitingForAction) {
            return;
        }

        waitingForAction = false;

        Player p = players.get((firstPlayerIdx + turnOffset) % players.size());
        long call = Math.max(0, targetCallAmount - p.currentBet);

        doAction(p, choice, call, true);
    }

    /** 사람과 AI가 같이 사용하는 베팅 처리입니다. */
    private void doAction(Player p, int choice, long call, boolean human) {
        if (choice == 2) {
            processFold(p, human);
        } else if (choice == 4) {
            processAllIn(p, human);
        } else if (choice == 3) {
            processDouble(p, call, human);
        } else {
            processCall(p, call, human);
        }

        if (p.money < 0) {
            p.money = 0;
        }

        if (listener != null) {
            listener.onStateChanged();
        }

        turnOffset = (turnOffset + 1) % players.size();
        processNextBetTurn();
    }

    /** 다이 행동을 처리합니다. */
    private void processFold(Player p, boolean human) {
        p.folded = true;

        if (human) {
            status("나는 다이했습니다.");
        } else {
            status(p.name + " : 다이");
        }
    }

    /** 올인 행동을 처리합니다. */
    private void processAllIn(Player p, boolean human) {
        long amount = p.money;

        p.money = 0;
        p.currentBet += amount;
        accumulatedPot += amount;

        long maxBet = getMaxOpponentCapacity(p);

        if (p.currentBet > maxBet) {
            long refund = p.currentBet - maxBet;
            p.currentBet -= refund;
            accumulatedPot -= refund;
            p.money += refund;

            if (human) {
                status("상대방 자산 한도를 초과하여 차액 " + formatMoney(refund) + "이 되돌아옵니다.");
            } else {
                status(p.name + " 님의 초과 금액 " + formatMoney(refund) + "이 되돌아옵니다.");
            }
        }

        targetCallAmount = Math.max(targetCallAmount, p.currentBet);
        lastRaiserOffset = turnOffset;

        if (human) {
            status("나는 올인!");
        } else {
            status(p.name + " : 올인!");
        }
    }

    /** 더블 행동을 처리합니다. */
    private void processDouble(Player p, long call, boolean human) {
        long wantedAmount = targetCallAmount * 2 - p.currentBet;
        long amount = Math.min(wantedAmount, p.money);
        long maxBet = getMaxOpponentCapacity(p);

        if (p.currentBet + amount > maxBet && maxBet > p.currentBet) {
            amount = maxBet - p.currentBet;
            targetCallAmount = maxBet;
        }

        p.money -= amount;
        p.currentBet += amount;
        accumulatedPot += amount;

        if (p.money == 0) {
            lastRaiserOffset = turnOffset;

            if (human) {
                status("나는 올인!");
            } else {
                status(p.name + " : 올인!");
            }

            return;
        }

        if (amount > call) {
            targetCallAmount = p.currentBet;
            lastRaiserOffset = turnOffset;

            if (human) {
                status("나는 더블! +" + formatMoney(amount));
            } else {
                status(p.name + " : 더블!");
            }

            return;
        }

        if (lastRaiserOffset == -1) {
            lastRaiserOffset = turnOffset;
        }

        if (human) {
            status("나는 콜! +" + formatMoney(amount));
        } else {
            status(p.name + " : 콜!");
        }
    }

    /** 콜 행동을 처리합니다. */
    private void processCall(Player p, long call, boolean human) {
        long amount = Math.min(call, p.money);

        p.money -= amount;
        p.currentBet += amount;
        accumulatedPot += amount;

        if (lastRaiserOffset == -1) {
            lastRaiserOffset = turnOffset;
        }

        if (human) {
            status("나는 콜! +" + formatMoney(amount));
        } else {
            status(p.name + " : 콜!");
        }
    }

    /** 상대방들이 낼 수 있는 최대 금액을 구합니다. */
    private long getMaxOpponentCapacity(Player actor) {
        long max = 0;
        boolean hasOther = false;
        for (Player p : players) {
            if (!p.out && p.rematchTarget && !p.folded && p != actor) {
                hasOther = true;
                max = Math.max(max, p.currentBet + p.money);
            }
        }
        if (hasOther) {
            return max;
        }

        return actor.currentBet + actor.money;
    }

    /** 족보를 비교하고 상금 또는 재경기를 처리합니다. */
    private void finishRound() {
        roundFinished = true;
        List<Player> contenders = new ArrayList<>();
        for (Player p : players) {
            if (!p.out && p.rematchTarget && !p.folded) {
                contenders.add(p);
            }
        }

        if (contenders.isEmpty()) {
            if (listener != null) {
                listener.onRoundFinished("결과 없음", "무승부");
            }
            return;
        }

        List<Card.Hand> hands = new ArrayList<>();
        boolean hasGwang = false, hasDdang = false, hasGusa = false, hasMungGusa = false;
        for (Player p : contenders) {
            Card.Hand hand = Card.evaluate(p.card1, p.card2);
            hands.add(hand);
            Card.Rank rank = hand.rank;
            if (rank == Card.Rank.GWANG_DDANG_1318) {
                hasGwang = true;
            }
            if (rank.score >= 110 && rank.score <= 190) {
                hasDdang = true;
            }
            if (rank == Card.Rank.GUSA) {
                hasGusa = true;
            }
            if (rank == Card.Rank.MUNG_GUSA) {
                hasMungGusa = true;
            }
        }

        int[] scores = new int[hands.size()];
        int highestOther = 0;
        for (int i = 0; i < hands.size(); i++) {
            Card.Rank rank = hands.get(i).rank;
            int score = rank.score;
            if (rank == Card.Rank.AMHAENG_EOSA && hasGwang) {
                score = 290;
            }
            if (rank == Card.Rank.DDANG_JABI && hasDdang) {
                score = 195;
            }
            scores[i] = score;
            if (rank != Card.Rank.GUSA && rank != Card.Rank.MUNG_GUSA) {
                highestOther = Math.max(highestOther, score);
            }
        }

        String rematch = null;
        if (hasMungGusa && highestOther <= 190) {
            rematch = "멍텅구리 구사 발동";
        } else if (hasGusa && highestOther <= 90) {
            rematch = "구사 발동";
        }

        StringBuilder summary = new StringBuilder("결과 | ");
        for (int i = 0; i < contenders.size(); i++) {
            summary.append(contenders.get(i).name)
                    .append(" ")
                    .append(handName(hands.get(i).rank, hasGwang, hasDdang, rematch))
                    .append(" · ");
        }

        if (rematch != null) {
            rematchMode = true;
            for (Player p : players) {
                p.rematchTarget = contenders.contains(p);
            }
            if (listener != null) {
                listener.onRoundFinished(summary.toString(), "🔁 " + rematch + " - 판돈 이월 후 재경기");
            }
            return;
        }

        int best = Integer.MIN_VALUE;
        List<Integer> winners = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > best) {
                best = scores[i];
                winners.clear();
                winners.add(i);
            } else if (scores[i] == best) {
                winners.add(i);
            }
        }

        rematchMode = false;
        for (Player p : players) {
            if (!p.out) {
                p.rematchTarget = true;
            }
        }

        long share = accumulatedPot / winners.size();
        long remainder = accumulatedPot % winners.size();
        StringBuilder names = new StringBuilder();
        for (int i = 0; i < winners.size(); i++) {
            Player p = contenders.get(winners.get(i));
            p.money += share;

            if (i == 0) {
                p.money += remainder;
            }
            if (i > 0) {
                names.append(", ");
            }

            names.append(p.name);
        }

        Player winner = contenders.get(winners.get(0));
        firstPlayerIdx = players.indexOf(winner);
        if (listener != null) {
            if (winners.size() > 1) {
                listener.onRoundFinished(summary.toString(), "🤝 동점: " + names + " - 팟 균등 분배");
            } else {
                listener.onRoundFinished(summary.toString(), "🏆 승자: " + winner.name + " ("
                        + handName(hands.get(winners.get(0)).rank, hasGwang, hasDdang, null) + ")");
            }
        }
        removeBrokePlayers();
    }

    private String handName(Card.Rank rank, boolean hasGwang, boolean hasDdang, String rematch) {
        if (rank == Card.Rank.AMHAENG_EOSA && !hasGwang) {
            return "1끗";
        }

        if (rank == Card.Rank.DDANG_JABI && !hasDdang) {
            return "망통";
        }

        if ((rank == Card.Rank.GUSA || rank == Card.Rank.MUNG_GUSA) && rematch == null) {
            return "3끗";
        }

        return rank.name;
    }

    private void removeBrokePlayers() {
        for (Player p : players) {
            if (!p.out && p.money <= 0) {
                p.money = 0;
                p.out = true;
                p.rematchTarget = false;
                status(p.name + " 님의 보유금이 0원이 되어 방에서 나갑니다.");
            }
        }
    }

    /** 금액을 천 단위 쉼표가 있는 문자열로 바꿉니다. */
    private String formatMoney(long money) {
        return String.format("%,d원", money);
    }

    private void status(String message) {
        if (listener != null) {
            listener.onStatusMessage(message);
        }
    }
}
