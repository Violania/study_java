package rsp;

import java.util.Random;
import java.util.Scanner;

public class RspMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User user = new User();
        System.out.print("아이디를 입력하세요 : ");
        String id = sc.next();
        Random rnd = new Random();

        int win = user.getWin();
        int lose = user.getLose();
        int draw = user.getDraw();
        // 입력받은 id를 user에 저장
        user.setId(id);

        // 파일읽기
        ScoreLoad sl = new ScoreLoad();
        user = sl.load(user);

        System.out.println(user.getWin());
        System.out.println(user.getLose());
        System.out.println(user.getDraw());

        System.out.printf("%d승, %d패, %무\n", win, lose, draw);

        while (true) {
            // 0:가위, 1:바위, 2:보
            int random = rnd.nextInt(3);

            System.out.println("가위(0)| 바위 (1) | 보(2) :");
            int iam = sc.nextInt();

            // 경우의 수
            if (iam - random == -2 || iam - random == 1) {
                System.out.println("이겼습니다");
                user.setWin(++win);
            } else if (iam - random == 0) {
                System.out.println("비겼습니다");
                user.setDraw(++draw);
            } else
                System.out.println("졌습니다");
            {
                user.setLose(++lose);
            }

            System.out.printf("%d승 %d패 %d무", user.getWin(), user.getLose(), user.getDraw());

            System.out.println("re? y | n :");
            String yn = sc.next();
            if (yn.equals("n")) {
                break;
            }
        }

        System.out.println("게임종료");

        // 사용자 기록 저장
        ScoreWrite sw = new ScoreWrite();
        sw.save(user);
    }
}
