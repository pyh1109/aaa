package payment;
// Buyer.java 파일
import java.util.ArrayList;

public class Buyer {
    private String name;
    private ArrayList<Product> cart;
    private int totalPrice;

    public Buyer(String name) {
        this.name = name;
        this.cart = new ArrayList<Product>();
        this.totalPrice = 0;
    }

    public void addProduct(Product product) {
        cart.add(product);
        totalPrice += product.getPrice();
    }

    public void showCart() {
        System.out.println(name + "님의 장바구니:");
        for (Product product : cart) {
            product.showInfo();
        }
        System.out.println("총 가격: " + totalPrice + "원");
    }
}
