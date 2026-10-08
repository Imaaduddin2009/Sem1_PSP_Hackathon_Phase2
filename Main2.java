import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Amount withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance. Withdrawal failed.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }


    public double checkBalance() {
        return balance;
    }
    
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number:");
        String accountNumber = sc.next();

        System.out.println("Enter account holder name:");
        String accountHolderName = sc.next();

        System.out.println("Enter initial balance:");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accountNumber, accountHolderName, balance);

        System.out.println("Enter deposit amount:");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.println("Enter withdrawal amount:");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        System.out.println("\nFinal Account Details:");
        account.displayAccount();

        sc.close();
    }
}