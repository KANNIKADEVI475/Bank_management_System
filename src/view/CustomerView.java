package view;

import java.util.Scanner;
import model.Customer;

public class CustomerView {
    private Scanner s = new Scanner(System.in);

    public int displayCustomerMenu() {
        System.out.println("=== Customer Management Menu ===");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. View Details");
        System.out.println("4. Update Details");
        System.out.println("5. Delete Customer");
        System.out.println("6. Back to Main Menu");
        System.out.print("Enter your choice: ");
        return s.nextInt();
    }

    public void displayInvalidOptionMessage() {
        System.out.println("Invalid option. Please try again.");
    }

    public void displayLoginFailedMessage() {
        System.out.println("Login first or Login failed. Please check your credentials.");
    }

    public String getName() {
        System.out.print("Enter your name: ");
        return s.nextLine();
    }

    public String getPhoneNumber() {
        System.out.print("Enter your phone number: ");
        return s.nextLine();
    }

    public String getEmail() {
        System.out.print("Enter your email: ");
        return s.nextLine();
    }

    public String getPassword() {
        System.out.print("Enter your password: ");
        return s.nextLine();
    }

    public String getDateOfBirth() {
        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        return s.nextLine();
    }
    
    public void displayRegistrationSuccessMessage() {
        System.out.println("Successfully registered.");
    }

    public String getLoginEmail() {
        System.out.print("Enter your email: ");
        return s.nextLine();
    }

    public String getLoginPassword() {
        System.out.print("Enter your password: ");
        return s.nextLine();
    }

    public void displayLoginSuccessMessage() {
        System.out.println("Login successful.");
    }

    public void displayCustomerDetails(Customer customer) {
        System.out.println("=== Customer Details ===");
        System.out.println("Customer ID: " + customer.getCust_id());
        System.out.println("Name: " + customer.getName());
        System.out.println("Phone: " + customer.getPhone());
        System.out.println("CIBIL Score: " + customer.getCibilScore());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Age: " + customer.getAge());
    }

    public void displayUpdateSuccessMessage() {
        System.out.println("Details updated successfully.");
    }

    public void displayDeleteSuccessMessage() {
        System.out.println("Customer deleted successfully.");
    }

}
