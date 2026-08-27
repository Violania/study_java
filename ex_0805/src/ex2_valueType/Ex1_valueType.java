package ex2_valueType;

public class Ex1_valueType {
    public static void main(String[] args) {
    /* 
     자바의 기본 자료형 (소문자)    aaaa
     논리형 : boolean .... 1bit
     문자형 : char ....... 2byte
     정수형 : byte, ...... 1byte    -> -128 ~ 127
             short, ...... 2byte    -> -32768 ~ 32767  애매해서 잘안쓰임
             int, ...... 4byte    -> -21억 ~ 21억
             long ...... 8byte    -> -922경 ~ 922경
     실수형 : float, ...... 4.x byte    -> 소수점 7자리
             double ...... 8.x byte    -> 소수점 15자리

     변수 : 데이터를 저장하는 공간
     자료형 변수명;(선언)
     변수명 = 값;(대입)
     
     자료형 변수명 = 값; (초기화로 부름)

     변수선언 규칙
     1.숫자로 시작할 수 없다.
     2._를 제외하고 특수문자를 사용할 수 없다.(공백도 X)
     3.한글로 변수이름 짓지 않는다.
     4.반드시 소문자 알파벳으로 시작한다.
     */
      
    // 변수의 이름을 작성할 때 자주 사용하는 표기법들
    // 1. 카멜 표기법(Camel Case)
    //    - 첫 단어는 소문자로 시작하고, 이후 단어의 첫 글자를 대문자로 작성함.
    //    - 예: userName, myVariable, totalCount
    //
    // 2. 파스칼 표기법(Pascal Case)
    //    - 모든 단어의 첫 글자를 대문자로 작성함.
    //    - 주로 클래스명에 사용함.
    //    - 예: UserName, MyVariable, TotalCount
    //
    // 3. 헝가리안 표기법(Hungarian Notation)
    //    - 변수의 자료형 또는 목적을 앞에 접두사로 붙임.
    //    - 최근 자바에서는 잘 사용하지 않음.
    //    - 예: strName (문자열), nCount (정수형), bChecked (불린형)
    //
    // 4. 스네이크 표기법(Snake Case)
    //    - 모든 단어를 소문자로 쓰고, 단어 사이를 언더스코어(_)로 구분함.
    //    - 자바에서는 상수명에 주로 사용함.
    //    - 예: user_name, my_variable, TOTAL_COUNT

    //논리형 : 참과 거짓(true, false)의 두 가지 값을만들 저장할 수 있는 자료형
    boolean b1; //선언 동일한 이름의 변수 선언은 불가능
    b1 = true; //대입
    b1 = false; //대입 위의 값을 덮어씌움 
    // b1 = 10; 자료형 타입이 올바르지 않기 떄문에 오류발생
    System.out.println("b1 : " + b1);

    //정수형 : 소수점이 없는 정수값만 저장하는 자료형
    byte b = 127;
    short s = 32767;
    int n = 5000;
    long lo = 2200000000L; //long은 L넣어줘야함 소,대문자 구분 없음
    System.out.println("b : " + b);
    System.err.println("s : " + s);
    System.out.println("n : " + n);
    System.out.println("lo : " + lo);

    

    }
    
}
