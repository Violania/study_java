package ex_work;

import java.util.Random;

public class Ex09_work {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        /*
         * 1에서 45 사이의 난수 6개를 출력하는
         * 로또번호 생성기 만들기
         * (테스트용으로 1`6잡으면 중복 없는거 확인가능)
         * ------------------------
         * 17 2 45 27 3 11
         */
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < lotto.length; i++) {
            int lucky = new Random().nextInt(6 - 1 + 1) + 1;
            num1 = lucky;
            for (int j = 0; j < lotto.length; j++) {
                int lucky2 = new Random().nextInt(6 - 1 + 1) + 1;
                num2 = lucky2;

                if (num1 == num2) {
                    continue;
                } else {
                    num1 = lotto[i];
                }

            }
        }

        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i]);
        }

    }// main

}// class
