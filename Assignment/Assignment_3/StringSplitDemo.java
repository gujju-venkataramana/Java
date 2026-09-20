public class StringSplitDemo {
    public static void main(String[] args) {

        String skills = "Java,Python,SQL";

        // Split the string using comma
        String[] skillList = skills.split(",");

        for (String skill : skillList) {
            System.out.println(skill);
        }
    }
}