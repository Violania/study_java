package ex3_scanner;

import java.util.Scanner;


// 줄변경 alt 방향키,, 복사 alt shift

public class Ex1_scanner {
    public static void main(String[] args) {

        /*
        키보드에서 갑을 받기위한 scanner객체
        */
        Scanner sc = new Scanner(System.in); //키보드에서 값을 받는 문제에서 사용 할 것 //ctrl space로 임포트
   

        System.out.print("정수 : "); //ln이 엔터의 역활
        int n = sc.nextInt();
        System.out.println("값 : " + n);

        System.out.print("문자열 : ");
        String s = sc.next();
        System.out.println("값 : " + s);
    }//main
    
}//class
