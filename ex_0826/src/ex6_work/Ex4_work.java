package ex6_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {

        // ArrayListd에 색상정보를 랜덤으로 10개담기
        // 담긴 값들 중,내가 입력박은 문장과 동일한 값이
        // 몇 번째 index에 있는지 찿아내서 출력
        // ----------------------
        // 찿을 색상 : yellow
        // [RED,BLUE,BLUE,YELLOW,......]
        // yellow의 모든 index : [3,5]

        String[] str = { "RED", "GREEN", "BLUE", "YELLOW" };
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        List<String> list = new ArrayList<String>();
        List<Integer> reslist = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            int n = rnd.nextInt(str.length);
            list.add(str[n]);
        }

        System.out.println(list);

        System.out.print("찿을 색상 : ");
        String color = sc.next();

        for (int i = 0; i < list.size(); i++) {
            if (color.equalsIgnoreCase(list.get(i))) {
                reslist.add(i);

            }

        }
        System.out.println(reslist);
    }
}
