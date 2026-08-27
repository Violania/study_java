package ex9_exception;

public class Ex2_TryCatch {
    public static void main(String[] args) {

        int res = 0;
        int[] arr = { 1, 2, 3 };

        try {

            res = 10 / 1;
            arr[2] = 100;

        } catch (Exception e) {
            e.printStackTrace();//개발중 문제확인가능
           // System.out.println("오류발생");
        }finally{
            //예이 여부와 상관없이 반드시 호출되는 영역
            System.out.println("finally영역");
        }

        System.out.println("프로그램 정상종료");
    }
}
