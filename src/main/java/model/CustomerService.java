package model;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

import view.CustomerView;

public class CustomerService {
    CustomerView customerView = new CustomerView();
    Random random = new Random();
    int min = 300;
    int max = 900;
    ArrayList <Customer> customerList=new ArrayList<>();

    public static HashMap<String, String> map = new HashMap<>();

    public static int dateToAge(LocalDate dob) {
        LocalDate today = LocalDate.now();
        int age = Period.between(dob, today).getYears();

        return age;
    }

    public void register() {
        String name = customerView.getName();
        String phone = customerView.getPhoneNumber();
        
        String email = customerView.getEmail();
        
        String pwd = customerView.getPassword();
        map.put(email, pwd);
        
       
        LocalDate date = LocalDate.parse(customerView.getDateOfBirth());

        int age = dateToAge(date);

        Customer user = new Customer(name, phone, random.nextInt(((max-min)+1)+min), email, pwd, age);
        customerList.add(user);
        customerView.displayRegistrationSuccessMessage();
    }

    public Customer login() {
        String email = customerView.getLoginEmail();
        String pwd = customerView.getLoginPassword();

        if (!map.containsKey(email) || !map.get(email).equals(pwd)) {
            customerView.displayLoginFailedMessage();
            return null;
        }
        for(Customer customer : customerList) {
            if (customer.getEmail().equals(email)) {
                customerView.displayLoginSuccessMessage();
                return customer;
            }
        }
        return null;
    }
    
    public void viewDetails(Customer customer) {

        customerView.displayCustomerDetails(customer);
    }

    public void updateDetails(Customer customer) {
        String name = customerView.getName();
        String phone = customerView.getPhoneNumber();
        String email = customerView.getEmail();
        String pwd = customerView.getPassword();
        LocalDate date = LocalDate.parse(customerView.getDateOfBirth());
        int age = dateToAge(date);

        customer.setName(name);
        customer.setPhone(phone);
        customer.setEmail(email);
        customer.setPwd(pwd);
        customer.setAge(age);

        map.put(email, pwd);
        customerView.displayUpdateSuccessMessage();
    }
    
    public void deleteCustomer(Customer customer) {
        customerList.remove(customer);
        map.remove(customer.getEmail());
        customerView.displayDeleteSuccessMessage();
    }
}

