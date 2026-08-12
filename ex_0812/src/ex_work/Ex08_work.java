package ex_work;

import java.util.Random;

public class Ex08_work {
    public static void main(String[] args) {

        int coin[] = { 500, 100, 50, 10 };

        /*
         * 변수 money에 10~ 5000사이의 난수를 발생시킨다
         * 단, 발생한 난수 money의 1의자리는 반드시 0이 되도록 한다
         * money를 최소한의 동전으로 몇 개씩 거슬러 지는지 출력
         * ------------------------
         * 금액 : 2590
         * 500원 : 5
         * 50원 : 1
         * 10원 : 4
         * 
         */

        int money = new Random().nextInt(5000 - 10 + 1) + 10;
        for(int i = 0;)
        if(money % 10 == 0){
            int m = money;
            System.out.println("금액 : " + m);
        }
        
       /* 
        System.out.println("금액 : " + money );
       
        int won1 = money % 500;
        int won2 = won1 % 100;
        int won3 = won2 % 50;
        int won4 = won3 % 10;

        System.out.printf("%d, %d, %d, %d",won1 , won2, won3, won4 );
        */

    }// main

}// class
