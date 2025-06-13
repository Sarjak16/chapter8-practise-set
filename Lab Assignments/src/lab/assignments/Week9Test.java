package lab.assignments;

public class Week9Test {
    public static void main(String[] args) {
        CreditAccount creditAcc = new CreditAccount("Bob", "C100", 1000, 500);

        creditAcc.withdraw(1300);
        System.out.println("Balance after withdrawal: " + creditAcc.getBalance());

        creditAcc.withdraw(300);
        System.out.println("Balance after withdrawal: " + creditAcc.getBalance());

        creditAcc.deposit(2000);
        System.out.println("Balance after deposit: " + creditAcc.getBalance());
    }
}
