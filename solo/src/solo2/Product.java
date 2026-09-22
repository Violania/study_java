package solo2;

public class Product {
    private String goods;
    private int price;
    private int stock;

    public Product(String goods, int price, int stock) {
        this.goods = goods;
        this.price = price;
        this.stock = stock;

    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //추가
    public void addStock(int num){
        this.stock += num;
    }
    //감소
    public boolean reduceStock(int num) {
        if (this.stock < num) {
            System.out.println("재고가 부족합니다 (현재 재고 : " + this.stock + "개)");
            return false;
        }
        this.stock -= num;
        return true;
    }

    public void info(){
        System.out.printf("%s - 가격 : %d원, 재고 : %d개",goods,price,stock);
    }

}
