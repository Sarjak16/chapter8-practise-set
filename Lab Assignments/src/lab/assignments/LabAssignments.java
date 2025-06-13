package lab.assignments;

public class LabAssignments {

    public static void main(String[] args) {
        // Test BankAccount
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount("Alice", "ACC123", 5000);

        account1.deposit(1000);
        account1.withdraw(200);
        System.out.println("Account1 balance: " + account1.getBalance());

        account2.withdraw(6000);  // Should deny withdrawal
        account2.withdraw(2000);
        System.out.println("Account2 balance: " + account2.getBalance());

        // Test Karel
        Karel karel = new Karel();
        System.out.println("Initial position: " + karel.getPosition());
        karel.move();
        System.out.println("After move: " + karel.getPosition());
        karel.turnLeft();
        karel.move();
        System.out.println("After turn left and move: " + karel.getPosition());
    }

}
