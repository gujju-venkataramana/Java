public class StringConcatDemo {
    public static void main(String[] args) {

        String firstName = "Rahul";
        String lastName = "Kumar";

        // Join two strings
        String fullName = firstName.concat(" ").concat(lastName);

        System.out.println("Full Name: " + fullName);
    }
}