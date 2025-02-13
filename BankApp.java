// Base class
abstract  class BankAccount {
    protected double balance;

    // Constructor to initialize balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + ", New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Abstract withdraw method
    public abstract void withdraw(double amount);

    // Method to display balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

// Subclass - SavingsAccount
class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    // Override withdraw method with minimum balance condition
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= 100) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + ", New Balance: $" + balance);
        } else {
            System.out.println("Withdrawal denied! Minimum balance of $100 required.");
        }
    }
}

// Subclass - CheckingAccount
class CheckingAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 1.0;

    public CheckingAccount(double balance) {
        super(balance);
    }

    // Override withdraw method with transaction fee
    @Override
    public void withdraw(double amount) {
        double totalAmount = amount + TRANSACTION_FEE;
        if (amount > 0 && balance >= totalAmount) {
            balance -= totalAmount;
            System.out.println("Withdrew: $" + amount + " (Fee: $1), New Balance: $" + balance);
        } else {
            System.out.println("Withdrawal denied! Insufficient funds.");
        }
    }
}

// Main Class to Test Accounts
public class BankApp {
    public static void main(String[] args) {
        System.out.println("=== Savings Account ===");
        SavingsAccount savings = new SavingsAccount(500);
        savings.deposit(100);
        savings.withdraw(450); // Should be denied
        savings.withdraw(300); // Should be allowed

        System.out.println("\n=== Checking Account ===");
        CheckingAccount checking = new CheckingAccount(200);
        checking.deposit(50);
        checking.withdraw(30);  // $30 + $1 fee = $31
        checking.withdraw(220); // Should be denied
    }
}