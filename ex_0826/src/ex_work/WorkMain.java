package ex_work;

import java.util.Random;
import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {

        // 1~100사이의 난수 두개를 더하는 문제 출제
        // 키보드에서 답을 입력하여 다섯문제가 정답 처리 될떄까지 로직을 반복
        // 5문제를 모두 맞힐 때까지 몇 초가 걸렸는지를 출력하며 종료
        // 1) 사용자가 정답으로 정수 이외의 값을 입력햮다면
        // '정답은 정수로 입력하세요'라는 오류메시지 출력 try - catch
        // 2)데몬스레드는 사용하지 않는다
        // ----------------------------------------------
        // 23 + 48 = 71
        // 정답입니다
        // 22 + 100 = 100
        // 오답입니다
        // ....
        // 결과 : 24초

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int playCount = 0;
        final int FINISH = 5;

        CheckTime ct = new CheckTime();
        ct.start();

        while (true) {

            if (playCount == FINISH) {
                ct.setCheck(false);
                break;
            } else {
                try {

                    int su1 = rnd.nextInt(100) + 1;
                    int su2 = rnd.nextInt(100) + 1;
                    System.out.printf("%d + %d = ", su1, su2);

                    int res = sc.nextInt();

                    if (res == su1 + su2) {
                        System.out.println("정답입니다");
                        playCount++;
                    }

                } catch (Exception e) {

                    System.out.println("정답은 정수로 입력해야 합니다");
                }
            }

        }

        // CheckTime ct = new CheckTime();
        // MakeQ mq = new MakeQ();
        // int num = sc.nextInt();

        // mq.start();
        // ct.start();
    }

}
