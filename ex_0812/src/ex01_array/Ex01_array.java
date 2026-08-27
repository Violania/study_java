package ex01_array;

public class Ex01_array {
    public static void main(String[] args) {
        /*
         * 배열은 '같은 자료형끼리 모아둔 하나의 묶음'
         * 효율적인 자료관리를 위해 반드시 필요하다
         */

        int su1 = 100;
        int su2 = 200;
        int su3 = 300;
        int su4 = 400;

        // 1) 배열 선언

        int[] arr;

        // 2) 배열 생성

        arr = new int[6];

        // 3) 배열 초기화
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        arr[4] = 500;
        // 존재하지 않는 index에 접근할 수 없다
        // 코드가 진행되는중에 index 수 조정이 불가능하다

        //배열의 모든 내용을 출력
        for(int i = 0; i < arr.length ; i++){ //arr.length-> index의 갯수를 자동으로

            System.out.println(arr[i]);

        }//for

    }// main

}// class
