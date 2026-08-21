package ex_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {

        //1부터 키보드에서 받은 값(n)까지의 합을 출력

        //입력 : 5
        //결과 : 15

        Scanner sc = new Scanner(System.in);
        System.out.printf("입력 : ");
        int n = sc.nextInt();
        int result = 0;
        for ( int i = 1; i <= n; i++) {
            result += i;
        }
         System.out.printf("결과 : %d\n", result );

         
    }//main
}//class
