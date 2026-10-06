package controller;
import model.Account;
import model.AccountService;
import model.CustomerService;
import model.LoginStatus;
import view.AccountView;
import view.CustomerView;

public class AccountController {
     
    private AccountService accountService;
    private AccountView accountView;
    private CustomerService customerService;
    private CustomerView customerView;
    private CustomerController customerController;
    private LoginStatus loginStatus;
    private Account account;

    public AccountController(AccountService accountService, AccountView accountView,CustomerService customerService, CustomerView customerView,LoginStatus loginStatus) {
        this.accountService = accountService;
        this.accountView = accountView;
        this.customerService = customerService;
        this.customerView = customerView;
        this.loginStatus = loginStatus;
    }
    
    public void start() {
        boolean exit = false;
        while (!exit) {
            int choice = accountView.displayAccountMenu();
            switch (choice) {
                case 1:
                    if(loginStatus.isLoggedIn()){
                      account=  accountService.createAccount();
                    }
                    else
                        customerView.displayLoginFailedMessage();
                    break;
                case 2:
                    if(loginStatus.isLoggedIn())
                        accountService.viewAccountDetails(account);
                    else
                        customerView.displayLoginFailedMessage();
                    break;
                case 3:
                    if(loginStatus.isLoggedIn())
                        accountService.calculateInterest(account,2);
                    else
                        customerView.displayLoginFailedMessage();
                    break;
                case 4:
                    if(loginStatus.isLoggedIn())
                        accountService.deleteAccount(account);
                    else
                        customerView.displayLoginFailedMessage();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    accountView.displayInvalidOptionMessage();
            }
        }
    }
}
