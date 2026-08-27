package ex6_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex1_work {
    public static void main(String[] args) {

        // ArrayList arr에 1~30사이의 난수를 5개 추가
        // arr에 담겨진 값중 가장 큰 값 출력

        // [16,13,29,29,14]
        // 가장 큰 값

        List<Integer> arr = new ArrayList<Integer>();
        Random rnd = new Random();

        int n = 0;
        for (int i = 0; i < 5; i++) {
            n = rnd.nextInt(30) + 1;
            arr.add(n);

        }//for

        System.out.println(arr);

        int bigger = 0;// int bigger = arr.get(0);
        for (int i = 0; i < 5; i++) {
            if (arr.get(i) > bigger)
                bigger = arr.get(i);
        }//for

        System.out.println("가장 큰 값 : " + bigger);

    }//main
}//class
