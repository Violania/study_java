package ex7_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeworkAnswer {
    public static void main(String[] args) {
       
        // ArrayList를 두 개 만들고 1~5사이의 난수를 5개추가
        // 두개 리스트의 값을 비교하여 교집합 출력
        // -------------------------------------------
        // [5, 3, 5, 1, 5]
        // [2, 3, 1, 1, 3]
        // 교집합 : [3, 1]
        
        Random rnd = new Random();
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();


        //교집합을 담기위한 리스트
        List<Integer> common = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            list1.add(rnd.nextInt(5) + 1);
            list2.add(rnd.nextInt(5) + 1);
        }
        System.out.println(list1);
        System.out.println(list2);

        for(int num : list1){

            if (list2.contains(num) && !common.contains(num)) {
                common.add(num);
                
            }
        }

        System.out.println("교집합 : " + common);


    }
    
}
