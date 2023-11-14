package  payment;
// Toy.java 파일
public class Toy extends Product {
    private String brand;

    public Toy(String name, int price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public void showInfo() {
        System.out.println("장난감 정보:");
        System.out.println("- 이름: " + getName());
        System.out.println("- 브랜드: " + brand);
        System.out.println("- 가격: " + getPrice() + "원");
    }
}
