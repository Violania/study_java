package ex03_work;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Atm a1 = new Atm();
        int cash = 0;
        
        while (true) {
            System.out.print("1.입    금\n2.출    금\n3.잔액확인\nect.종  료\n>>\n");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("===입금액===");
                    System.out.print("입금액 : ");
                    cash = sc.nextInt();

                    a1.deposit(cash);
                    break;

                case 2:
                    System.out.println("===출금액===");
                    System.err.print("출금액 : ");
                    cash = sc.nextInt();

                    a1.wihtdrawal(cash);
                    break;

                case 3:
                    System.out.println("===잔액확인===");
                    a1.checkbalance();
                    break;

                default:
                    System.out.println("atm사용을 종료합니다");
                    return; //void에서 사용시 여기서 마지막을 의미함

            }
            System.out.println("-----------------");
        }     
                       
    }
}
// 1.입 급
// 2.출 금
// 3.잔액확인
// ect.종 료
// >>1
// ---입 금---
// 입금액 : 1000
// 입금성공 :
// ------------
// 1.입 급
// 2.출 금
// 3.잔액확인
// ect.종 료
// >>3
// ---잔액확인---
// 1000원
// -------------
// 1.입 급
// 2.출 금
// 3.잔액확인
// ect.종 료
// >>5
// atm 사용을 종료합니다
