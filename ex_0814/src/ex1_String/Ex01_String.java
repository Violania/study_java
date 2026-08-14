package ex1_String;

import java.util.Scanner;

public class Ex01_String {
    public static void main(String[] args) {
        // String 클래스의 두가지 특징
        // 1) 객체 생성방법이 2가지(암시적, 명시적)
        // 2) 한 번 생성된 문자열의 내용은 변하지 않는다

        String s1 = "abc"; //객체 암시적 객체생성
        String s2 = "abc"; //s1과 heap메모리를 공유함(암시적 객체생성 = 오직String만 가능함)
        String s3 = new String("abc"); //( 명시적 객체생성) 기존과 공유 x 새로 생성함
        String s4 = new String("abc");
        
        // ==은 객체간 비교에서는 주소값 비교를 한다
        if( s1 == s3){
            System.out.println("주소가 같습니다");
        }else{
            System.out.println("주소가 다릅니다");// 같아보이는 abc이지만 heap메모리에서 다름(주소가 다름)
        }

        //String클래스의 불변의 법칙
        String greet ="안녕";
        greet += "하세요";// "안녕하세요"로 주소새로 생성됨
        System.out.println(greet);

        Scanner sc = new Scanner(System.in);
        System.out.print("연산자 : ");
        String op = sc.next();
        
        if(op == "+"){
            System.out.println("+연산 할게요");
        }// 주소가 달라서 연산불가
        if(op.equals("+")){// String끼리 내용을 비교할때 사용

            System.out.println("+연산 할게요");
        }


    }// main
}// class
