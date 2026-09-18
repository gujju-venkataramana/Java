public class StringIndexExceptionDemo {
    public static void main(String[] args) {

        String name = "Java";

        try {
            // Valid indexes are 0 to 3
            System.out.println(name.charAt(5));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid string index.");
        }
    }
}