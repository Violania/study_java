package ex8_homework;

public class Timer extends Thread {

    private int timer = 0;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
                timer++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
