package ex_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {

        // 키보드에서 입력받은 ox값을 계산하여 출력하기
        // (o = +1(연속시 +n) x는 n값 초기화)
        // -----------------
        // 입력 : ooxxo
        // 결과 : 4

        Scanner sc = new Scanner(System.in);

        System.out.print("입력 : ");
        String ox = sc.next();

        int answer = 0;
        int cnt = 0;

        for (int i = 0; i < ox.length(); i++) {
            if (ox.charAt(i) != 'o' && ox.charAt(i) != 'x') {
                System.out.println(" o 또는 x를 입력하십시오");
            } else if (ox.charAt(i) == 'o') {
                cnt++;
            } else {
                cnt = 0;
            }
            answer += cnt;
        }
        System.out.println("결과 : " + answer);

    }// main
}// class
