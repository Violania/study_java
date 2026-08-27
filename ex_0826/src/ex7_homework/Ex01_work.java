package ex7_homework;

import java.util.ArrayList;
//import java.util.HashSet;
import java.util.List;
import java.util.Random;
//import java.util.Set;

public class Ex01_work {
    public static void main(String[] args) {

        // ArrayList를 두 개 만들고 1~5사이의 난수를 5개추가
        // 두개 리스트의 값을 비교하여 교집합 출력
        // -------------------------------------------
        // [5, 3, 5, 1, 5]
        // [2, 3, 1, 1, 3]
        // 교집합 : [3, 1]

        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        Random rnd = new Random();

        for (int i = 0; i < 5; i++) {
            list1.add(rnd.nextInt(5) + 1);
            list2.add(rnd.nextInt(5) + 1);
        }
        System.out.println(list1);
        System.out.println(list2);

        List<Integer> intersection0 = new ArrayList<Integer>();
        // Set<Integer> intersection1 = new HashSet<Integer>();
        // int n = 0;
        // for (int i = 0; i < list1.size(); i++) {
        //     for (int j = 0; j < list2.size(); j++) {

        //         if (list1.get(i) == list2.get(j)) {

        //             intersection1.add(list1.get(i));
        //             // intersection0.add(list1.get(i));
        //             // n = list1.get(i);
        //         }
        //     }
        // }

        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(list1.get(i)) && !intersection0.contains(list1.get(i))) {
                intersection0.add(list1.get(i));
            }
        }
        // for (int i = 0; i < intersection0.size(); i++) {
        // if(intersection0.contains(intersection0)){
        // continue;
        // }else{
        // intersection0.add(n);
        // }// 교집합이 하나만 나옴 or 중복된 값이 오름차순으로 나옴

        // }
        // for (int i = 0; i < intersection0.size(); i++) {
        // if(intersection0.get(i)== intersection0.get(i+1))
        // intersection0.remove(i+1);
        // }..IndexOutOfBoundsException 발생 가능

        // System.out.println(intersection1); // set이라 강제 오름차순변경됨

        System.out.println(intersection0);

    }
}
