package ex1_first;

public class Ex1_first {
    //main 메서드 : 프로그램의 시작점
    public static void main(String[] args) { 
        //주석 : 컴파일 시에 jvm이 인식하지 못하는 개발자들간의 소통을 위한 코드
      System.out.println(1 + 1);
      System.out.println("1 + 1 = " + (1 + 1));  //""은 문자열 (계산X) ,우선순위는 괄호로 묶음
      System.out.println(1 + 1 + "안녕" + 1 + 1); // 문자열과 숫자 연산은 문자열로 변환됨
    }
}
