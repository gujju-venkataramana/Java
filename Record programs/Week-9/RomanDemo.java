import java.util.Scanner;
import number.Roman;
public class RomanDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roman numeral (uppercase): ");
        String text = sc.nextLine().trim();
        Roman roman = new Roman();
        System.out.println("Integer value: " + roman.romanToInteger(text));
        sc.close();
    }
}
