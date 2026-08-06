package ex1_statement;

public class Ex1_if {
    public static void main(String[] args) {
        
        /*제어문 - 프로그램의 흐름을 제어하는 문장
        분기문과 반복문으로 나뉜다
        분기문: if,switch
        반복문: for, while, do-while
        */

        /*if문
        if(조건식){
        조건식이 참일때 실행되는 영역
        } */

        int n =50;
        String str = "안녕하세요"; //String ""안에  여러 언어를 담는 자료형으로 보아도됨  아직은

        if(n != 50){
            str = "n은 50입니다";
        }
        
        System.out.println(str);


    }
    
}
