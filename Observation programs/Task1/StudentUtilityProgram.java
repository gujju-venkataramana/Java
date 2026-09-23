import java.util.Scanner;

public class StudentUtilityProgram {

    // Find factorial of a number
    static long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    // Check whether a number is prime
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Find maximum of two numbers
    static int maximum(int a, int b) {
        if (a > b) {
            return a;
        }

        return b;
    }

    // Calculate area of a circle
    static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== STUDENT UTILITY PROGRAM =====");
            System.out.println("1. Student Information and Result");
            System.out.println("2. Check Even or Odd");
            System.out.println("3. Largest of Three Numbers");
            System.out.println("4. Display Grade");
            System.out.println("5. Display Day of Week");
            System.out.println("6. Multiplication Table");
            System.out.println("7. Display Numbers from 1 to N");
            System.out.println("8. Sum of First N Natural Numbers");
            System.out.println("9. Fibonacci Series");
            System.out.println("10. Factorial");
            System.out.println("11. Check Prime");
            System.out.println("12. Maximum of Two Numbers");
            System.out.println("13. Area of Circle");
            System.out.println("14. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine();

                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter roll number: ");
                    int rollNo = sc.nextInt();

                    int total = 0;

                    System.out.println("Enter marks of 5 subjects:");

                    for (int i = 1; i <= 5; i++) {
                        System.out.print("Subject " + i + ": ");
                        int mark = sc.nextInt();
                        total = total + mark;
                    }

                    double percentage = total / 5.0;

                    System.out.println("\n----- STUDENT RESULT -----");
                    System.out.println("Name       : " + name);
                    System.out.println("Roll No    : " + rollNo);
                    System.out.println("Total      : " + total);
                    System.out.println("Percentage : " + percentage);

                    break;

                case 2:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();

                    if (num % 2 == 0) {
                        System.out.println("Even number");
                    } else {
                        System.out.println("Odd number");
                    }

                    break;

                case 3:
                    System.out.print("Enter three numbers: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();

                    int largest;

                    if (a >= b && a >= c) {
                        largest = a;
                    } else if (b >= a && b >= c) {
                        largest = b;
                    } else {
                        largest = c;
                    }

                    System.out.println("Largest number : " + largest);

                    break;

                case 4:
                    System.out.print("Enter percentage: ");
                    double percentageValue = sc.nextDouble();

                    if (percentageValue >= 90) {
                        System.out.println("Grade : A");
                    } else if (percentageValue >= 75) {
                        System.out.println("Grade : B");
                    } else if (percentageValue >= 60) {
                        System.out.println("Grade : C");
                    } else if (percentageValue >= 50) {
                        System.out.println("Grade : D");
                    } else {
                        System.out.println("Grade : F");
                    }

                    break;

                case 5:
                    System.out.print("Enter day number (1-7): ");
                    int day = sc.nextInt();

                    switch (day) {
                        case 1:
                            System.out.println("Monday");
                            break;
                        case 2:
                            System.out.println("Tuesday");
                            break;
                        case 3:
                            System.out.println("Wednesday");
                            break;
                        case 4:
                            System.out.println("Thursday");
                            break;
                        case 5:
                            System.out.println("Friday");
                            break;
                        case 6:
                            System.out.println("Saturday");
                            break;
                        case 7:
                            System.out.println("Sunday");
                            break;
                        default:
                            System.out.println("Invalid day number");
                    }

                    break;

                case 6:
                    System.out.print("Enter a number: ");
                    int tableNumber = sc.nextInt();

                    for (int i = 1; i <= 10; i++) {
                        System.out.println(
                            tableNumber + " x " + i + " = " + tableNumber * i
                        );
                    }

                    break;

                case 7:
                    System.out.print("Enter N: ");
                    int n = sc.nextInt();

                    int i = 1;

                    while (i <= n) {
                        System.out.print(i + " ");
                        i++;
                    }

                    System.out.println();

                    break;

                case 8:
                    System.out.print("Enter N: ");
                    int limit = sc.nextInt();

                    int sum = 0;
                    int j = 1;

                    do {
                        sum = sum + j;
                        j++;
                    } while (j <= limit);

                    System.out.println("Sum : " + sum);

                    break;

                case 9:
                    System.out.print("Enter number of terms: ");
                    int terms = sc.nextInt();

                    int first = 0;
                    int second = 1;

                    System.out.print("Fibonacci Series: ");

                    for (int k = 1; k <= terms; k++) {
                        System.out.print(first + " ");

                        int next = first + second;
                        first = second;
                        second = next;
                    }

                    System.out.println();

                    break;

                case 10:
                    System.out.print("Enter a number: ");
                    int factNumber = sc.nextInt();

                    System.out.println(
                        "Factorial : " + factorial(factNumber)
                    );

                    break;

                case 11:
                    System.out.print("Enter a number: ");
                    int primeNumber = sc.nextInt();

                    if (isPrime(primeNumber)) {
                        System.out.println("Prime number");
                    } else {
                        System.out.println("Not a prime number");
                    }

                    break;

                case 12:
                    System.out.print("Enter two numbers: ");
                    int x = sc.nextInt();
                    int y = sc.nextInt();

                    System.out.println(
                        "Maximum : " + maximum(x, y)
                    );

                    break;

                case 13:
                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();

                    System.out.println(
                        "Area : " + circleArea(radius)
                    );

                    break;

                case 14:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 14);

        sc.close();
    }
}