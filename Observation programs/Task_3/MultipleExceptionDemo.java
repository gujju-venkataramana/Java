public class MultipleExceptionDemo {
    public static void main(String[] args) {

        try {
            int[] numbers = {10, 20, 30};

            // This causes an array exception
            System.out.println(numbers[5]);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error.");
        }
    }
}