package ex_work;

import java.util.Scanner;

public class Ex6_work {
    public static void main(String[] args) {
        // 문장 : ababcac
        // 결과 : abc
        // .indexO('f') --> -1 참고

        Scanner sc = new Scanner(System.in);
        System.out.print("문장 : ");
        String str = sc.next();

        String sum = "";
        // int n = 0;
        for (int i = 0; i < str.length(); i++) {

            char curr = str.charAt(i);

            if (sum.indexOf(curr) == -1) {
                sum += curr;// 핵심

                // n = str.indexOf(n);
                // sum += str.charAt(n);
            }

        }

        System.out.println("결과 : " + sum);
    }// main
}// class
