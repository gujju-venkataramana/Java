public class StringEqualsIgnoreCaseDemo {
    public static void main(String[] args) {

        String answer = "YES";

        // Ignore uppercase and lowercase differences
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("User agreed");
        }
    }
}