package model;

public class LoginStatus {

    private boolean loggedIn = false;
    private Customer customer;

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void login(Customer customer) {
        this.customer = customer;
        loggedIn = true;
    }

    public void logout() {
        customer = null;
        loggedIn = false;
    }

    public Customer getCustomer() {
        return customer;
    }
}