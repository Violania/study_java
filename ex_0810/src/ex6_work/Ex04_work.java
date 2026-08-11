package ex6_work;

import java.util.Scanner;

public class Ex04_work {
    public static void main(String[] args) {
        /*
         * 키보드에서 입력받은 두개의 수중 최대공약수 출력
         * ------------
         * 수1 : 10   //18
         * 수2 : 4    //12
         * 최대공약수 : 2   //6
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("수1 : ");
        int num1 = sc.nextInt();
        System.out.print("수2 : ");
        int num2 = sc.nextInt();
        
        int k = 0;

        for(int i = 1; i <= num1; i++ ){
            if((num1 % i) == 0 && (num2 % i) ==0 ){
                k = i;
            }
            
        }
        
        System.out.printf("최대공약수 : %d",k);
    }// main

}// class
