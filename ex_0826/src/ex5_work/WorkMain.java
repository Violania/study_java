package ex5_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {

        // id : aaa
        // pw : 1111
        // aaa/1111
        // ------------------
        // id : bbb
        // pw : 2222
        // aaa/1111
        // bbb/2222

        // id : bbb
        // pw : 1111
        // 아이디가 중복됩니다

        // 1my(실행시에만 같아보임)
        // Scanner sc = new Scanner(System.in);
        // List<String> list = new ArrayList<String>();
        // List<Integer> list2 = new ArrayList<Integer>();

        // while (true) {
        // System.out.print("id : ");
        // String id = sc.next();
        // System.out.print("pw : ");
        // int pw = sc.nextInt();

        // if (list.contains(id)) {
        // System.out.println(id + "회원은 이미 존재함");
        // continue;
        // } else {
        // list.add(id);
        // list2.add(pw);
        // }

        // for (int i = 0; i < list.size(); i++) {
        // System.out.printf("%s / %d \n",list.get(i),list2.get(i));

        // }

        // }

        // 2
        Scanner sc = new Scanner(System.in);
        List<User> list = new ArrayList<User>();

        out: while (true) {
            System.out.print("id : ");
            String id = sc.next();

            System.out.print("pw : ");
            int pw = sc.nextInt();

            User us = new User();// 이부분이 없으면 참조하는 내용이 같아서 문제 발생
            us.setId(id);
            us.setPw(pw);

            //중복체크
            for (int i = 0; i < list.size(); i++) {
                if (id.equals(list.get(i).getId())) {
                    System.out.println(id + "아이디가 중복됩니다");
                    continue out;
                }
                
            }
            list.add(us);

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i).getId() + "/" + list.get(i).getPw());
            }

            System.out.println("--------------------");
        }

    }
}
