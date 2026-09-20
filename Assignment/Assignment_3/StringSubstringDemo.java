public class StringSubstringDemo {
    public static void main(String[] args) {

        String email = "rahul@gmail.com";

        // Extract username before @
        String username = email.substring(0, email.indexOf("@"));

        System.out.println("Username: " + username);
    }
}