package ex_work;

public class Ex02_work {
    public static void main(String[] args) {
        /*
         * 배열 arr에 담긴 모든 값의 합을 출력
         * ------------
         * 결과 : 121
         */
        int[] arr = { 10, 11, 37, 61, 2 };
        
        //1
        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            num = arr[i] + num;

        } // for
        System.out.println(num);

        System.out.println();
        System.out.println("-----------");
        
        //2
        int num2 = 0;
        int num3 = 0;
        
        while(num3 < arr.length){
            num2 =arr[num3] + num2;
            num3++;
        }

        System.out.println(num2);




    }// main

}// class
