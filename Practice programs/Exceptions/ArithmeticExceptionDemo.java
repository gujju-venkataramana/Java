public class ArithmeticExceptionDemo {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            // Division by zero causes an exception
            int result = a / b;

            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }
}