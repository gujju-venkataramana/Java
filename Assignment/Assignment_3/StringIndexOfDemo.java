public class StringIndexOfDemo {
    public static void main(String[] args) {

        String email = "rahul@gmail.com";

        // Find the position of @
        int position = email.indexOf("@");

        System.out.println("@ position: " + position);
    }
}