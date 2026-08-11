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

        Scanner sc = new Scanner(System.in);
        System.out.print("수1 : ");
        int num1 = sc.nextInt();
        System.out.print("수2 : ");
        int num2 = sc.nextInt();

        int k = 0; 

        out: for (int i = num1; i >= num1; i++)
            for (int j = num2; j >= num2; j++)
                if ((num1 * i) == (num2 * j)) {
                    k = num1 * i;
                    break out;
                    
                }
               // System.out.println(num1 * i);
                System.out.print("최소공배수 : " + k);

    }// main

}// class
