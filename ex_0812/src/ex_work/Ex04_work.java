package ex_work;

import java.util.Scanner;

public class Ex04_work {
    public static void main(String[] args) {
        /*
         * 배열의 크기를 입력하세요 : 5
         * 정수1 : 6
         * 정수2 : 7
         * 정수3 : 11
         * 정수4 : 20
         * 정수5 : 31
         * -----------------
         * 홀수 개수 : 3
         * 짝수 개수 : 2
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요 : ");
        int num = sc.nextInt();

        int[] arr = new int[num];

        int odd = 0; // 홀수
        int even = 0; // 짝수

        for (int i = 0; i < num; i++) {
            System.out.printf("정수%d : ", i + 1);
            arr[i] = sc.nextInt();

            if (arr[i] % 2 != 0) {
                odd++;
            } else {
                even++;
            } // if

           // i++; 증가시키지 않도 반복되므로 삭제
        } // for

        System.out.println("----------------------");

        System.out.println("홀수 개수 : " + odd);
        System.out.println("짝수 개수 : " + even);

    }// main

}// class
