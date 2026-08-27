package ex04_thread;

public class ThreadSub extends Thread {

    private int n;

    public ThreadSub(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = n; i >= 0; i--) {

            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (Exception e) {

            }

        }
    }

}
