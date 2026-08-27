package ex1_work;

import java.util.Scanner;

public class Ex06_work {
    public static void main(String[] args) {
        // 정수 : 7
        // 7은(는) 소수입니다

        // 정수 : 10
        // 10은(는) 소수가 아닙니다

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int num = sc.nextInt();

        // int x = 1;

        // for (int i = 0; i <= num; i++) {
        //     x++;

        //     if (x == 2 || num % 2 != 0 && num % x == 0) {
        //         System.out.printf("%d은(는) 소수입니다.", num);

        //     } else if (x % 2 == 0 && x != 2) {
        //         System.out.printf("%d은(는) 소수가 아닙니다.", num);

        //     } else {
        //         System.out.printf("%d은(는) 소수가 아닙니다.", num);

        //     }

        // }

        int i = 2;
        for (; i <= num; i++) {
            if (num % i == 0)
                break;
        }

        if (i == num) {
            System.err.println(num + "은 소수입니다");
        } else {
            System.out.println(num + "은 소수가 아닙니다");
        }

    }// main
}// class
