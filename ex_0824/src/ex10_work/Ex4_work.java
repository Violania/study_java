package ex10_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {
        
        // 입력 : 1771
        // 1771은 4자리의 홀수입니다

        // 입력 : 30
        // 30은 2자리의 짝수입니다

        // 입력 : 100a
        // 100a는 정수가 아닙니다

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String str = sc.next();

        try {
            int n = Integer.parseInt(str);
            if(n % 2==0){
                System.out.printf("%d은 %d자리의 짝수입니다",n,str.trim().length());
            }else{
                System.out.printf("%d은 %d자리의 홀수입니다",n,str.trim().length());
            }
        } catch (Exception e) {
           System.out.println(str+ "은 정수가 아닙니다");
        }
    }
}
