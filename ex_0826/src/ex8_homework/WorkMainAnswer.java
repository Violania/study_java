package ex8_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkMainAnswer {
    public static void main(String[] args) {
        
          //단어게임 
        /*
         * [strawberry]
         * >> strawberry
         * [orange, grape, apple]
         * >> orange
         * [grape, apple]
         * >> grape
         * [apple, apple]
         * >> apple
         * [apple]
         * >> apple
         * [strawberry]
         * >> strawberry
         * 클리어!!!
         */
        
        //클리어때까지 3초마다 문제추가, 전부입력시 클리어
        String[] data = { "apple", "banana", "orange", "grape", "strawberry","pineapple"};
        List<String> arr = new ArrayList<String>();

        WorkSub ws = new WorkSub(arr, data);
        ws.setDaemon(true);
        ws.start();
        

       Scanner sc = new Scanner(System.in);// thread가 준비하는 시간을 줌(이것 하느라 시간이 지나서)

        while (true) {

            if (arr.size() == 0) {
                System.out.println("클리어!");
                break;
                
            }
            System.out.println(arr);
            System.out.print(">>");
            String in = sc.next();

            //사용자 입력 단어와 arr 에 담긴 값을 비교
            for (int i = 0; i < arr.size(); i++) {

                if (in.equals(arr.get(i))) {
                    arr.remove(i);
                    break;                 
                }
                
            }//for
        }
    }
}
