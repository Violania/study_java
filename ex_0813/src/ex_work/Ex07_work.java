package ex_work;

import java.util.Scanner;

public class Ex07_work {
    public static void main(String[] args) {
        /*
         * while문으로 가능, 2중 for 도 가능
         * 키보드로 숫자를 입력받은 마방진
         * 
         * 홀수 : 3
         * 08 01 06
         * 03 05 07
         * 04 09 02
         * 
         * /
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("홀수 : ");
        int num = sc.nextInt();
        int[][] array = new int[num][num];

        int x = 0; // 가로
        int y = 1; // 세로

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[x][y] = 1;
                x++;
                y--;
                if (x > num) {
                    x = x - (num - 1);

                } else if (y < num) {
                    y = y + (num + 1);
                }

                System.out.printf("%02d ", array[i][j]);
            }

            System.out.println();
        }

    }// main
}// class
