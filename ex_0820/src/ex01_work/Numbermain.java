package ex01_work;

import java.util.Scanner;

public class Numbermain {
    public static void main(String[] args) {

        // 값 : 100
        // 100은 숫자입니까? true

        // 값 :abc123
        // abc123은 숫자입니까? false

        Scanner sc = new Scanner(System.in);
        System.out.print("값 : ");
        String num = sc.next();

       
        Numbersub nc = new Numbersub();
        nc.numbercheck(num);

        // boolean res = nc.isNumber(num);
        // System.out.println(num + "은 숫자입니까?" + res);

    }

}
