package view;

import java.util.Scanner;
import model.Account;
public class AccountView {
    
    private Scanner s = new Scanner(System.in);

    public int displayAccountMenu() {
        System.out.println("=== Account Management Menu ===");
        System.out.println("1. Create Account");
        System.out.println("2. View Account Details");
        System.out.println("3. Calculate Interest");
        System.out.println("4. Delete Account");
        System.out.println("5. Back to Main Menu");
        System.out.print("Enter your choice: ");
        return s.nextInt();
    }

    public void displayInvalidOptionMessage() {
        System.out.println("Invalid option. Please try again.");
    }

    public String getAcc_no() {
        System.out.print("Enter account number: ");
        return s.nextLine();
    }

    public String getType() {
        System.out.print("Enter account type: ");
        return s.nextLine();
    }

    public int getCustomerId() {
        System.out.print("Enter customer ID: ");
        return s.nextInt();
    }

    public void displayAccountDetails(Account account) {
        System.out.println("Account Number: " + account.getAcc_no());
        System.out.println("Current Balance: " + account.getCurr_balance());
        System.out.println("Eligibility: " + account.getIsEligible());
        System.out.println("Interest Rate: " + account.getInterest_rate());
        System.out.println("Account Type: " + account.getType());
        System.out.println("Customer ID: " + account.getCustomerId());
    }
    
    
}
