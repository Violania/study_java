package ex2_work;

import java.util.Scanner;

public class Workmain {
    public static void main(String[] args) {

        // 정수 : 7
        // 7은(는) 소수입니다

        // 정수 : 9
        // 9은(는) 소수가 아닙니다

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int n = sc.nextInt();

        WorkSub ws = new WorkSub();
        
        if(ws.isPrime(n)){
            System.out.println(n + "은(는) 소수입니다");
        }else{
            System.out.println(n + "은(는) 소수가 아닙니다");
        }
        


        // boolean answer = ws.isPrime(n);
        // if (answer) {
        //     System.out.println(n + "은(는) 소수입니다");
        // } else {
        //     System.out.println(n + "은(는) 소수가 아닙니다");
        // }

        // //Sub로 옮길내용
        // int i = 2;
        // for (; i < n; i++) {

        // if (n % i == 0) {
        // break;
        // }

        // }
        // if (i == n) {
        // System.out.println(n + "은(는) 소수입니다");
        // } else {
        // System.out.println(n + "은(는) 소수가 아닙니다");
        // }

    }
}
