package ex_work;

import java.util.Random;

public class Ex3_work {
    public static void main(String[] args) {
        
        //A ~ Z사이의 값중 하나를 랜덤으로 출력

        int a = new Random().nextInt( 90 - 65 + 1) + 65;
        System.out.println(( char ) a);
        //가독성 올리기 가능
        //아스키 코드를 몰라도 가능한 방법이 있음

        int alp = new Random().nextInt( 26) + 1; //구상은 switch 문으로 일일히 지정하는것

        

        //선생님 코드1
        int rnd = new Random().nextInt(26) + 65;
        System.out.println( (char)rnd );
        
        //2
        int rnd1 = new Random().nextInt('Z' - 'A' + 1 ) + 'A';
        System.out.println((char)rnd1);
        





    }//main
}//class
