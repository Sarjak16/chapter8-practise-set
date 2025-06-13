package lab.assignments;

public class Week10Test {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("Emily", "S100", 5000, 1000);
        SuperSavingsAccount superSavings = new SuperSavingsAccount("Tom", "SS100", 6000, 500);

        // Withdraw more than limit: should be denied
        savings.withdraw(4500);
        System.out.println("Savings balance: " + savings.getBalance());

        // Withdraw within limit: allowed
        savings.withdraw(300);
        System.out.println("Savings balance: " + savings.getBalance());

        // Deposit into super savings: should add bonus
        superSavings.deposit(2000);
        System.out.println("SuperSavings balance: " + superSavings.getBalance());
    }
}
