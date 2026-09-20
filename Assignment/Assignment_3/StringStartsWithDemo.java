public class StringStartsWithDemo {
    public static void main(String[] args) {

        String phone = "+91 9876543210";

        // Check the country code
        if (phone.startsWith("+91")) {
            System.out.println("Indian number");
        }
    }
}