package ex1_statement;

public class Ex3_else_if {
    public static void main(String[] args) {
        /*
        다중if문 (else if)
        여러개의 조건비교가 필요한 경우 사용하는 if문

        if(조건식1){
         조건식1이 참일 때 실행되는 영역
        }else if(조건식2){
        조건식2가 참일 때 실행되는 영역
        }
         */
        int num = 50;
        String str = "";

        if ( num >= 90) {
            str = "A";
        }else if( num >= 80 ) {
            str = "B";
        }else if( num >= 70 ) {
            str = "C";
        }else if ( num >= 60 ) {
            str = "D";
        }else if ( num <= 59 ) {
            //위의 조건식들이 모두 거짓일 때 반드시 호출되는 영역
            str = "F";
        }
        System.out.println(str);
        // 중간에 참인 조건문이 있으면 그 이후로 실행을 하지 않음

        //나이가 20 이상이면 -성인요금
        //14이상 20미만- 청소년요금
        //8이상 14미만 -어린이요금
        //8미만 -유아요금

        int age = 10;
        str = "";

        if ( age >= 20) {
            str = "성인요금";
        }else if ( age >= 14) {
            str = "청소년요금";
        }else if ( age >= 8) {
            str = "어린이요금";
        }else if ( age < 8) {
            str = "유아요금";
        }
        System.out.println(str);

        // 삼항연산자버전 
        int age1 = 18;
        String str1 = "";
        str1 = (age1 >= 20) ? "성인요금" : ( age1 >= 14 ) ? "청소년 요금" : ( age1 >=8 ) ? "어린이요금" : "유아요금";

        System.out.println(str1);
        
        
        
    }//main
    
}
