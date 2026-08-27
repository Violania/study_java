package ex4_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01_work {
    public static void main(String[] args) {

        // id : aaa
        // aaa 회원

        // id : bbb
        // aaa 회원
        // bbb 회원

        // id : aaa
        // aaa회원은 이미 존재함
        // id :

        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>();

        while (true) {
            System.out.print("id : ");
            String id = sc.next();

            if (list.contains(id)) {
                System.out.println(id + "회원은 이미 존재함");
                continue;
            } else {
                list.add(id);

                // 전체회원
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i) + "회원");
                } // for

            } // if
        } // while

        // 중복체크 2
        // outer : while (true) {
        // System.out.print("id : ");
        // String id = sc.next();

        // for (int i = 0; i < list.size(); i++) {

        // if(id.equals(list.get(i))){
        // System.out.println(id + "회원은 이미 존재함");
        // continue;
        // }
        // list.add(id);

        // // 전체회원
        // for (int i = 0; i < list.size(); i++) {
        // System.out.println(list.get(i) + "회원");
        // } // for

        // }

    }// main
}
// class
