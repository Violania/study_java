package ex01_thread;

public class ThreadMain {
    public static void main(String[] args) {
        
        ThreadSub ts = new ThreadSub();
        ts.start();//스래드 동작


        try {
            Thread.sleep(1500);
        } catch (Exception e) {
            
        }
        System.out.println("main 스래드 종료");
    }
}
