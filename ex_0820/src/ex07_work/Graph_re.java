package ex07_work;

import java.util.Random;
//import java.util.Scanner;

public class Graph_re {
    public static void main(String[] args) {
        int[] arr = new int[100];

        //Scanner sc = new Scanner(System.in);
        //new Random().nextInt();//익명클래스-사용 후 가비지 컬랙터가 바로 회수
        Random rnd = new Random();


        for (int i = 0; i < 100; i++) {
            int r = rnd.nextInt(10) ;
            arr[r]++;
        }

        PrintGraph_re pg = new PrintGraph_re();
        pg.print(arr);
    }
}
