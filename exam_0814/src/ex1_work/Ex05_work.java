package ex1_work;

import java.util.Scanner;

public class Ex05_work {
    public static void main(String[] args) {
        // 정수n1, n2를 입력받고
        // n1 ~ n2사이의 합을 출력
        // -----------------------
        // 수1 : 2
        // 수2 : 5
        // 결과 : 14

        // 수1 : 5
        // 수2 : 2
        // 결과 : 14

        Scanner sc = new Scanner(System.in);

        System.out.print("정수1 : ");
        ;
        int num1 = sc.nextInt();

        System.out.print("정수2 : ");
        ;
        int num2 = sc.nextInt();

        int total = 0;

        if (num2 < num1) {
            int res = num1;
            num1 = num2;
            num2 = res;
        }
        for (int i = num1; i <= num2; i++) {          
                total += i;           
        }
        System.out.println("결과 : " + total);

    }

}
