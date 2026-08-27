package ex10_work;

import java.util.Scanner;

public class Ex3_Work {
    public static void main(String[] args) {
        // 입력받은 각 자리수의 합을 출력하는 예제
        // --------------
        // 입력 : 358
        // 결과 : 16

        // 입력 : 12a
        // 입력한 값은 정수가 아닙니다

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String str = sc.next();

        try {
            int n = Integer.parseInt(str);
            int sum = 0;

            while (n>0) {
                sum += n%10;
                n/=10;
                
            }
            System.out.println("결과 : " + sum);

        } catch (Exception e) {
            System.out.println("입력값이 숫자가 아님");
        }

    }
}
