package com.restaurant;

import java.util.Scanner;

public class OrdersDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n Order Management System ");
            System.out.println("1. Restaurant Order");
            System.out.println("2. Grocery Order");
            System.out.println("3. Cloud Kitchen Order");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            Orders order = null;

            switch (choice) {

                case 1:
                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Order Amount: ");
                    double amount = sc.nextDouble();


                    order = new ResturantOrders(name, amount);
                    break;

                case 2:
                    System.out.print("Enter Customer Name: ");
                    String gName = sc.nextLine();

                    System.out.print("Enter Order Amount: ");
                    double gAmount = sc.nextDouble();

                    System.out.print("Is Membership Holder (true/false): ");
                    boolean isMember = sc.nextBoolean();

                    order = new GroceryOrder(gName, gAmount, isMember);
                    break;

                case 3:
                    System.out.print("Enter Customer Name: ");
                    String cName = sc.nextLine();

                    System.out.print("Enter Order Amount: ");
                    int cAmount = sc.nextInt();

                    System.out.print("Enter Delivery Distance (km): ");
                    int distance = sc.nextInt();

                    order = new CloudKitchenOrder(cName, cAmount, distance);
                    break;

                case 4:
                    System.out.println("Thank you! Exiting application...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            double totalAmount = order.calculateFinalAmount();
            System.out.println("Total Amount to be Paid: " + totalAmount);
        }
    }
}
