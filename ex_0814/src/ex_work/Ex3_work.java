package ex_work;

import java.util.Scanner;

public class Ex3_work {
    public static void main(String[] args) {

        // 키보드에서 아무 값이나 입력받는다
        // 입력받은 문자열에 소문자 a의 갯수를 출력
        // ------------------------------------
        // 입력 : qwertyasdfgh
        // a의 갯수 : 1

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");

        int cnt = 0;
        String num = sc.next();

        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == 'a') {
                cnt++;
            }

        }
        System.out.printf("a의 갯수 : %d", cnt);

        // char anum = num.charAt(6); //이건 n번째의 문자인데

        // String[] anum = num.split("a");
        // System.out.printf("a의 갯수 : %d",anum.length - 1);

    }// main
}// class
