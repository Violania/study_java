package ex05_thread;

public class ThreadSub1 extends Thread {

    private int[] arr;

    public ThreadSub1 ( int [] arr){
        this.arr = arr;
    }

    @Override
    public void run() {
        
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            
        }
        System.out.println("합 : "+ sum);
    }
}
