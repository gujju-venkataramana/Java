// Interface
interface Borrowable {
    void borrowBook();
}

// Base class
class LibraryItem {
    String title;

    LibraryItem(String title) {
        this.title = title;
    }

    void display() {
        System.out.println("Library Item: " + title);
    }
}

// Inheritance + Method Overriding
class Book extends LibraryItem implements Borrowable {
    private int bookId;
    private double price;

    // Default constructor
    Book() {
        super("Unknown");
        bookId = 0;
        price = 0;
    }

    // Parameterized constructor
    Book(int bookId, String title, double price) {
        super(title);
        this.bookId = bookId;
        this.price = price;
    }

    // Encapsulation
    void setPrice(double price) {
        this.price = price;
    }

    double getPrice() {
        return price;
    }

    @Override
    void display() {
        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Price   : " + price);
    }

    public void borrowBook() {
        System.out.println("Book borrowed successfully.");
    }

    // Method Overloading
    void searchBook(String title) {
        System.out.println("Searching book: " + title);
    }

    void searchBook(int bookId) {
        System.out.println("Searching book ID: " + bookId);
    }
}

// Abstraction
abstract class LibraryService {
    abstract void service();
}

class IssueService extends LibraryService {
    void service() {
        System.out.println("Book issue service");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {

        // Class and Object
        Book book = new Book(101, "Java Programming", 450);

        book.display();

        // Encapsulation
        book.setPrice(500);
        System.out.println("Updated Price: " + book.getPrice());

        // Method Overloading
        book.searchBook("Java Programming");
        book.searchBook(101);

        // Interface
        book.borrowBook();

        // Abstraction
        LibraryService service = new IssueService();
        service.service();
    }
}