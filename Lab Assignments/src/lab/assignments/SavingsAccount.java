package lab.assignments;

public class SavingsAccount {
    private String owner;
    private String accountNumber;
    protected double balance;
    private double withdrawLimit;

    public SavingsAccount(String owner, String accountNumber, double balance, double withdrawLimit) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public boolean withdraw(double amount) {
        if (amount > withdrawLimit) {
            System.out.println("Withdrawal denied: amount exceeds withdraw limit.");
            return false;
        } else if (amount > balance) {
            System.out.println("Withdrawal denied: insufficient balance.");
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
