package lab.assignments;

public class SuperSavingsAccount extends SavingsAccount {
    private double bonusAmount = 25;

    public SuperSavingsAccount(String owner, String accountNumber, double balance, double withdrawLimit) {
        super(owner, accountNumber, balance, withdrawLimit);
    }

    @Override
    public void deposit(double amount) {
        double totalDeposit = amount + bonusAmount;
        super.deposit(totalDeposit);
        System.out.println("Bonus $" + bonusAmount + " added!");
    }
}
