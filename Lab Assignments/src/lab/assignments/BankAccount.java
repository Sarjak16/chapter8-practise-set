package lab.assignments;

public class BankAccount {
    private String customerName;
    private String accountNumber;
    protected double balance;

    public BankAccount() {
        this.customerName = "";
        this.accountNumber = "";
        this.balance = 0.0;
    }

    public BankAccount(String customerName, String accountNumber, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= 0)
            balance -= amount;
        else
            System.out.println("Withdrawal denied: insufficient funds.");
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    // This method is required for CreditAccount to set balance
    protected void setBalance(double balance) {
        this.balance = balance;
    }
}
