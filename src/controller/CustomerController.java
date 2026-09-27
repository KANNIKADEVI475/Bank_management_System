package controller;

import model.Customer;
import model.CustomerService;
import model.LoginStatus;
import view.CustomerView;

public class CustomerController {
    private CustomerService customerService;
    private CustomerView customerView;
    private LoginStatus loginStatus;
    private Customer customer;

    public CustomerController(CustomerService customerService, CustomerView customerView,LoginStatus loginStatus) {
        this.customerService = customerService;
        this.customerView = customerView;
        this.loginStatus = loginStatus;
    }
    
    public void start() {
        boolean exit = false;
        while (!exit) {
            int choice = customerView.displayCustomerMenu();
            switch (choice) {
                case 1:
                    customerService.register();
                    break;
                case 2:
                customer = customerService.login();
                    if (customer!=null)
                        loginStatus.login(customer);
                    else
                        customerView.displayLoginFailedMessage();
                    break;
                    
                case 3:
                    if(loginStatus.isLoggedIn())
                        customerService.viewDetails(customer);
                    else
                        customerView.displayLoginFailedMessage();
                    break;
                case 4:
                    if(loginStatus.isLoggedIn())
                        customerService.updateDetails(customer);
                    else
                        customerView.displayLoginFailedMessage();
                    break;
                case 5:
                    if(loginStatus.isLoggedIn())
                        customerService.deleteCustomer(customer);
                    else
                        customerView.displayLoginFailedMessage();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    customerView.displayInvalidOptionMessage();
            }
        }
    }
}
