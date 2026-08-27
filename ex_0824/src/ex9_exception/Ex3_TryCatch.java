package ex9_exception;

public class Ex3_TryCatch {
    public static void main(String[] args) {
        
        int[]arr={10,20,30};

        try {
            
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
                
            }
            System.out.println("프로그램 종료");
        } catch (Exception e) {
          
        }//오류를 감추기 위한 try-catch는 사용X

    }//main

}
