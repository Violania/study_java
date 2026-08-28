package ex4_homework_srp;

import java.util.Random;
import java.util.Scanner;



public class Homework {
    public static void main(String[] args) {
        // 아이디를 입력하세요 : aaa
        // 새로운 아이디 생성
        // 0승, 0패, 0무
        // 가위(s) | 바위(r) | 보(p) ? : s
        // 이겼습니다.
        // 1승, 0패, 0무
        // 한판 더?? y | n : n
        // 게임이 종료되었습니다.
        // 기록저장

        // ----------------------------------------

        // 아이디를 입력하세요 : aaa
        // 로드성공
        // 1승, 0패, 0무
        // 가위(s) | 바위(r) | 보(p) ? : p

        //스트링 사용

        Scanner sc = new Scanner(System.in);
        User user = new User();
        System.out.print("아이디를 입력하세요 : ");
        String id = sc.next();

        if(!id.equals(user.getId())){
            UserWriter uw =new UserWriter();
            uw.writeInfo(user);
        }else{
           UserLorder ul = new UserLorder();
           user = ul.loadinfo(id);

           if(user != null){
            System.out.printf("%d승 %d무 %d패\n",user.getWin(),user.getDraw(),user.getLose());
           }

        }//if

        Random rnd = new Random();
        String [] qrcp = {"S","r","p"};
        System.out.println("가위(s) | 바위(r) | 보(p) ? : ");
        String rcp = sc.next();

        boolean yn = true;
        while (true) {
            int num = rnd.nextInt(3);

            switch (qrcp[num]) {
                case "s":
                    
                    break;
            
                default:
                    break;
            }
        }





    }//main
}//class
