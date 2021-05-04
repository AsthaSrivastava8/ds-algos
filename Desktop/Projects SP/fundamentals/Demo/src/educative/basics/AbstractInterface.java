package educative.basics;

public class AbstractInterface extends Book {

    AbstractInterface(String title, String author, String price) {
        super(title, author, price);
    }


    public static void main(String[] args) {
        Book book = new AbstractInterface("Harry Potter", "JK Rowling", "100");
        System.out.println(book.getDetails());
    }


    @Override
    String getDetails() {
        return title + ", " + author + ", " + price;
    }
}

abstract class Book {
    protected String title;
    protected String author;
    protected String price;

    abstract String getDetails();

    Book(String title, String author, String price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
