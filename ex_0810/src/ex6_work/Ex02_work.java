package ex6_work;

import java.util.Scanner;

public class Ex02_work {
    public static void main(String[] args) {

        /*
        1부터 사용자가 입력한 숫자까지 
        3의 배수의 갯수, 5의 배수의 갯수를 출력
        ----------------------------------
        정수 : 70
        3의 배수 : 23
        5의 배수 : 14
         */
        
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int num = sc.nextInt();
/* 나의 코드(개선전)
        for(int i = 1; i <= num; i++){
            if(i % 3 == 0){
               int j = num / 3;
               System.out.printf("3의 배수 : %d\n" , j);
            }
            if(i % 5 == 0){
                int j = num / 5;
                System.out.printf("5의 배수 : %d\n" , j);
            }
        }
*/

        int cnt3 = 0;
        int cnt5 = 0;

        for(int i = 1; i <= num; i++){
            if(i%3==0)
                cnt3++;

            if(i%5==0)
                cnt5++;      
        }

        System.out.printf("3의 배수 : %d \n5의 배수 : %d \n", cnt3, cnt5);
    }//main
}//class
