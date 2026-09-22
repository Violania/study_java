package solo2;

import java.util.ArrayList;
import java.util.Scanner;

public class StoreMain {
    public static void main(String[] args) {
        // 2. 🟢 간단한 상점 프로그램
        // Product 클래스를 만들고 상품을 관리한다.
        // 상품에는 다음 정보가 있다.
        // 상품명
        // 가격
        // 재고
        // 메인에서 상품 여러 개를 등록하고 사용자에게 메뉴를 보여준다.
        // ===== 상점 =====
        // 1. 상품 목록
        // 2. 상품 구매
        // 3. 상품 추가
        // 4. 종료
        // 선택 :
        // 상품 구매를 선택하면 상품 번호와 수량을 입력받는다.
        // 예:
        // 상품 번호 : 2
        // 구매 수량 : 3
        // 감자칩 3개를 구매했습니다.
        // 결제 금액 : 4500원
        // 남은 재고 : 7개
        // 연습 포인트 : 클래스,생성자,ArrayList,Scanner,if / switch,반복문,메서드 분리

        ArrayList<Product> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1.상품 목록\n2.상품 구매\n3.상품 추가\n4.종 료\n선택 : \n");
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
}
