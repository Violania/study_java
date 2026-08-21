package ex3_formatter;

public class Ex1_formatter {
    public static void main(String[] args) {
//프린트시 번거롭지 않게 출력하는 방법

/* formatter의 문법
\n: 강제개행(줄바꿈)
%d: 정수 (%02d 는 두자리수로 만듦)
%c: 문자 (%C는 소문자를 대문자로 바꿈)
%f: 실수 (%.2f는 소수점2번자리까지만 보여줌)
%s: 문자열 ( 모든 타입이 가능하기는 하다 )
%%: %특수문자
 */

        //저의 나이는 20살 입니다
        int age = 20;
        System.out.printf("저의 나이는 %d살 입니다\n", age); //%d 정수
        
        //저는 20살이고 3층에 살아요   
        System.out.printf("저의 나이는 %d살이고 %02d층에 살아요\n", 20 , 3 ); //%02d 는 두자리수로 만듦 ex 09

        //나는 박씨야
        System.out.printf("나는 %c씨야\n", '박');

        //나는 a형이야
        System.out.printf("나는 %C형이야\n", 'a'); //%C는 소문자를 대문자로 바꿈

        //원주율 : 3.141592
        System.out.printf("원주율 : %.2f\n" , 3.141592); //%f 실수 %.2f는 소수점2번자리까지만 보여줌

        //저는 홍길동입니다
        System.out.printf("저는 %s입니다\n", "홍길동");

        System.out.printf("%s\t %d\t %d \n","김윤", 100 , 95);
        System.out.printf("%s\t %d\t %d \n","김길동", 100 , 7);

        //오늘 강수량은 15%입니다
        System.out.printf("오늘 강수량은 %d%%입니다\n" , 15); //%는 %%입력


    }//main
    
}//class
