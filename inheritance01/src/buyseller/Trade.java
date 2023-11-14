package buyseller;
import java.util.Scanner;
//import inheritance.Ex02_construct;
public class Trade {
    private String productName;
    private int price;

    public Trade(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public void displayPurchase() {
        System.out.println("구매한 물품: " + productName);
        System.out.println("지불해야 할 금액: " + price + "원");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 물품명과 가격 입력 받기
        System.out.print("구매한 물품명을 입력하세요: ");
        String productName = scanner.nextLine();

        System.out.print("구매한 물품의 가격을 입력하세요: ");
        int price = scanner.nextInt();

        // Purchase 객체 생성하여 물품과 지불금액 출력하기
        Trade purchase = new Trade(productName, price);
        purchase.displayPurchase();

        scanner.close();
    }
}
