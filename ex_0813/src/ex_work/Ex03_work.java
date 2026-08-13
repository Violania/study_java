package ex_work;

import java.util.Scanner;

public class Ex03_work {
    public static void main(String[] args) {

        /*
         * 키보드에서 입력받은 값보다 큰 첫번쨰 요소를 찿아 출력
         * ----------------------------
         * 입력 : 8
         * 결과 : 10
         */

        int[][] arr = { { 1, 3, 4, 7 },
                        { 10, 2, 9, 3, 8 },
                        { 7, 4, 1 } };

        System.out.println("//1");
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int num = sc.nextInt();

        // 1 lebal로 해결 가능

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (num < arr[i][j]){
                    System.out.println("결과 : " + arr[i][j]);
                    break;
                }
            }
        }
        // 2
        System.out.println("//2");

        out:for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (num < arr[i][j]){
                    System.out.println("결과 : " + arr[i][j]);
                    break out;
                }
            }
        }

    }// main
}// class
