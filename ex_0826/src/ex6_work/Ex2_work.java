package ex6_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {

        // 5개의 문장을 입력받아 ArrayList에 저장하고
        // 가장 긴 문자열을 찿아서 출력
        // ----------------------------------
        // 입력 : aaa
        // 입력 : bbbb
        // .......
        // 입력 : cccccc
        // 가장 긴 문자열 : cccccc

        List<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("입력 : ");
            list.add(sc.next());
           
        }//for

        String str = list.get(0);
        for (int i = 0; i < 5; i++) {

            if (str.length() < list.get(i).length()) {
                str = list.get(i);
            }

        }//for

        System.out.println("가장 긴 문자열 : " + str);
    }//main
}
