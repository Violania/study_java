package ex_work;

public class Ex03_work {
    public static void main(String[] args) {

        int[] arr = { 4, 13, 19, 1, 15 };

        /*
         * 배열 arr에 담긴 값중 가장 큰 값을 출력
         * ----------------
         * 가장 큰 값 : 19
         */

        // 1
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {

            if (answer < arr[i]) {
                answer = arr[i];
            } // if
        } // for
        System.out.print("가장 큰 값 : " + answer);

        System.out.println();
        System.out.println("-------------");

        // 2
        int i = 0;
        int j = 0;

        while (i < arr.length) {
            if (j < arr[i]) {
                j = arr[i];
            } else if (i >= arr.length) {
                break;
            }
            i++;

        }
        System.out.println("가장 큰 값 : " + j);
        
        // 3
        int max = arr[0];
        
        for (int k = 1; k < arr.length; k++){
            if (arr[k] > max) {
                max = arr[k];
            }
        }    
        System.out.println("가장 큰 값 : " + max);
        


    }// main

}// main
