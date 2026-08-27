package ex01_array;

public class Ex02_array {
    public static void main(String[] args) {
        /*배열의 선언 + 생성 + 초기화 */
        int[] ar = {1, 2, 3, 4, 5};

        // 1, 2, 3, 4, 5
        for(int i = 0; i < ar.length; i++){

            ar[i] = (i + 1) * 100;
            System.out.print(ar[i] +" ");
        }//for

        System.out.println();
        System.out.println("-----------------");
        
        // 개선된 for문( 개선된  루프) - 특정 index에 접근하는것은 불편함
        //지금 당장은 원본 for문으로 사용할것 권장
        for(int n : ar ){ 
            System.out.println(n);
        }//for



    }//main

}//class
