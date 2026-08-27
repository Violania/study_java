package ex4_operator;

public class Ex3_oper {
    public static void main(String[] args) {

        // 논리연산자
        // 비교연산자를 통한 연산이 2개 이상일때 연결해주는 연산자
        int age = 30;
        int limit = 35;
        boolean res = (limit - age) > 5 && (age += 2) > 30; // &&(and)연산자 전항과 후항 모두 true여야함
        // true&&true=true true&&false=false false&&true=false false&&false=false
        // 전항이 false면 후항은 실행하지 않음
        System.out.println("&&연산 : " + res);
        System.out.println("age : " + age);

        // ||(or)연산자
        //피연산자 중 **단 하나라도 true가 있으면 전체 결과는 무조건 true**가 됩니다. 
        // 모든 조건이 false일 때만 결과가 false가 됩니다.
        int i1 = 10;
        int i2 = 20;
        res = (i1 += 10) > 20 || i2 - 10 == 11;
        System.out.println("||연산 : " + res);

        //!(not)
        //참을 거짓으로, 거짓을 참으로 변경하는 연산자
         //!이 붙어있을떄만 적용됨
        System.out.println("!연산 :" + !res);

        res = !res; //영구적용법
        System.out.println(res); 
    }

}

