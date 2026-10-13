import java.util.Scanner;
public class PrimePalindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt(), original = number;
        boolean prime = number > 1;
        for (int i = 2; i * i <= number; i++)
        {
            if (number % i == 0)
            {
                prime = false;
                break;
            }
        }
        int reverse = 0;
        while (number > 0)
        {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        if (prime && original == reverse) System.out.println(original + " is a prime palindrome");
        else System.out.println(original + " is not a prime palindrome");
        sc.close();
    }
}
