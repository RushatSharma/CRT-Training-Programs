abstract class Account {
    private String accountNumber;
    private double balance;

    public Account(String accNum, double initialBalance) {
        this.accountNumber = accNum;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    protected void setBalance(double amount) {
        this.balance = amount;
    }

    public abstract void withdraw(double amount);
}

class SavingsAccount extends Account {

    public SavingsAccount(String accNum, double initialBalance) {
        super(accNum, initialBalance);
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Withdrawal failed: Insufficient balance or invalid amount.");
        }
    }
}

public class ATMSystem {
    public static void main(String[] args) {

        SavingsAccount myAccount = new SavingsAccount("ACC12345", 1000.0);

        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Opening Balance: ₹" + myAccount.getBalance());

        myAccount.deposit(500.0);

        myAccount.withdraw(300.0);

        myAccount.withdraw(2000.0);

        System.out.println("Final Balance: ₹" + myAccount.getBalance());
    }
}
