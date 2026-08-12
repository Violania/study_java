package ex6_work;

import java.util.Scanner;

public class Ex05_work {
    public static void main(String[] args) {
        /*
         * 입력받은 두 수의 최소 공배수
         * --------
         * 수1 : 6
         * 수2 : 10
         * 최소 공배수 : 30
         */
        // 최소 공배수 = 두수의 곱/최대 공약수
        Scanner sc = new Scanner(System.in);
        System.out.print("수1 : ");
        int num1 = sc.nextInt();
        System.out.print("수2 : ");
        int num2 = sc.nextInt();

        int k = 0; 

        for (int i = 1; i <= num1; i++) {
            if (num1 % i != 0 || num2 % i != 0) {
                continue;
            }
            k = i;

        }

        int answer = (num1 * num2)/k;
        // System.out.println(num1 * i);
        System.out.print("최소공배수 : " + answer );

    }// main

}// class
