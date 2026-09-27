package model;

import view.TransactionView;
import model.Account;
import model.AccountService;
import java.util.ArrayList;

public class TransactionService {
    ArrayList<Transaction> transactions = new ArrayList<>();
    TransactionView transactionView = new TransactionView();

    public void deposit() {
        int amt = transactionView.getDepositAmount();
        String acc_no = transactionView.getAccountNumber();
        if (amt > 0) {
            System.out.println("Deposited: " + amt);
            for (Account account : AccountService.accounts) {

                if (account.getAcc_no().equals(acc_no)) {
                    account.setCurr_balance(account.getCurr_balance() + amt);
                    System.out.println("New balance: " + account.getCurr_balance());
                    return;
                }
            }
            Transaction transaction = new Transaction(acc_no, "Success", "Deposit", amt);
            transactions.add(transaction);
        } else {
            System.out.println("Invalid deposit amount.");
            Transaction transaction = new Transaction(acc_no, "fail", "Deposit", amt);
            transactions.add(transaction);
        }
    }

    public void withdraw() {
        int amt = transactionView.getWithdrawAmount();
        String acc_no = transactionView.getAccountNumber();
        if (amt > 0) {
            for (Account account : AccountService.accounts) {
                if (account.getAcc_no().equals(acc_no)) {
                    if (account.getCurr_balance() >= amt) {
                        account.setCurr_balance(account.getCurr_balance() - amt);
                        System.out.println("New balance: " + account.getCurr_balance());
                        Transaction transaction = new Transaction(acc_no, "Success", "Withdraw", amt);
                        transactions.add(transaction);
                        return;
                    } else {
                        System.out.println("Insufficient balance.");
                        Transaction transaction = new Transaction(acc_no, "fail", "Withdraw", amt);
                        transactions.add(transaction);
                        return;
                    }
                }
            }
            System.out.println("Account not found.");
        } else {
            System.out.println("Invalid withdraw amount.");
            Transaction transaction = new Transaction(acc_no, "fail", "Withdraw", amt);
            transactions.add(transaction);
        }
    }
    
    public void transfer() {
        int amt = transactionView.getTransferAmount();
        String fromAcc_no = transactionView.getFromAccountNumber();
        String toAcc_no = transactionView.getToAccountNumber();
        if (amt > 0) {
            Account fromAccount = null;
            Account toAccount = null;
            for (Account account : AccountService.accounts) {
                if (account.getAcc_no().equals(fromAcc_no)) {
                    fromAccount = account;
                }
                if (account.getAcc_no().equals(toAcc_no)) {
                    toAccount = account;
                }
            }
            if (fromAccount != null && toAccount != null) {
                if (fromAccount.getCurr_balance() >= amt) {
                    fromAccount.setCurr_balance(fromAccount.getCurr_balance() - amt);
                    toAccount.setCurr_balance(toAccount.getCurr_balance() + amt);
                    System.out.println("Transferred: " + amt);
                    System.out.println("New balance of " + fromAcc_no + ": " + fromAccount.getCurr_balance());
                    System.out.println("New balance of " + toAcc_no + ": " + toAccount.getCurr_balance());
                    Transaction transaction = new Transaction(fromAcc_no, "Success", "Transfer", amt);
                    transactions.add(transaction);
                } else {
                    System.out.println("Insufficient balance in the source account.");
                    Transaction transaction = new Transaction(fromAcc_no, "fail", "Transfer", amt);
                    transactions.add(transaction);
                }
            } else {
                System.out.println("One or both accounts not found.");
            }
        } else {
            System.out.println("Invalid transfer amount.");
            Transaction transaction = new Transaction(fromAcc_no, "fail", "Transfer", amt);
            transactions.add(transaction);
        }
    }


    
}
