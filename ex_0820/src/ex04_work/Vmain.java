package ex04_work;

import java.util.Scanner;

public class Vmain {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("금액 : ");
        int money = sc.nextInt();

        Vending ven = new Vending();
        ven.init();//음료수 정보 입력

        ven.showDrink(money);
        System.out.print(">>");

        String name = sc.next();
        ven.dispense(name);

    }//main
}
