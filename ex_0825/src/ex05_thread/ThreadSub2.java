package ex05_thread;

public class ThreadSub2 extends Thread{
    private int [] arr;
    public ThreadSub2(int [] arr){
        this.arr = arr;
    }

    

    @Override
    public void run() {
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = sum * arr[i];
           
        }
        System.out.println("곱 : "+ sum);
    }
}
