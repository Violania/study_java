package ex02_work;

import java.util.Scanner;

public class Encodemain {
    public static void main(String[] args) {
        // 입력 : abc123
        // 결과 : `~!wer
        
        // 입력 : jk56
        // 결과 : *(yu

       

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String code = sc.next();

        Encodesub ec = new Encodesub();
        String encode = ec.encoding(code);
        System.out.println("결과 : "+ encode);


    }
}
