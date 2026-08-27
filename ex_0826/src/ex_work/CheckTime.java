package ex_work;

public class CheckTime extends Thread {

    private int timer = 0;
    private boolean isCheck = true;

    public void setCheck(boolean isCheck) {
        this.isCheck = isCheck;
    }

    @Override
    public void run() {

        while (isCheck) {// isCheck == true
            try {
                Thread.sleep(1000);
                timer++;
            } catch (Exception e) {

            }
        }

        System.out.println(timer + "초");

    }

}
