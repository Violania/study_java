package ex06_overload;

import java.util.Scanner;

public class BreadMain {
    public static void main(String[] args) {

        // 빵을 만들었습니다 <--메서드 1번 호출
        // -------------------
        // 빵을 만들었습니다
        // 빵을 만들었습니다
        // 요청하신 2개의 빵을 만들었습니다 <--------메서드2 호출
        // -------------------------------
        // 크림빵을 만들었습니다
        // 크림빵을 만들었습니다
        // 요청하신 2개의 크림빵을 만들었습니다 < -----메서드3 호출
        Scanner sc = new Scanner(System.in);
        Bread br = new Bread();

        br.makeBread();
        System.out.println("---------");

        System.out.print("갯수 : ");
        int n = sc.nextInt();
        br.makeBread(n);
        System.out.println("---------");

        System.out.print("종류 : ");
        String str = sc.next();
        System.out.print("갯수 : ");
        int n1 = sc.nextInt();
        br.makeBread(str, n1);

    }
}
