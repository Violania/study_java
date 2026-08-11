package ex6_work;

import java.util.Scanner;

public class Ex01_work {
    public static void main(String[] args) {

        /*
         * 1~100의숫자중
         * 키보드에서 입력받은 수보다 큰 첫번쨰
         * 3의 배수를 찿아 출력
         * -----------------------------------------
         * 입력 : 20
         * 20보다 큰 첫번째 3의 배수 : 21 *
         */

        // 1
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int num = sc.nextInt();
        /*
        out: for (int i = 1; i <= 100; i++) { 
            if (num < i && i % 3 == 0) {
                System.out.printf("%d보다 큰 첫번째 3의 배수 : %d", num, i);
                break out;

            }
        }
        */
       for (int i = num  + 1; i <= 100; i++) { 
            if ( i % 3 == 0) {
                System.out.printf("%d보다 큰 첫번째 3의 배수 : %d", num, i);
                break;

            }
        }

        // 2

    }// main

}// class
