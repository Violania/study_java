package ex1_statement;

import java.util.Scanner;

public class Ex3_statement { 
    public static void main(String[] args) {

        /*
        은행이자는 하루에 1원씩추가된다 
        원금과 예치이자를 키보드에서 입력받고
        예치기한이 끝났을떄 나의 원금이 얼마가 되어있는지 출력
        --------------------------------------------
        원금:1000
        예치일:5
        5일 후의 잔액은 1005원 입니다

         */
         
        Scanner sc = new Scanner(System.in);

        System.out.print("원금 : ");
        int won = sc.nextInt();
        System.out.print("예치일 : ");
        int day = sc.nextInt();

        for( int i = 0; i < day; i++ ){
            won++;
        }
        System.out.println( day + "일 후의 잔액은 " + won + "원 입니다.");




        


    }//main
    
}
