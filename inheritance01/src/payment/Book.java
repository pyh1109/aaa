package payment;
// Book.java 파일
public class Book extends Product {
    private String author;
    private String publisher;
    private int publishYear;
    private int numPages;

    public Book(String name, int price, String author, String publisher, int publishYear, int numPages) {
        super(name, price);
        this.author = author;
        this.publisher = publisher;
        this.publishYear = publishYear;
        this.numPages = numPages;
    }

    @Override
    public void showInfo() {
        System.out.println("도서 정보:");
        System.out.println("- 제목: " + getName());
        System.out.println("- 저자: " + author);
        System.out.println("- 출판사: " + publisher);
        System.out.println("- 출판년도: " + publishYear);
        System.out.println("- 페이지 수: " + numPages);
        System.out.println("- 가격: " + getPrice() + "원");
    }
}
