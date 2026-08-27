package ex6_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.validation.Schema;

public class Ex3_work {
    public static void main(String[] args) {

        // 정수입력( 입력종료 : 0 )
        // >> 45
        // >> 17
        // >> 20
        // >> 21
        // >> 0
        // ------------
        // 숫자범위를 입력하세요
        // 시작수 : 15
        // 끝 수 : 20
        // 17
        // 20
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();

        System.out.println("정수입력(입력종료 : 0)");

        int n = 0;
        out: while (true) {
            System.out.print(">>");
            n = sc.nextInt();

            if (n == 0) 
                break out;
            
            list.add(n);
        }//while
        System.out.println("--------------------");

      

        // System.out.println(list);

        System.out.println("숫자 범위를 입력하세요");
        System.out.print("시작수 : ");
        int start = sc.nextInt();
        System.out.print("끝 수 : ");
        int end = sc.nextInt();

        for (int i = 0; i < list.size(); i++) {
            
            if(list.get(i) >= start && list.get(i) <= end){
                System.out.println(list.get(i));
            }
        }//for



    //     List <Integer> list2 = new ArrayList<Integer>();

    //   for (int i = 0; i < list.size(); i++) {

    //     if( su1 < list.get(i) || su2 > list.get(i)){
    //     }
    //     list2.add(list.get(i));
        
    // }
    // for (int i = 0; i < list2.size(); i++) {
        
    //     System.out.println(list2.get(i));
    // }
        


    }// main
}
