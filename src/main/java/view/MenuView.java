package view;

import java.util.Scanner;

public class MenuView {
    private Scanner s = new Scanner(System.in);
    
    public int displayMenu() {
        System.out.println("=== Banking System Menu ===");
        System.out.println("1. Customer Management(Do first to register and login)");
        System.out.println("2. Account Management");
        System.out.println("3. Loan Management");
        System.out.println("4. Transaction Management");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        return s.nextInt();
    }

    public void displayInvalidOptionMessage() {
        System.out.println("Invalid option. Please try again.");
    }

}
