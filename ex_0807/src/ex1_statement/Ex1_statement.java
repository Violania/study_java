package ex1_statement;

public class Ex1_statement {
    public static void main(String[] args) {
        /*
         * for문 : 특정코드를 원한느 만큼 반복하고자 할 때
         * for(초기식; 조건식; 증감식){
         * 조건싣이 참일때 수행되는 영역
         * }
         * false가 될때까지 반복됨 조건식<->증감식, 초기식은 처음 한번
         */
        // int a = 0; //전역변수 전체영역에서 사용가능

        for (int i = 0; i <= 2; i++) {// i:지역변수 그 지역에서만(for문) 사용가능 벗어나면 사용불가
            // 1.초기화 2, 5.(false가 될때까지 반복) //4.
            System.out.println(i);
            // 3.
        } // for

        System.out.println("------------------------");

        // 10~1까지 반복하는 for문

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("----------------------");

        //1~100 반복 for문
        //5의 배수만 출력

        for( int i = 1; i <= 100; i++){
            if(i % 5 == 0){
                System.out.println(i);
            }
            
        }
        
        System.out.println("---------------------------");;
        
        for( int i = 5; i <= 100; i +=5 ){   
            System.out.println(i); 
        } //for   

        System.out.println("---------------------------");;
      
        for( int i = 0; i <= 95; ){   
            i += 5;
            System.out.println(i); 
        } //for   
                                          
    }// main
}// class