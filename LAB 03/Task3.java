import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    static int totalAccounts = 0;

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance amount! Balance cannot be negative.");
        }
    }

    public double getBalance() {
        return this.balance;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BankAccount acc1 = new BankAccount();
        System.out.print("Enter Account 1 Name: ");
        acc1.setAccountHolder(input.nextLine());
        System.out.print("Enter Account 1 Number: ");
        acc1.setAccountNumber(input.nextLine());
        System.out.print("Enter Account 1 Initial Balance: ");
        acc1.setBalance(input.nextDouble());
        BankAccount.totalAccounts++;
        input.nextLine();

        BankAccount acc2 = new BankAccount();
        System.out.println();
        System.out.print("Enter Account 2 Name: ");
        acc2.setAccountHolder(input.nextLine());
        System.out.print("Enter Account 2 Number: ");
        acc2.setAccountNumber(input.nextLine());
        System.out.print("Enter Account 2 Initial Balance: ");
        acc2.setBalance(input.nextDouble());
        BankAccount.totalAccounts++;

        System.out.println("Account 1 Details");
        System.out.println("Holder: " + acc1.getAccountHolder());
        System.out.println("Account : " + acc1.getAccountNumber());
        System.out.println("Balance: " + acc1.getBalance());

        System.out.println(" Account 2 Details ");
        System.out.println("Holder: " + acc2.getAccountHolder());
        System.out.println("Account : " + acc2.getAccountNumber());
        System.out.println("Balance: " + acc2.getBalance());

        System.out.println("Total Accounts Created: " + BankAccount.totalAccounts);

        input.close();
    }
}
