public class NumberFormatExceptionDemo {
    public static void main(String[] args) {

        String value = "abc";

        try {
            // "abc" cannot be converted to an integer
            int number = Integer.parseInt(value);

            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }
}