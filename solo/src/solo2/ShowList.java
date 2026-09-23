package solo2;

import java.util.ArrayList;

public class ShowList {
    public void showList(ArrayList<Product> products) {
        System.out.println("상품  목록");
        for (int i = 0; i < products.size(); i++) {
            System.out.print((i + 1) + ". ");
            products.get(i).info();
            System.out.println();
        }
    }
}
