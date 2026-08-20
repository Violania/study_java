package ex7_work;

import java.util.Random;
import java.util.Scanner;

public class UpdownMain {
    public static void main(String[] args) {

        // 1~50사이의 난수 생성하고
        // 키보드에서 입력받은 정수를 난수와 비교
        // -------------------
        // 정수 : 30
        // DOWN
        // 정수 : 15
        // UP
        // 정수 : 25
        // 3회만에 정답

        int answer = new Random().nextInt(50) + 1;
        Scanner sc = new Scanner(System.in);
        // int cnt = 1;
        // for (int i = 0; i <= 50; i++) {
        // cnt++;
        // System.out.print("정수 : ");
        // int num = sc.nextInt();
        // if (num < answer) {
        // System.out.println("UP");
        // cnt++;

        // } else if (num > answer) {
        // System.out.println("DOWN");
        // cnt++;

        // } else {
        // System.out.println(cnt + "회 만에 정답");
        // }

        // // Updownsub ud = new Updownsub();
        // // int goal = ud.game(answer, num);

        // // if(goal == answer){
        // // System.out.println(goal);
        // // break;
        // }

        // int num = 0;
        // int cnt = 0;

        // while (num != answer) {
        // System.out.print("정수 : ");
        // num = sc.nextInt();

        // if (num < answer) {
        // System.out.println("UP");
        // cnt++;

        // } else if (num > answer) {
        // System.out.println("DOWN");
        // cnt++;
        // }
        // }
        // System.out.println(cnt + "회 만에 정답");

        int select = 0;
        boolean check = true;

        Updownsub us = new Updownsub();

        do {

            System.out.print("정수 : ");
            select = sc.nextInt();
            us.check(select);

        } while (check);

    }

}
