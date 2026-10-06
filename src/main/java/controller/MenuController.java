package controller;

import view.MenuView;

public class MenuController {
    private MenuView menuView;
    private AccountController accountController;
    private CustomerController customerController;
    private LoanController loanController;
    private TransactionController transactionController;

    public MenuController(MenuView menuView, AccountController accountController, CustomerController customerController,
            LoanController loanController, TransactionController transactionController) {
        this.menuView = menuView;
        this.accountController = accountController;
        this.customerController = customerController;
        this.loanController = loanController;
        this.transactionController = transactionController;
    }
    
    public void start() {
        boolean exit = false;
        while (!exit) {
            int choice = menuView.displayMenu();
            switch (choice) {
                case 1:
                   customerController.start();
                    break;
                case 2:
                     accountController.start();
                    break;
                case 3:
                    loanController.start();
                    break;
                case 4:
                    transactionController.start();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    menuView.displayInvalidOptionMessage();
            }
        }
    }
}
