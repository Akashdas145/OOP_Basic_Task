import java.util.ArrayList;

class Account {
    private String name;
    private String accountNumber;
    private double balance;

    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Insufficient balance for withdrawal.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    // Method to display account details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance);
    }
}
class Bank {
    private ArrayList<Account> accounts;
    // Constructor to initialize the list of accounts
    public Bank() {
        accounts = new ArrayList<>();
    }
    // Method to add an account to the bank
    public void addAccount(Account account) {
        accounts.add(account);
    }
    // Method to display all account details
    public void displayAllAccounts() {
        for (Account account : accounts) {
            account.displayDetails();
        }
    }
    // Getter for accounts (for demonstration purposes)
    public Account getAccount(int index) {
        if (index >= 0 && index < accounts.size()) {
            return accounts.get(index);
        }
        return null;
    }
}
public class BankTest {
    public static void main(String[] args) {
        // Creating bank object
        Bank bank = new Bank();

        // Adding accounts to the bank
        bank.addAccount(new Account("Peter Irmgard", "C0011", 5000));
        bank.addAccount(new Account("Katja Ruedi", "C0121", 4500));
        bank.addAccount(new Account("Marcella Gebhard", "C0222", 20000));

        // Display all account details before transactions
        System.out.println("Before transactions:");
        bank.displayAllAccounts();

        // Perform deposit and withdrawal transactions
        System.out.println("\nAfter depositing 1000 into account1:");
        bank.getAccount(0).deposit(1000);
        bank.displayAllAccounts();

        System.out.println("\nNo transaction in account2:");
        // No transaction for account2

        System.out.println("\nAfter withdrawing 5000 from account3:");
        bank.getAccount(2).withdraw(5000);
        bank.displayAllAccounts();
    }
}