package ex_work;

import java.util.Scanner;

public class Ex01_work {
    public static void main(String[] args) {
        // 키보드에서 입력받은 값이 회문인지 판단
        // ----------------
        // 입력 : abcba
        // abcba은(는) 회문입니다
        // 입력 : abca
        // abca은(는) 회문이 아닙니다

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length(); j >= 0; j--) {

                if (str.charAt(i) == (str.charAt(j))) {
                    System.out.printf("%s은(는) 회문입니다", str);
                } else {
                    System.out.printf("%s은(는) 회문이 아닙니다", str);
                    
                }

            }

        }

    }

}
