import java.io.File;
import java.io.IOException;

public class FileOperationsDemo {

    public static void main(String[] args) {

        File file = new File("sample.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists");
            }

            System.out.println("File Name: " + file.getName());
            System.out.println("File Path: " + file.getAbsolutePath());
            System.out.println("Exists: " + file.exists());
            System.out.println("Is File: " + file.isFile());
            System.out.println("File Size: " + file.length() + " bytes");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
