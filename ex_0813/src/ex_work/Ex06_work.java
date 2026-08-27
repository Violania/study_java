package ex_work;

import java.util.Scanner;

public class Ex06_work {
    public static void main(String[] args) {
        /*
         * 등록할 인원수 : 2
         * 이름 : 홍길동
         * 수학 : 99
         * 영어 : 100
         * 국어 : 75
         * 이름 : 김길순
         * 수학 : 70
         * 영어 : 89
         * 국어 : 99
         * -------------
         * 총 2명의 학생정보가 등록됨
         * [학생 등록정보]
         * 홍길동 99 100 75
         * 김길순 70 89 99
         * System.out.print(array[su][j] + " ");
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("등록할 인원수 : ");
        int num = sc.nextInt();

        String[] info = { "이름 : ", "수학 : ", "영어 : ", "국어 : " };
        String[][] str = new String[num][info.length];

        // 학생정보 등록

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                System.out.print(info[j]);
                str[i][j] = sc.next();

            }

        }

        System.out.println("---------------------------");

        System.out.printf("총 %d명의 학생정보가 등록됨\n", num);
        System.out.println("[학생 등록정보]");

        for (int i = 0; i < str.length; i++) {

            for (int j = 0; j < str[i].length; j++) {

                System.out.printf("%s\t", str[i][j]);
            }
            System.out.println();

        }

    }// main
}// class
/*
 * //학생정보 등록
 * for (int i = 0; i < str.length; i++) {
 * 
 * System.out.print("이름 :");
 * str[i][0] = sc.next();
 * 
 * System.out.print("수학 :");
 * str[i][1] = sc.next();
 * 
 * System.out.print("영어 :");
 * str[i][2] = sc.next();
 * 
 * System.out.print("국어 :");
 * str[i][3] = sc.next();
 * }
 * 
 * ______________________________________
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.print("등록할 인원수 : ");
 * int num = sc.nextInt();
 * 
 * 
 * String[][] str = new String[num][4];
 * for (int i = 0; i < str.length; i++) {
 * for (int j = 0; j < str[i].length; j++) {
 * 
 * System.out.print( "이름 : ");
 * String n = sc.next();
 * 
 * System.out.print( "수학 : ");
 * String m = sc.next();
 * 
 * System.out.print( "영어 : ");
 * String e = sc.next();
 * 
 * System.out.print( "국어 : ");
 * String k = sc.next();
 * 
 * }
 * System.out.printlnf("총 %d명의 학생정보가 등록됨\n", num);
 * System.out.printlnf("학생등록정보");
 * 
 * for (int i = 0; i < str.length; i++) {
 * 
 * for (int j = 0; j < str[i].length; j++) {
 * 
 * System.out.printf("%s\t", str[i][j]);
 * }
 * System.out.println();
 * 
 * }
 */
