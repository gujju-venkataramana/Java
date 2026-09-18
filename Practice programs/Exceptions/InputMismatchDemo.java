import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();

            System.out.println("Number: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Please enter an integer.");
        }

        sc.close();
    }
}