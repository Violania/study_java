package ex7_work;

public class Updownsub {

    public int game(int answer, int num) {

        // int cnt = 1;

        // for (int i = num; i <= 50; i++) {

        //     if (num < answer) {
        //         System.out.println("UP");
        //         cnt++;
        //         return cnt;
        //     } else if (num > answer) {
        //         System.out.println("DOWN");
        //         cnt++;
        //         return cnt;
        //     } else {
        //         System.out.println(cnt + "회 만에 정답"); 
        //     }
            
        // }
        // return cnt;

        int cnt = 1;
        if (num < answer) {
            System.out.println("UP");
            cnt++;

        } else if (num > answer) {
            System.out.println("DOWN");
            cnt++;

        } else {
            System.out.println(cnt + "회 만에 정답");
        }
        return cnt;


        // int num = 0;
        // int cnt = 0;
        
        // while (num != answer) {
        //     System.out.print("정수 : ");
        //     num = sc.nextInt();

        //     if (num < answer) {
        //         System.out.println("UP");
        //         cnt++;

        //     } else if (num > answer) {
        //         System.out.println("DOWN");
        //         cnt++;
        //     }
        // }
        // return cnt;
        // System.out.println(cnt + "회 만에 정답");

        
        
    }

}
