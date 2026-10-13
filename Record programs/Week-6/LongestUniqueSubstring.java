import java.util.Scanner;
public class LongestUniqueSubstring
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine(), longest = "";
        for (int i = 0; i < text.length(); i++)
        {
            String current = "";
            for (int j = i; j < text.length(); j++)
            {
                char ch = text.charAt(j);
                if (current.indexOf(ch) >= 0) break;
                current += ch;
            }
            if (current.length() > longest.length()) longest = current;
        }
        System.out.println("Longest substring: " + longest);
        System.out.println("Length: " + longest.length());
        sc.close();
    }
}
