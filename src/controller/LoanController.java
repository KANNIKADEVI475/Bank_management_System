package controller;

import model.LoanService;
import view.LoanView;
import model.CustomerService;
import view.CustomerView;
import model.LoginStatus;

public class LoanController {
    
    private LoanService loanService;
    private LoanView loanView;
    private CustomerService customerService;
    private CustomerView customerView;
    private LoginStatus loginStatus;

    public LoanController(LoanService loanService, LoanView loanView,CustomerService customerService, CustomerView customerView,LoginStatus loginStatus) {
        this.loanService = loanService;
        this.loanView = loanView;
        this.customerService = customerService;
        this.customerView = customerView;
        this.loginStatus = loginStatus;
    }
    
    public void start() {
        boolean exit = false;
        while (!exit) {
            int choice = loanView.displayLoanMenu();
            switch (choice) {
                case 1:
                    if(loginStatus.isLoggedIn())
                        loanService.applyForLoan();
                    else
                        customerView.displayLoginFailedMessage();
                    break;
                case 2:
                    if(loginStatus.isLoggedIn())
                        loanService.viewLoanStatus();
                    else
                        customerView.displayLoginFailedMessage();
                    break;
                case 3:
                    if(loginStatus.isLoggedIn())
                        loanService.calculateEligibleLoanAmt();
                    else
                        customerView.displayLoginFailedMessage();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    loanView.displayInvalidOptionMessage();
            }
        }
    }
}
