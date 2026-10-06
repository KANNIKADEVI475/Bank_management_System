package controller;
import model.LoginStatus;
import model.TransactionService;
import view.TransactionView;

public class TransactionController {
    
    private TransactionService transactionService;
    private TransactionView transactionView;
    private LoginStatus loginStatus;

    public TransactionController(TransactionService transactionService, TransactionView transactionView, LoginStatus loginStatus) {
        this.transactionService = transactionService;
        this.transactionView = transactionView;
        this.loginStatus = loginStatus;
    }
    
    public void start() {
        boolean exit = false;
        while (!exit) {
            int choice = transactionView.displayTransactionMenu();
            switch (choice) {
                case 1:
                    transactionService.deposit();
                    break;
                case 2:
                    transactionService.withdraw();
                    break;
                case 3:
                    transactionService.transfer();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    transactionView.displayInvalidOptionMessage();
            }
        }
    }
}
