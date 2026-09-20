public class StringEqualsDemo {
    public static void main(String[] args) {

        String enteredPassword = "java123";
        String correctPassword = "java123";

        // Compare the actual string values
        if (enteredPassword.equals(correctPassword)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Wrong password");
        }
    }
}