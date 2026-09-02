package ex3_socket;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer extends Thread {

    ServerSocket ss;
    List<CopyClient> list;

    public ChatServer() {

        try {

            list = new ArrayList<CopyClient>();

            ss = new ServerSocket(3500);
            System.out.println("서버시작");

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public void run() {

        while (true) {

            try {

                // 접속자를 기다린다
                Socket s = ss.accept();
                String ip = s.getInetAddress().getHostAddress();
                System.out.println(ip + "님 접속");

                //방금 접속한 클라이언트의 복사본을 만들어서
                //리스트에 탑재
                CopyClient cc = new CopyClient(s, this);
                list.add(cc);
                cc.start();

            } catch (Exception e) {
                // TODO: handle exception
            }

        }

    }// run

    //접속한 모든 사용자가 메시지르 받을수 있도록 하자
    public void sendMessage (String msg){

        try {
            for(CopyClient cc : list){
                cc.out.println(msg);
            }//for

        } catch (Exception e) {
            // TODO: handle exception
        }
    }//sendMessage

    //다른 사용자들에게 종료를 알리고 list에서 클라이언트를 제거
    public void removeClient(CopyClient cc){

        list.remove(cc);
        sendMessage(cc.ip+"님이 퇴장하셨습니다");
    }

    

}
