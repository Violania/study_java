package ex2_while;

import java.util.Random;
import java.util.Scanner;

public class Ex3_while {
    public static void main(String[] args) {
        /*
         * 1 ~ 100 사이의 난수를 만들고
         * 키보드에서 입력받은 값이 정답일떄 게임을 종료
         * ------------------------------------------
         * 숫자 : 25
         * UP
         * 숫자 : 60
         * DOWN
         * 숫자 : 50
         * 정답입니다
         */

        Scanner sc = new Scanner(System.in);
        int answer = new Random().nextInt(100 - 1 + 1) + 1;
        System.out.println(answer);
        int in = 0;

        while (in != answer) {

            System.out.print("숫자 : ");

            in = sc.nextInt();

            if (in < answer) {
                System.out.println("UP");
            } else if (in > answer) {
                System.out.println("DOWN");
            }
        }
        System.out.println("정답입니다");

    }// main
}// class
