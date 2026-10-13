import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PhoneLetterCombinations
{
    static String[] letters =
    {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    }
    ;
    static List<String> combinations(String digits)
    {
        List<String> result = new ArrayList<String>();
        result.add("");
        for (int i = 0; i < digits.length(); i++)
        {
            int digit = digits.charAt(i) - '0';
            if (digit < 2 || digit > 9) return new ArrayList<String>();
            List<String> next = new ArrayList<String>();
            for (String prefix : result)
            {
                for (int j = 0; j < letters[digit].length(); j++)
                next.add(prefix + letters[digit].charAt(j));
            }
            result = next;
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digits from 2 to 9: ");
        String digits = sc.nextLine().trim();
        System.out.println(digits.length() == 0 ? "[]" : combinations(digits));
        sc.close();
    }
}
