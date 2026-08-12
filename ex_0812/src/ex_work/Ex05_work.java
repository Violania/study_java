package ex_work;

import java.util.Scanner;

public class Ex05_work {
    public static void main(String[] args) {
        /*
         * 학생수를 입력하세요 : 3
         * 학생 1의 성적 : 90
         * 학생 2의 성적 : 73
         * 학생 3의 성적 : 84
         * ----------------
         * 평균성적 : 82.333336
         * ---평균이상인 학생들---
         * => 학생1 : 90
         * => 학생3 : 84
         * 평균 이상인 학생 수 : 2
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("학생수를 입력하세요 : ");
        int students = sc.nextInt();// 학생수

        int[] nums = new int[students];

        int total = 0;
        for (int i = 0; i < students; i++) {
            System.out.printf("학생 %d : ", i + 1);
            nums[i] = sc.nextInt();
            total += nums[i];
        }
        System.out.println("-------------------------");
        System.out.println("평균성적" + (float) total / students); // 평균성적

        System.out.println("---평균 이상인 학생들---");

        int upper = 0;
        for (int i = 0; i < students; i++) {
            if (nums[i] >= (float) total / students) {
                System.out.printf("=> 학생 %d : %d\n", i + 1, nums[i]); // 평균 이상인 학생
                upper++; // 평균 이상인 학생 수
            }
        }
        System.out.println("평균 이상인 학생 수 : " + upper);

        // 2
        // 성적을 입력받아 저장하기 위한 배열
        int stuCnt = sc.nextInt();
        int[] grade = new int[stuCnt];

        int sum = 0;
        // 총점을 저장할 변수

        for (int i = 0; i < stuCnt; i++) {
            System.out.printf("학생%d의 성적 : ", i + 1);
            grade[i] = sc.nextInt();
            sum += grade[i];
        }

        System.out.println("-----------------");

        float avg = (float) sum / stuCnt;
        System.out.printf("평균성적 : %.2f\n", avg);

        System.out.println("---평균 이상인 학생 수---");

        int avgCnt = 0;// 평균 이상인 학생수를 담을 변수

        for (int i = 0; i < stuCnt; i++) {

            if (grade[i] >= avg) {
                avgCnt++;
                System.out.printf("=> 학생 %d : %d\n", i + 1, grade[i]);
            }
        }
        
    }// main

}// class
