package model;

import java.util.ArrayList;

import view.LoanView;

public class LoanService {
    ArrayList<Loan> loans = new ArrayList<>();
    CustomerService customerService = new CustomerService();
    LoanView loanView = new LoanView();

    public void applyForLoan() {
        String loanType = loanView.getLoanType();
        int customerId = loanView.getCustomerId();
        Loan loan = new Loan("Pending", customerId, loanType);
        for(Customer customer : customerService.customerList) {
            if(customer.getCust_id() == customerId) {
                if( customer.getCibilScore() >= 500) {
                    loan.setStatus("Approved");
                     loan = new Loan("Approved", customerId, loanType);
                } else {
                    loan.setStatus("Rejected");
                    loan = new Loan("Rejected", customerId, loanType);
                }
                break;
            }
        }
        loans.add(loan);
        System.out.println("Loan application submitted successfully.");
    }
    
    public void viewLoanStatus() {
        int customerId = loanView.getCustomerId();
        boolean found = false;
        for (Loan loan : loans) {
            if (loan.getCustomerId() == customerId) {
                System.out.println(
                        "Loan ID: " + loan.getLoadId() + ", Status: " + loan.getStatus() + ", Type: " + loan.getType());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No loans found for the given customer ID.");
        }
    }
    
    public void calculateEligibleLoanAmt() {
        int customerId = loanView.getCustomerId();
        double eligibleAmount = 0.0;
        for (Loan loan : loans) {
            if (loan.getCustomerId() == customerId) {
                
                if (loan.getType().equalsIgnoreCase("Home")) {
                    eligibleAmount += 50000; 
                } else if (loan.getType().equalsIgnoreCase("Car")) {
                    eligibleAmount += 20000; 
                } else if (loan.getType().equalsIgnoreCase("Personal")) {
                    eligibleAmount += 10000; 
                }
            }
        }
        System.out.println("Eligible loan amount for customer ID " + customerId + ": " + eligibleAmount);
    }
}
