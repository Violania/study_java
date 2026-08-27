package ex03_work;

public class Atm {

    private int depositcash = 0;//잔액, atm 클래스 내부에서만 접근할수 있도록

    // 입금
    public int deposit(int cash) {
        
        System.out.println(cash + " 원 입금");
        return depositcash += cash;//=을 빼먹어서 오류있었음

    }

    // 출금
    public void wihtdrawal(int cash) {// W대문자 주의 (안보여) w가 소문자
        if (depositcash < cash) {
            System.out.println("잔액이 부족합니다");
        } else {
            System.out.println(cash + "원 출금");
            depositcash -= cash;
        }
       

    }

    // 잔액확인 
    public void checkbalance() {
        System.out.println(depositcash + " 원");
    }

}
