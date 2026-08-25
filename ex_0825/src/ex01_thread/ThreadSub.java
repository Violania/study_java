package ex01_thread;

public class ThreadSub extends Thread {

    @Override
    public void run() {
        // 프로세스의 독립적인 수행을 위한 영역
        for (int i = 0; i < 10; i++) {
            //0.5초간 휴식
            try{
            Thread.sleep(500);//try 안에서만 구현가능
            }catch(Exception e){
                
            }

            System.out.println("스래드 실행 중");

        }
    }

}
