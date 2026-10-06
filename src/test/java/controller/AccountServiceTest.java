package controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import model.Account;
import model.AccountService;

public class AccountServiceTest {
    
    @Test
    void testCalculateInterest1000() {

        Account account = new Account(1000, true, 0.5, "Savings", 1);
        AccountService access = new AccountService();

        access.calculateInterest(account, 5);

        assertEquals(1025, account.getCurr_balance());
    }

    @Test
    void testCalculateInterest500() {

        Account account = new Account(500, true, 1.5, "Savings", 2);
        AccountService access = new AccountService();

        access.calculateInterest(account, 3);

        assertEquals(522.5, account.getCurr_balance());
    }

    @Test
    void testCalculateInterest0() {

        Account account = new Account(0, true, 1.5, "Savings", 3);
        AccountService access = new AccountService();

        access.calculateInterest(account, 10);

        assertEquals(0, account.getCurr_balance());
    }




    

    

}
