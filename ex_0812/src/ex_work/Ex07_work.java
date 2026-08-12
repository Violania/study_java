package ex_work;

public class Ex07_work {
    public static void main(String[] args) {

        /*
         * 배열 arr을 오름 차순으로 출력
         * ------------------------
         * 11 7 9 20 15 3
         * 3 7 9 11 15 20
         */

        int arr[] = { 11, 7, 9, 20, 15, 3 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (arr[i] > arr[j]) {
                    num1 = arr[j];
                    
                    
                }
                System.out.print(num1);

            }
        }

    }// main

}//
