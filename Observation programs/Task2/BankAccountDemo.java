class Account {
    protected int accountNumber;
    protected String accountHolder;
    protected double balance;
    protected String accountType;

    Account(int accountNumber, String accountHolder,
            double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void transfer(Account account, double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            account.balance = account.balance + amount;
            System.out.println("Transferred: " + amount);
        } else {
            System.out.println("Insufficient balance for transfer");
        }
    }

    void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : " + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    SavingsAccount(int accountNumber, String accountHolder,
                   double balance, double interestRate) {
        super(accountNumber, accountHolder, balance, "Savings");
        this.interestRate = interestRate;
    }

    double calculateInterest() {
        return balance * interestRate / 100;
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    CurrentAccount(int accountNumber, String accountHolder,
                   double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance, "Current");
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal limit exceeded");
        }
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {

        SavingsAccount savings =
            new SavingsAccount(101, "Rahul", 10000, 5);

        CurrentAccount current =
            new CurrentAccount(102, "Ravi", 5000, 3000);

        System.out.println("===== BEFORE TRANSACTIONS =====");
        savings.displayAccountDetails();
        System.out.println();
        current.displayAccountDetails();

        System.out.println("\n===== TRANSACTIONS =====");

        savings.deposit(2000);
        savings.withdraw(1000);

        double interest = savings.calculateInterest();
        savings.deposit(interest);
        System.out.println("Interest Added: " + interest);

        current.withdraw(7000);

        savings.transfer(current, 2000);

        System.out.println("\n===== AFTER TRANSACTIONS =====");
        savings.displayAccountDetails();
        System.out.println();
        current.displayAccountDetails();
    }
}