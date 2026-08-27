package ex_work;

import java.util.Scanner;

public class Ex7_work {
    public static void main(String[] args) {

        // 키보드에서 아무 밗이나 입력받고
        // 숫자인지 아닌지를 판단하기
        // ----------------------------------
        // 값 : 123
        // 123은(는) 숫자입니까? true

        // 값 : a12
        // a12은(는) 숫자입니까? false

        Scanner sc = new Scanner(System.in);
        System.out.print("값 : ");
        String str = sc.next();

        int i = 0;
        for (; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch < '0' || ch > '9')
                ;
            break;
        }

        if (i == str.length()) {
            System.out.printf("%s은(는) 숫자입니까?  true", str);
        } else {
            System.out.printf("%s은(는) 숫자입니까?  false", str);
        }

       

        // if (Integer.parseInt(str)) {
        //     System.out.printf("%s은(는) 숫자입니까?  true", str);

        // } else {
        //     System.out.printf("%s은(는) 숫자입니까?  false", str);
        // }

    }// main
}// class
