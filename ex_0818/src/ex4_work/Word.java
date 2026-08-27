package ex4_work;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");

        // 원본
        String str = sc.next();

        CheckWord cw = new CheckWord();
        String rev = cw.check( str );

        //StringBuffer sb = new StringBuffer(str);

        // 원본을 뒤집어서 저장하기위한 객체

        
        // String rev = sb.reverse().toString();
       

       

        if( str.equals(rev)){
                System.out.println(str + "은(는) 회문입니다");
            }else{
                System.out.println(str + "은(는) 회문이 아닙니다");


        }
    }
}
