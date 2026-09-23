import java.util.Scanner;

interface PaymentService {
    void pay(String receiverUPI, double amount)
            throws InvalidUPIException, InvalidAmountException,
                   InsufficientBalanceException;

    void checkBalance();
}

class Wallet {
    private String userName;
    private String mobileNumber;
    private String upiId;
    private double balance;

    Wallet(String userName, String mobileNumber,
           String upiId, double balance) {
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.upiId = upiId;
        this.balance = balance;
    }

    void addMoney(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount");
        }

        balance = balance + amount;
        System.out.println("Money added: " + amount);
    }

    double getBalance() {
        return balance;
    }

    void displayWalletDetails() {
        System.out.println("User Name     : " + userName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("UPI ID        : " + upiId);
        System.out.println("Balance       : " + balance);
    }

    void deductMoney(double amount) {
        balance = balance - amount;
    }
}

class UPIPayment implements PaymentService {
    private Wallet wallet;

    UPIPayment(Wallet wallet) {
        this.wallet = wallet;
    }

    public void pay(String receiverUPI, double amount)
            throws InvalidUPIException, InvalidAmountException,
                   InsufficientBalanceException {

        if (!receiverUPI.contains("@") ||
            receiverUPI.startsWith("@") ||
            receiverUPI.endsWith("@")) {
            throw new InvalidUPIException("Invalid UPI ID");
        }

        if (amount <= 0) {
            throw new InvalidAmountException("Invalid payment amount");
        }

        if (amount > wallet.getBalance()) {
            throw new InsufficientBalanceException(
                "Insufficient wallet balance"
            );
        }

        wallet.deductMoney(amount);

        System.out.println("Payment successful");
        System.out.println("Paid: " + amount);
        System.out.println("To: " + receiverUPI);
    }

    public void checkBalance() {
        System.out.println("Available Balance: " + wallet.getBalance());
    }
}

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidUPIException extends Exception {
    InvalidUPIException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        super(message);
    }
}

public class DigitalPaymentDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== DIGITAL PAYMENT WALLET =====");

        System.out.print("Enter User Name: ");
        String userName = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobileNumber = sc.nextLine();

        System.out.print("Enter UPI ID: ");
        String upiId = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        Wallet wallet = new Wallet(
            userName, mobileNumber, upiId, balance
        );

        UPIPayment payment = new UPIPayment(wallet);

        System.out.println("\n===== WALLET DETAILS =====");
        wallet.displayWalletDetails();

        System.out.println("\n===== TRANSACTION =====");

        try {
            System.out.print("Enter amount to add: ");
            double addAmount = sc.nextDouble();

            wallet.addMoney(addAmount);

            sc.nextLine();

            System.out.print("Enter Receiver UPI ID: ");
            String receiverUPI = sc.nextLine();

            System.out.print("Enter Payment Amount: ");
            double paymentAmount = sc.nextDouble();

            payment.pay(receiverUPI, paymentAmount);

            payment.checkBalance();

        } catch (InvalidUPIException |
                 InvalidAmountException |
                 InsufficientBalanceException e) {

            System.out.println("Transaction failed: " + e.getMessage());

        } finally {
            System.out.println("Transaction process completed.");
        }

        System.out.println("\n===== FINAL WALLET =====");
        wallet.displayWalletDetails();

        sc.close();
    }
}