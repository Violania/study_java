package ex8_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WorkMain {
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

        Random rnd = new Random();
        List<String> qlist = new ArrayList<String>();
        Timer timer = new Timer();

        qlist.add(data[rnd.nextInt(data.length)]);
        timer.setDaemon(true);
        timer.start();



        
    }
}
