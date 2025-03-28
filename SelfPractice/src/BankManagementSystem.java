import java.util.ArrayList;
import java.util.Scanner;

class Transaction {
    private String type;
    private double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return type + ": " + amount;
    }
}

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private ArrayList<Transaction> transactions;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction("Deposit", amount));
            System.out.println("Successfully deposited " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("Withdraw", amount));
            System.out.println("Successfully withdrew " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void showTransactionHistory() {
        System.out.println("Transaction History for Account: " + accountNumber);
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            for (Transaction transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }

    public boolean transferTo(BankAccount target, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            target.deposit(amount);
            transactions.add(new Transaction("Transfer to " + target.getAccountHolder(), amount));
            return true;
        } else {
            System.out.println("Transfer failed: insufficient balance or invalid amount.");
            return false;
        }
    }
}

public class BankManagementSystem {
    private static ArrayList<BankAccount> accounts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    private static BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Bank Management System ===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Transfer Funds");
            System.out.println("6. Transaction History");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    transferFunds();
                    break;
                case 6:
                    showTransactionHistory();
                    break;
                case 7:
                    System.out.print("Are you sure you want to exit? (yes/no): ");
                    if (scanner.next().equalsIgnoreCase("yes")) {
                        System.out.println("Thank you for using the Bank Management System.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private static void createAccount() {
        System.out.print("Enter account holder name: ");
        String name = scanner.next();
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        accounts.add(new BankAccount(name, accountNumber, balance));
        System.out.println("Account successfully created!");
    }

    private static void deposit() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            System.out.print("Enter deposit amount: ");
            double amount = scanner.nextDouble();
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void withdraw() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void checkBalance() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.checkBalance();
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void transferFunds() {
        System.out.print("Enter your account number: ");
        String senderAccountNumber = scanner.next();
        BankAccount senderAccount = findAccount(senderAccountNumber);
        if (senderAccount != null) {
            System.out.print("Enter recipient account number: ");
            String recipientAccountNumber = scanner.next();
            BankAccount recipientAccount = findAccount(recipientAccountNumber);
            if (recipientAccount != null) {
                System.out.print("Enter transfer amount: ");
                double amount = scanner.nextDouble();
                if (senderAccount.transferTo(recipientAccount, amount)) {
                    System.out.println("Transfer successful!");
                }
            } else {
                System.out.println("Recipient account not found.");
            }
        } else {
            System.out.println("Your account not found.");
        }
    }

    private static void showTransactionHistory() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.showTransactionHistory();
        } else {
            System.out.println("Account not found.");
        }
    }
}
