import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class ValidParentheses
{
    static boolean isValid(String text)
    {
        Deque<Character> stack = new ArrayDeque<Character>();
        for (int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') stack.push(ch);
            else if (ch == ')' || ch == ']' || ch == '}')
            {
                if (stack.isEmpty()) return false;
                char open = stack.pop();
                if ((ch == ')' && open != '(') || (ch == ']' && open != '[')
                || (ch == '}' && open != '{')) return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bracket expression: ");
        String text = sc.nextLine();
        System.out.println(isValid(text) ? "Valid Parentheses" : "Invalid Parentheses");
        sc.close();
    }
}
