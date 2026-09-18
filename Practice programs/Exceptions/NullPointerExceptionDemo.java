public class NullPointerExceptionDemo {
    public static void main(String[] args) {

        String name = null;

        try {
            // name does not refer to any object
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("Object reference is null.");
        }
    }
}