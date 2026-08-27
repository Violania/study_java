package ex2_random;

import java.util.Random;

public class Ex1_random {
    public static void main(String[] args) {

        // new Random().nextInt(난수의 범위) + 시작수;
        // new Random().nextInt(큰수- 작은수 +1 ) + 시작수;
        // 216~13798사이의 난수
        // int num = new Random().nextInt(7) + 7;

        int num = new Random().nextInt(1378 - 216 + 1) + 216;

        System.out.println(num);

        // 2~9사이의 난수에 해당하는 구구단

        int dan = new Random().nextInt(9 - 2 + 1) + 2;
        if (dan <= 1 || dan >= 10) {
            System.out.println("2~9 사이의 값을 입력하십시오.");
        } else {
            for (int i = 2; i <= 9; i++) {
                System.out.println(dan + " * " + i + " = " + (dan * i) );
            }

        }

    }// main
}// class
