abstract class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public abstract double calculateInterest();

    public void displayInterest() {
        System.out.printf("Balance: %.2f and Interest: %.2f\n", balance, calculateInterest());
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(double balance) {
        super(balance);
    }

    public double calculateInterest() {
        return balance * 0.04;
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(double balance) {
        super(balance);
    }

    public double calculateInterest() {
        return balance * 0.02;
    }
}

public class BankSystem {
    public static void main(String[] args) {

        Account acc1 = new SavingsAccount(10000);
        Account acc2 = new CurrentAccount(15000);

        System.out.println("Savings Account:");
        acc1.displayInterest();

        System.out.println("\nCurrent Account:");
        acc2.displayInterest();
    }
}
