package com.BankAccount;

import java.util.Scanner;

public class CustomerDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Create New Account");

        System.out.print("Enter Customer ID: ");
        String customerId = sc.next();

        System.out.print("Enter Customer Name: ");
        String customerName = sc.next();

        System.out.print("Enter Email: ");
        String email = sc.next();

        Customer customer = new Customer(customerId, customerName, email);

        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        int balance = sc.nextInt();

        Account account = new SavingAccount(accountNumber, customer, balance);

        System.out.println("\nAccount created");

        
        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter deposit amount: ");
                    int depositAmount = sc.nextInt();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdraw amount: ");
                    int withdrawAmount = sc.nextInt();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println("Current balance: " + account.balance);
                    break;

                case 4:
                    System.out.println("BYEE BYEE fir milte hain");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
