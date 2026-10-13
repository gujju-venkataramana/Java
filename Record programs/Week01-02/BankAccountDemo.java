import java.util.Scanner;
class Account
{
    int accountNumber;
    double balance;
    Account(int accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
        else System.out.println("Invalid deposit amount");
    }
    void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
        else System.out.println("Insufficient balance or invalid amount");
    }
    void display()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends Account
{
    double interestRate;
    SavingsAccount(int number, double balance, double rate)
    {
        super(number, balance);
        interestRate = rate;
    }
    void calculateInterest()
    {
        System.out.println("Interest: " + (balance * interestRate / 100));
    }
}
class CurrentAccount extends Account
{
    double overdraftLimit;
    CurrentAccount(int number, double balance, double limit)
    {
        super(number, balance);
        overdraftLimit = limit;
    }
    void displayLimit()
    {
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}
public class BankAccountDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        SavingsAccount savings = new SavingsAccount(101, 5000, 5);
        CurrentAccount current = new CurrentAccount(102, 8000, 2000);
        System.out.println("SAVINGS ACCOUNT");
        savings.display();
        System.out.print("Enter deposit amount: ");
        savings.deposit(sc.nextDouble());
        System.out.print("Enter withdrawal amount: ");
        savings.withdraw(sc.nextDouble());
        savings.calculateInterest();
        System.out.println("\nCURRENT ACCOUNT");
        current.display();
        current.displayLimit();
        sc.close();
    }
}
