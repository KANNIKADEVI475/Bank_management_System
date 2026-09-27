package view;
import java.util.Scanner;

public class LoanView {
    
    private Scanner s = new Scanner(System.in);

    public int displayLoanMenu() {
        System.out.println("=== Loan Management Menu ===");
        System.out.println("1. Apply for Loan");
        System.out.println("2. View Loan Status");
        System.out.println("3. Calculate Eligible Loan Amount");
        System.out.println("4. Back to Main Menu");
        System.out.print("Enter your choice: ");
        return s.nextInt();
    }

    public void displayInvalidOptionMessage() {
        System.out.println("Invalid option. Please try again.");
    }
    
    public void displayLoginFailedMessage() {
        System.out.println("Login first or Login failed. Please try again.");
    }

    public void displayLoanStatus(String status) {
        System.out.println("Loan Status: " + status);
    }

    public void displayEligibleLoanAmount(double amount) {
        System.out.println("Eligible Loan Amount: " + amount);
    }

    public void displayLoanApplicationResult(boolean success) {
        if (success) {
            System.out.println("Loan application submitted successfully.");
        } else {
            System.out.println("Loan application failed. Please try again.");
        }
    }

    public String getLoanType() {
        System.out.print("Enter loan type (Home, Car, Personal): ");
        return s.next();
    }

    public int getCustomerId() {
        System.out.print("Enter customer ID: ");
        return s.nextInt();
    }

    // public void displayNoLoansFoundMessage() {
    //     System.out.println("No loans found for the given customer ID.");
    // }

    // public void displayLoanDetails(int loanId, String status, String type) {
    //     System.out.println("Loan ID: " + loanId + ", Status: " + status + ", Type: " + type);
    // }
    // public void displayEligibleAmountMessage(int customerId, double eligibleAmount) {
    //     System.out.println("Eligible loan amount for customer ID " + customerId + ": " + eligibleAmount);
    // }
}
