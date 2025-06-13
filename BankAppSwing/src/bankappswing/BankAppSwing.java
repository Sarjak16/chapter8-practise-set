package bankappswing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAppSwing extends JFrame {

    private JLabel balanceLabel;
    private JTextField amountField;
    private JButton depositButton;
    private JButton withdrawButton;

    private double balance = 0.0;

    public BankAppSwing() {
        setTitle("Bank Application");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Use a simple FlowLayout for the panel
        JPanel panel = new JPanel(new FlowLayout());

        // Label to show balance
        balanceLabel = new JLabel("Balance: $0.00");
        panel.add(balanceLabel);

        // Text field for amount input
        amountField = new JTextField(10);
        panel.add(amountField);

        // Deposit button
        depositButton = new JButton("Deposit");
        depositButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deposit();
            }
        });
        panel.add(depositButton);

        // Withdraw button
        withdrawButton = new JButton("Withdraw");
        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                withdraw();
            }
        });
        panel.add(withdrawButton);

        // Add panel to frame
        add(panel);
    }

    private void deposit() {
        try {
            double amount = Double.parseDouble(amountField.getText());
            if (amount > 0) {
                balance += amount;
                updateBalance();
            }
            amountField.setText("");
        } catch (NumberFormatException ex) {
            amountField.setText("");
        }
    }

    private void withdraw() {
        try {
            double amount = Double.parseDouble(amountField.getText());
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                updateBalance();
            }
            amountField.setText("");
        } catch (NumberFormatException ex) {
            amountField.setText("");
        }
    }

    private void updateBalance() {
        balanceLabel.setText(String.format("Balance: $%.2f", balance));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BankAppSwing app = new BankAppSwing();
            app.setVisible(true);
        });
    }
}
