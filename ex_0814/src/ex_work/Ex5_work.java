package ex_work;

import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {
        // 문장 : HelloWorld
        // Hlool

        Scanner sc = new Scanner(System.in);
        System.out.print("문장 : ");

        String str = sc.next();
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                answer += str.charAt(i);
            }
        }
        // for (int i = 0; i < str.length(); i+=2) {
         
        //         answer += str.charAt(i);
            
        // }
        
        System.out.println(answer);
    }// main
}// class
