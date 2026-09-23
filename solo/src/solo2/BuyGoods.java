package solo2;

import java.util.ArrayList;

public class BuyGoods {
    public void buyGoods(ArrayList<Product> products, int prodNum, int count) {
        ShowList sl = new ShowList();
        sl.showList(products);

        if (products.isEmpty())
            return;

        if (prodNum < 1 || prodNum > products.size()) {
            System.out.println("존재하지 않는 상품 번호입니다.");
            return;
        }

        if (products.get(prodNum - 1).reduceStock(count)) {
            int totalPrice = products.get(prodNum - 1).getPrice() * count;

            System.out.println("\n" + products.get(prodNum - 1).getGoods() + " " + count + "개를 구매했습니다.");
            System.out.println("결제 금액 : " + totalPrice + "원");
            System.out.println("남은 재고 : " + products.get(prodNum - 1).getStock() + "개");
        }
    }
}
