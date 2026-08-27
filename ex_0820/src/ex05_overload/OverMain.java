package ex05_overload;

public class OverMain {
    public static void main(String[] args) {
        
        Oversub os = new Oversub();
        os.result();
        os.result(123);
        os.result('A');
        os.result("a");
        os.result(1,"a");
        os.result("a",11);

    }
}
