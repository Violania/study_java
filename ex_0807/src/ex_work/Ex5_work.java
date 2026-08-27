package ex_work;

import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {

        /*
         * 정수 n1, n2를 입력받고 n1~n2사이의 합을 출력
         * 수1 : 2
         * 수2 : 5
         * 결과 : 14
         * 
         * 수1 : 5
         * 수2 : 2
         * 결과 : 14
         * 
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("수1 : ");
        int n1 = sc.nextInt();

        System.out.print("수2 : ");
        int n2 = sc.nextInt();
        int result1 = 0; // 결과 출력용 변수

        // n1과 n2의 값을 교환
        if (n1 > n2) {
            int n3 = n1; // 지역변수를 이용해서 n3에 n1값을 저장 n1 = 5 n2 = 2 => n1 = 2 n2 = 5 n3 =5
            n1 = n2;
            n2 = n3;
        }

        for (int i = n1; i <= n2; i++) {
            result1 += i;
        } // for

        /*
         * for(int i = n1; i <= n2 || (i <= n2) && (i >= n1); i++ ){
         * result1 += i;
         * }//for
         */
        // ( 수1이 2보다 작을경우 해결실패)

        System.out.println("결과 : " + result1);
    }// main
}// class
