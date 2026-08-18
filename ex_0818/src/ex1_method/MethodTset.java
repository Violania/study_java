package ex1_method;

public class MethodTset {

    public void test1() {
        System.out.println("text1 메서드 호출");
    }

    public int test2(int n) {// 파라미터
        n += 100;
        System.out.println("결과 : " + n);
        
        //나를 호출한 곳으로 return값을 딱 한개만 가지고 돌아간다.
        return n;
        // System.out.println("asaaa");
    }

}
