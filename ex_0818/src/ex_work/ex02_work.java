package ex_work;

import java.util.Scanner;

public class ex02_work {
    public static void main(String[] args) {

        // 검색 : 조인성
        // [조인성]
        // 모가디슈
        // 호프

        // 검색 : ㅁㅁㅁㅁㅁ
        // 해당 배우의 정보가 없습니다

        String[][] actor = { { "[송강호]", "박쥐", "괴물", "관상" },
                { "[조인성]", "모가디슈", "호프" },
                { "[이병헌]", "레드", "광해", "놈놈놈" } };

        Scanner sc = new Scanner(System.in);
        System.out.print("검색 : ");
        String name = sc.next();

        out: for (int i = 0; i < actor.length; i++) {

            String name1 = actor[i][0].substring(1, 4);// ['ㅁㅁㅁ'] 0'123'4
            for (int j = 0; j < actor[i].length; j++) {

                if (name1.equals(name)) {
                    System.out.println(actor[i][j]);
                }

            }
            
            if (name != name1) {
                
                System.out.println("해당 배우의 정보가 없습니다");
                break out;
            }
            System.out.println();
        }
    }// main

}
