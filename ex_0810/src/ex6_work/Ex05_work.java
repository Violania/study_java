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
        // 최소 공배수 = 두수의 곱/최대 공약수 -->공식은 검색함
        Scanner sc = new Scanner(System.in);
        System.out.print("수1 : ");
        int num1 = sc.nextInt();

        System.out.print("수2 : ");
        int num2 = sc.nextInt();

        // 1
        int k = 0;

        for (int i = 1; i <= num1; i++) {
            if (num1 % i != 0 || num2 % i != 0) {
                continue;
            }
            k = i;

        }

        int answer = (num1 * num2) / k;
        // System.out.println(num1 * i);
        System.out.println("최소공배수 : " + answer);

        System.out.println("--------");
        // 2
        for (int i = 1; i <= num1 * num2; i++) {

            if (i % num1 == 0 && i % num2 == 0) {
                System.out.println("최소공배수 : " + answer);
                break;

            }
        }
        System.out.println("--------");

        // 3 유클리드 호제법으로 최소공배수 구하기

        int x = num1;
        int y = num2;

        while (y != 0) {
            int tmp = x % y;
            x = y;
            y = tmp;

        }

        int gcd = x; // 최대공약수

        int lcm = (num1 * num2) / gcd;

        System.out.println("최소공배수 : " + lcm);

    }// main

}// class
