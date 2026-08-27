package ex2_method;

public class TestMain {
    public static void main(String[] args) {

        Test t1 = new Test();
        String res = t1.average(100, 80, 70);

        System.out.println("결과 : " + res);

        //기능별로 클래스를 분리해두면 오류를 찿는 것이 원활함(유지보수에 좋음)

    }// main
}
