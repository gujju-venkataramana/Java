import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourcesDemo {

    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("sample.txt")) {

            writer.write("Hello Java");
            System.out.println("Data written successfully");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
