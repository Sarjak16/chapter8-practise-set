package lab.assignments;

public class CreditAccount extends BankAccount {
    private double creditLimit;

    public CreditAccount() {
        super();
        this.creditLimit = 500; // default credit limit
    }

    public CreditAccount(String customerName, String accountNumber, double balance, double creditLimit) {
        super(customerName, accountNumber, balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount) >= -creditLimit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Withdrawal denied: credit limit exceeded.");
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            super.deposit(amount);
            if (amount >= 2000) {
                // 50% chance of bonus
                if (Math.random() < 0.5) {
                    System.out.println("Bonus $25 added!");
                    super.deposit(25);
                }
            }
        }
    }
}

