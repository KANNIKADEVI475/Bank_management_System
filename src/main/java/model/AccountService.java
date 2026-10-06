package model;

import java.util.ArrayList;

import view.AccountView;

public class AccountService {
    AccountView accountView = new AccountView();
    public static ArrayList <Account> accounts=new ArrayList<>();
    public Account createAccount() {
        String acc_no=accountView.getAcc_no();
        double curr_balance = 0.0;
        boolean isEligible = true;
        double interest_rate = 0.05;
        String type = accountView.getType();
        int customer_id = accountView.getCustomerId();

        Account account = new Account(curr_balance, isEligible, interest_rate, type, customer_id);
        accounts.add(account);
        System.out.println("Account created successfully.");
        return account;
    }

    public void viewAccountDetails(Account account) {
       
        accountView.displayAccountDetails(account);
        System.out.println("Displaying account details.");
        }

    public void calculateInterest(Account account, int years) {

        double interest = (account.getCurr_balance() * account.getInterest_rate() * years) / 100;
        account.setCurr_balance(account.getCurr_balance() + interest);
        System.out.println("Interest calculated and added to the account balance.");

    }
    
    public void deleteAccount(Account account) {
        accounts.remove(account);
        System.out.println("Account deleted successfully.");
    }
}
