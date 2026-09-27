package view;
import java.util.Scanner;

public class TransactionView {
    
    private Scanner s = new Scanner(System.in);

    public int displayTransactionMenu() {
        System.out.println("=== Transaction Management Menu ===");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Transfer");
        System.out.println("4. Back to Main Menu");
        System.out.print("Enter your choice: ");
        return s.nextInt();
    }

    public void displayInvalidOptionMessage() {
        System.out.println("Invalid option. Please try again.");
    }

    public int getDepositAmount() {
        System.out.print("Enter deposit amount: ");
        return s.nextInt();
    }

    public int getWithdrawAmount() {
        System.out.print("Enter withdraw amount: ");
        return s.nextInt();
    }

    public String getAccountNumber() {
        System.out.print("Enter account number: ");
        return s.next();
    }

   public int getTransferAmount() {
        System.out.print("Enter transfer amount: ");
        return s.nextInt();
    }

    public String getFromAccountNumber() {
        System.out.print("Enter from account number: ");
        return s.next();
    }

    public String getToAccountNumber() {
        System.out.print("Enter to account number: ");
        return s.next();
    }
    


    
}
