package ex6_work;

import java.util.Scanner;

public class GradeMain {
    public static void main(String[] args) {

        // 등급기준
        // vip 10%
        // gold 5%
        // silver 3%

        // 키보드에서 구매금액과 등급을 입력받고 적립포인트를 계산
        // ----------------------------
        // 구매금액 : 10000
        // 등급 : vip
        // 적립포인트 : 1000

        //구매금액 : 1000
        // 등급 : aaa
        // 회원등급이 올바르지 않습니다
        // 적립포인트 : 0


        Scanner sc = new Scanner(System.in);
        System.out.print("구매금액 : ");
        int cash = sc.nextInt();
        
        System.out.print("등급 : ");
        String usergrade = sc.next();

        
        Gradesub user = new Gradesub();
        int point = user.userpoint(cash, usergrade);

        System.out.println("적립포인트 : "+ point);



    }// main
}
