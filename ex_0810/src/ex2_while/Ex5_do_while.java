package ex2_while;

import java.util.Random;

public class Ex5_do_while {
    public static void main(String[] args) {

        /*
         * 자바 jsp 안드로이드의 시험을 봤다
         * 각 과목별 점수는 랜덤하게 0 ~ 130점이 대입
         * 각 과목별 점수를 검사하여 100을 넘어가는 점수가 하나도 없을때
         * 최종결과를 화면에 출력
         * -----------------------------
         * 자바 : 37
         * jsp : 100
         * 안드로이드 : 13
         */
         int java = 0;
         int jsp = 0;
         int andriod =0;
        
        do {
            java = new Random().nextInt(130 - 0 + 1) + 0;
            jsp = new Random().nextInt(130 - 0 + 1) + 0;
            andriod = new Random().nextInt(130 - 0 + 1) + 0;
            
            
        } while (java > 100 || jsp > 100 || andriod > 100);
        
        System.out.printf("자바\t : %d\t\njsp\t : %d\t\n안드\t : %d\t", java, jsp, andriod);
        
        /*
        java = 0
        jsp = 0
        andriod = 101
        
        while (java > 100 || jsp > 100 || andriod > 100) {
            java = new Random().nextInt(130 - 0 + 1) + 0;
            jsp = new Random().nextInt(130 - 0 + 1) + 0;
            andriod = new Random().nextInt(130 - 0 + 1) + 0;

        } 
       */

    }// main
}// class
