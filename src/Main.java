import controller.AccountController;
import controller.CustomerController;
import controller.LoanController;
import controller.MenuController;
import controller.TransactionController;
import model.AccountService;
import model.CustomerService;
import model.LoanService;
import model.TransactionService;
import view.AccountView;
import view.CustomerView;
import view.LoanView;
import view.MenuView;
import view.TransactionView;
import model.LoginStatus;

public class Main {
    public static void main(String[] args) {
       
        LoginStatus loginStatus = new LoginStatus();
        AccountService accountService = new AccountService();
        CustomerService customerService = new CustomerService();
        LoanService loanService = new LoanService();
        TransactionService transactionService = new TransactionService();


        AccountView accountView = new AccountView();
        CustomerView customerView = new CustomerView();
        LoanView loanView = new LoanView();
        MenuView menuView = new MenuView();
        TransactionView transactionView = new TransactionView();


        AccountController accountController = new AccountController(accountService, accountView,customerService, customerView,loginStatus);
        CustomerController customerController = new CustomerController(customerService, customerView,loginStatus);
        LoanController loanController = new LoanController(loanService, loanView,customerService, customerView,loginStatus);
        TransactionController transactionController = new TransactionController(transactionService, transactionView,loginStatus);
        MenuController menuController = new MenuController(menuView, accountController, customerController,
                loanController, transactionController);
        
        menuController.start();
    }
}