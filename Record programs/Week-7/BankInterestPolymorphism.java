import java.util.Scanner;
class RBI
{
    double getInterestRate()
    {
        return 4.0;
    }
}
class SBI extends RBI
{
    @Override double getInterestRate()
    {
        return 7.0;
    }
}
class ICICI extends RBI
{
    @Override double getInterestRate()
    {
        return 6.5;
    }
}
public class BankInterestPolymorphism
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bank name (RBI/SBI/ICICI): ");
        String name = sc.nextLine().trim().toUpperCase();
        RBI bank;
        if (name.equals("SBI")) bank = new SBI();
        else if (name.equals("ICICI")) bank = new ICICI();
        else bank = new RBI();
        System.out.println(name + " rate of interest is: " + bank.getInterestRate() + "%");
        sc.close();
    }
}
