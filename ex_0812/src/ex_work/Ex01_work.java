package ex_work;

import java.util.Scanner;

public class Ex01_work {
    public static void main(String[] args) {
        /*
         * 입력 : 5
         * 배열5
         * A~E
         * 출력
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int num = sc.nextInt();

        /*
         * char[] arr;
         * arr = new char [num];
         */

        //1
        char[] arr = new char[num];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = (char) ('A' + i);
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("-----------------");

        char[] carr = new char[num];
        char ch ='A';

        for(int i = 0;i < num; i++){
            
            System.out.print((carr[i]= ch++) + " ");
        }

    }// main

}// class
