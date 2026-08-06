package ex1_statement;

public class Ex2_if_else {
    public static void main(String[] args) {
        /* if-else문 : 하나의 조건식에 대해서 
        참일 때와 거짓일 때를 모두 판단할 수 있는 조건문 */
        int n = 40;
        String str = "";
        
        if ( ++n >= 50) {
            //조건식이 참일때 실행되는 영역
            str = "n은 50이상의 수"; 
        }else{
            //조건식이 거짓일때 실행되는 영역
            str = "n은 50미만의 수";
        }
        
        System.out.println(str);

        /*변수 age에 나이를 대입하고 30살 이상이면 드실만큼 드셨군요를, 그렇지 않으면 조금더 드셔도 돼요를 출력하는 if문 구현 */

        int age = 30;
        String str1 = "";

        if (age >= 30) {
            str1 = "드실만큼 드셨군요";
        }else{
            str1 = "조금 더 드셔도 돼요";
        }

        System.out.println(str1);

        //위의 30어떠구 코드를 삼항연산자로 구현

        /* 실패!
        int age1 = 30;
        String str2 ="";
        String a = "드실만큼";
        String b = "조금더";
        int res = age1 > 30 ? a : b;
        */

        age =30;
        str = "";
        str = age >= 30 ? "드실만큼.." : " 조금 더...";
        System.out.println( str );
        


    }//main
    
}
