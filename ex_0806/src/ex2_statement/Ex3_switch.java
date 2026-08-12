package ex2_statement;

public class Ex3_switch {
    public static void main(String[] args) {

        char name = '김';

        switch (name) { // 비교값

            case '김':
                System.out.println("1000만");
                //break;

            case '이':
                System.out.println("730만");
                //break;

            case '박':
                System.out.println("419만");
                //break;
            
            default:
                System.out.println("데이터가 없습니다");
                break;

        }

    }// main

}// class
