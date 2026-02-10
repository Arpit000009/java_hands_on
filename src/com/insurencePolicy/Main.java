package com.insurencePolicy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        InsurencePolicy policies = new InsurencePolicy();
        Scanner sc = new Scanner(System.in);

        while (true) {

            try {

                System.out.println("\n--- Insurence Menu ---");
                System.out.println("1. Add Insurence Policy");
                System.out.println("2. Find Policy by Number");
                System.out.println("3. Calculate Premium by policy number");
                System.out.println("4. View all active policies");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                case 1:

                    int policyNumber = 0;
                    while (true) {
                        try {
                            System.out.print("Enter policy number: ");
                            policyNumber = sc.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Enter correct policy number");
                            sc.nextLine();
                        }
                    }

                    sc.nextLine();
                    System.out.print("Enter customer Name: ");
                    String customerName = sc.nextLine();

                    String policyType = "";
                    while (true) {
                        try {
                            System.out.println("1.Health , 2.Life , 3.Vehicle , 4.Travel");
                            System.out.print("Enter Policy Type: ");
                            int type = sc.nextInt();

                            if (type == 1)
                                policyType = "HEALTH";
                            else if (type == 2)
                                policyType = "LIFE";
                            else if (type == 3)
                                policyType = "VEHICLE";
                            else if (type == 4)
                                policyType = "TRAVEL";
                            else
                                throw new InvalidChoiceException("enter correct policy Type");

                            break;

                        } catch (InputMismatchException e) {
                            System.out.println("Enter correct value");
                            sc.nextLine();
                        } catch (InvalidChoiceException e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    int customerAge = 0;
                    while (true) {
                        try {
                            System.out.print("Enter customer age: ");
                            customerAge = sc.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Enter correct age");
                            sc.nextLine();
                        }
                    }

                
                    double basePremium = 0;
                    while (true) {
                        try {
                            System.out.print("Enter base premium: ");
                            basePremium = sc.nextDouble();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Enter valid ammount");
                            sc.nextLine();
                        }
                    }
                    String policyStatus = "";
                    while (true) {
                        try {
                            System.out.println("1.Active , 2.Expired");
                            System.out.print("Enter policy status: ");
                            int status = sc.nextInt();

                            if (status == 1)
                                policyStatus = "ACTIVE";
                            else if (status == 2)
                                policyStatus = "EXPIRED";
                            else
                                throw new InvalidChoiceException("enter correct Policy Status");

                            break;

                        } catch (InputMismatchException e) {
                            System.out.println("Enter correct value");
                            sc.nextLine();
                        } catch (InvalidChoiceException e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    PolicyDetails details = new PolicyDetails(customerName,
                            policyType, customerAge, basePremium, policyStatus);

                    policies.addPolicy(policyNumber, details);
                    break;

                case 2:
                    System.out.print("Enter policy number: ");
                    policies.findPolicyByNumber(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter policy number: ");
                    System.out.println("Total premium amount is: "
                            + policies.calculetePremium(sc.nextInt()));
                    break;

                case 4:
                    policies.viewAllActivePolicies();
                    break;

                case 5:
                    System.out.println("Exit Insurence menu. Goodbye!");
                    sc.close();
                    return;

                default:
                    throw new InvalidChoiceException("enter correct choice");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter correct data type!");
                sc.nextLine();
            } catch (InvalidChoiceException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
