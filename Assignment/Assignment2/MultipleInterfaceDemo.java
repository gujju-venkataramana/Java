// First interface
interface Printable {

    void print();
}

// Second interface
interface Showable {

    void show();
}

// Class implements both interfaces
class Document implements Printable, Showable {

    public void print() {
        System.out.println("Printing document");
    }

    public void show() {
        System.out.println("Showing document");
    }
}

public class MultipleInterfaceDemo {
    public static void main(String[] args) {

        Document document = new Document();

        document.print();
        document.show();
    }
}