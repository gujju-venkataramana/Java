import java.util.Scanner;

public class NestedIfDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {

            System.out.print("Enter your citizenship status (1 for Indian): ");
            int citizen = sc.nextInt();

            if (citizen == 1) {
                System.out.println("Eligible to vote.");
            } else {
                System.out.println("Not eligible to vote.");
            }

        } else {
            System.out.println("Not eligible to vote.");
        }

        sc.close();
    }
}