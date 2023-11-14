package  payment;

public class Main {
    public static void main(String[] args) {
        Buyer buyer = new Buyer("홍길동");
        Book book = new Book("자바의 정석", 30000, "남궁성", "도우출판사", 2016, 720);
        Toy toy = new Toy("레고 블록", 50000, "레고");

        buyer.addProduct(book);
        buyer.addProduct(toy);
        buyer.showCart();
    }
}





