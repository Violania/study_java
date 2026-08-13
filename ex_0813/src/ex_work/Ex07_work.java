package ex_work;

import java.util.Scanner;

public class Ex07_work {
    public static void main(String[] args) {
        /*
         * 키보드로 숫자를 입력받은 마방진
         * 
         * 홀수 : 3
         * 08 01 06
         * 03 05 07
         * 04 09 02
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("홀수 : ");
        int num = sc.nextInt();
        int[][] array = new int[num][num];


        
        int rx  = 0;
        int rx2 = 0;
        
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                rx = array[i][j] + rx;

               
                    
            
                
                
            }
            
            System.out.println();
        }
        System.out.println(rx);

    }// main
}// class
