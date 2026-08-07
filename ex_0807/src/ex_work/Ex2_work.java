package ex_work;

import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {
        /*
        키보드에서 입력받은 2~9사이의 값에 해당하는 구구단을 출력
        
        -----------------------------------
        단 : 10
        2~9 사이의 값을 입력하세요

        단 : 5
        5 * 1 = 5
        ......
        5 * 9 = 45
        */
        
        Scanner sc = new Scanner(System.in);

        System.out.print("단 : ");
        int num = sc.nextInt();

        //실패 (범위지정문 반복출력됨)
        for( int i = 2; i <= 9; i++){
           if(num < 10){
            System.out.println( num +" * " + i + " = " + num * i );
            }else {
            System.out.println("2~9 사이의 값을 입력하십시오.");
            break;
            }   
        }//for
        
        
        /*실패 (범위지정실패: 9를 넘어도 계산함)
        for( int i = 2; i <= 9; i++){
            System.out.println( num +" * " + i + " = " + num * i );
            if(num < 10){
                System.out.println("2~9 사이의 값을 입력하십시오.");
            }
               
        }//for */
    }//main
    
}//class
