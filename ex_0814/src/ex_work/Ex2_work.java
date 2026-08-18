package ex_work;

import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {

        // 이메일 : abc@korea.com
        // 이메일 형식 오류

        // 이메일 : aabbcc@korea.com
        // aabbcc님 환영합니다

        Scanner sc = new Scanner(System.in);
        System.out.print("이메일 : ");

        String email = sc.next();

        // @를 기준으로 문자열을 나눔(이메일 주소를 분할하여 sp배열에 담는다) [0]@[1]
        String[] sp = email.split("@");

        String res = sp[0];

        if (res.length() < 4 || res.length() > 8) {
            System.out.println("이메일 형식이 올바르지 않음");

        } else {
            System.out.println(res + "님 환영합니다");
        }

    }// main
}// class
