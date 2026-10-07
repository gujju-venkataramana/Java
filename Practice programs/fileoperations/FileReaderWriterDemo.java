import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {

    public static void main(String[] args) {

        String message = "Welcome to Java File Handling";

        try {
            FileWriter writer = new FileWriter("text.txt");

            writer.write(message);
            writer.close();

            System.out.println("Text written successfully");

            FileReader reader = new FileReader("text.txt");

            int data;

            System.out.println("File Content:");

            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
