package lab.assignments;

import java.util.ArrayList;

public class Week8Test {
    public static void main(String[] args) {
        // Test BouncyBall collision
        BouncyBall ball1 = new BouncyBall(0, 0, "red");
        BouncyBall ball2 = new BouncyBall(1, 1, "blue");
        BouncyBall ball3 = new BouncyBall(2, 2, "green");

        ball1.collide(ball2);
        System.out.println(ball1);  // Should print color changed to blue

        ball3.collide(ball1);
        System.out.println(ball3);  // Should print color changed to red

        // Create ArrayList of BankAccount objects
        ArrayList<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(new BankAccount("John", "B100", 15000));
        bankAccounts.add(new BankAccount("Mary", "B101", 9000));
        bankAccounts.add(new BankAccount("Steve", "B102", 12000));

        System.out.println("Customers with balance > 10000:");
        for (BankAccount acc : bankAccounts) {
            if (acc.getBalance() > 10000) {
                System.out.println(acc.getCustomerName());
            }
        }
    }
}
