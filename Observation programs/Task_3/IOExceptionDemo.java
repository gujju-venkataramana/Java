import java.io.FileReader;
import java.io.IOException;

public class IOExceptionDemo {
    public static void main(String[] args) {

        try {
            // Try to open a file
            FileReader file = new FileReader("data.txt");

            file.close();

            System.out.println("File opened successfully.");
        } catch (IOException e) {
            System.out.println("File could not be opened.");
        }
    }
}