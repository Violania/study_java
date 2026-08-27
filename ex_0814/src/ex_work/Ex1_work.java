package ex_work;

import java.util.Random;
import java.util.Scanner;

public class Ex1_work {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] com = new int[3];// 정답용 index
        int[] user = new int[3];// 입력용 index

        // 세자리 난수 생성
        outer: for (int i = 0; i < com.length;) {
            com[i] = new Random().nextInt(9) + 1;

            // 중복값 비교
            for (int j = 0; j < i; j++) {

                if (com[i] == com[j]) {
                    continue outer;
                }
            } // inner

            i++;

        } // outer

        // 임시 정답 확인용
        System.out.println("정답 : " + com[0] + com[1] + com[2]);

        // 반복횟수 확인
        int cnt = 0;

        // 게임진행용 반복문
        while (true) {

            cnt++;

            System.out.print("세자리 수를 입력하세요 : ");
            int num = sc.nextInt();

            user[0] = num / 100;
            user[1] = num / 10 % 10;
            user[2] = num % 10;

            int strike = 0;
            int ball = 0;

            // 카운트 판정용
            for (int i = 0; i < user.length; i++) {
                for (int j = 0; j < user.length; j++) {

                    if (i == j) {
                        if (com[i] == user[j]) {
                            strike++;
                        }

                    } else {
                        if (com[i] == user[j]) {
                            ball++;

                        }

                    } // if

                } // inner 카운트
            } // outer 카운트
            

            // 정답처리
            if (strike == 3) {
                System.out.println("정답! - " + com[0] + com[1] + com[2]);
                System.out.println(cnt + "회 클리어");
                break;

            } else {
                if (strike > 0 || ball > 0) {
                    System.out.printf("%d Strike %d Ball", strike, ball);
                } else {
                    System.out.println("OUT");
                }
            } // if
            System.out.println("-------------------"); // 구분선

        } // while

        // 내코드

        // for (int i = 0; i < com.length; i++) {
        // for (int j = 0; j < com.length; j++) {

        // }

        // }

    }// main
}// class
