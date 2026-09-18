public class ArrayExceptionDemo {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30};

        try {
            // Valid indexes are 0, 1 and 2
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.");
        }
    }
}