package ex11_work;

import java.util.Random;
import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {

        // 문제 : PEALP
        // >>ealpp
        // ealpp오답
        // >>apple
        // apple정답!!

        // String[] strArr = { "APPLE", "ORANGE", "HOPE", "VIEW" };
        // Random rnd = new Random();
        // int num = rnd.nextInt(3) + 0;
        // String question = strArr[num];

        // System.out.println(question);// 임시로 랜덤 배열값을 가져옴

        // //문자 배열 섞기
        
        // StringBuffer rq = new StringBuffer("");
        // rq.setLength(0);
        // for (int i = 0; i < question.length(); i++) {
        //     int q2 = rnd.nextInt(question.length());
        //    rq.append(question.charAt(q2));
            
        // }

        // System.out.println(rq);

        

        //question.charAt(num)


        // 2
        WorkSub ws = new WorkSub();

        //정답단어
        String answer = ws.getAnswer();

        //정답을 섞어서 문제로 만들기
        String question = ws.scrambleWord(answer);

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print(">>");
            String str = sc.next();

            if (str.equalsIgnoreCase(answer)) {
                System.out.println(str + "은 정답입니다");        
                break;    
            }else{
                System.out.println(str + "은 정답이 아닙니다");
            }
            
        }
        

    }
}
