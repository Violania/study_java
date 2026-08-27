package ex9_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListMain {
    public static void main(String[] args) {
        // 학생수 : 2
        // -------------------
        // 이름 : 홍길동
        // 국어 : 99
        // 영어 : 87
        // -------------------
        // 이름 : 임길동
        // 국어 : 75
        // 영어 : 80
        // -------------------
        // 홍길동 국어 : 99 영어 : 87 총점 : 186 평균 : 93.0
        // 임길동 국어 : 75 영어 : 80 총점 : 155 평균 : 77.5
        // 반 전체 평균

        Scanner sc = new Scanner(System.in);
        List<ListSub> slist = new ArrayList<ListSub>();
        ListSub stu;

        System.out.print("학생 수 : ");
        int student = sc.nextInt();

        for (int i = 0; i < student; i++) {
            System.out.print("이름 : ");
            String name = sc.next();

            System.out.print("국어 : ");
            int kor = sc.nextInt();

            System.out.print("영어 : ");
            int eng = sc.nextInt();

            stu = new ListSub(name, kor, eng);
            slist.add(stu);

            System.out.println("------------");

            // ListSub ls = new ListSub();
            // ls.setName(name);
            // ls.setKor(kor);
            // ls.setEng(eng);

            // sList.add(ls);
        } // for

        //반 전체 평균
        float all_avg = 0;

        //학생정보 출력
        for (int i = 0; i < slist.size(); i++) {
            
            slist.get(i).studentInfo();

            all_avg += slist.get(i).getAvg();

        }

        System.out.printf("반 전체 평균 : %.2f",all_avg/slist.size());
    
        // System.out.println(sList);

    }// main
}
