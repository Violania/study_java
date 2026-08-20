package ex7_work;

import java.util.Random;

public class Updownsub{
    
        private int random = new Random().nextInt(50) + 1;
        private int count = 0; 
        private boolean result = true;
    
        //정답판별 메서드
        public boolean check(int n){
            count++;
    
            if(n < random )
                System.out.println("UP");

            else if(n>random)
                System.out.println("DOWN");
            else{
                System.out.println(count+"회만에 정답");
                result = false;
            }
            return result;
    
        }//check
    }

// public int game(int answer, int num) {

// // int cnt = 1;

// // for (int i = num; i <= 50; i++) {

// // if (num < answer) {
// // System.out.println("UP");
// // cnt++;
// // return cnt;
// // } else if (num > answer) {
// // System.out.println("DOWN");
// // cnt++;
// // return cnt;
// // } else {
// // System.out.println(cnt + "회 만에 정답");
// // }

// // }
// // return cnt;

// // int num = 0;
// // int cnt = 0;

// // while (num != answer) {
// // System.out.print("정수 : ");
// // num = sc.nextInt();

// // if (num < answer) {
// // System.out.println("UP");
// // cnt++;

// // } else if (num > answer) {
// // System.out.println("DOWN");
// // cnt++;
// // }
// // }
// // return cnt;
// // System.out.println(cnt + "회 만에 정답");

// }
