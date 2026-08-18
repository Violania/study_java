package ex1_method;

public class MethodMain {
    public static void main(String[] args) {
        
        MethodTset m1 = new MethodTset();
        m1.test1();

        int su = 100;
        su = m1.test2(su);//인자

        System.out.println("su : " + su);


    }
}
