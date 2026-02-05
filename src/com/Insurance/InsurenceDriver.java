package com.Insurance;

import java.util.Scanner;

public class InsurenceDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        InsurencePolicy policy = null;

        System.out.println("Select Insurance Type:");
        System.out.println("1. Health Insurance");
        System.out.println("2. Life Insurance");
        System.out.println("3. Vehicle Insurance");

        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        switch (choice) {

            case 1:
                System.out.println("Enter Policy Holder Name:");
                String hName = sc.nextLine();

                System.out.println("Enter Age:");
                int age = sc.nextInt();

                System.out.println("Enter Sum Assured:");
                double hSumAssured = sc.nextDouble();

                
                

                policy = new HealthInsurance(hName, age, hSumAssured);
                break;

            case 2:
                System.out.println("Enter Policy Holder Name:");
                String lName = sc.nextLine();

                System.out.println("Enter Sum Assured:");
                double lSumAssured = sc.nextDouble();

                System.out.println("Enter Policy Term (years):");
                int policyTerm = sc.nextInt();

                policy = new LifeInsurance(lName, lSumAssured, policyTerm);
                break;

            case 3:
                System.out.println("Enter Policy Holder Name:");
                String vName = sc.nextLine();

                System.out.println("Enter Number of Wheels (2 or 4):");
                int wheels = sc.nextInt();

                System.out.println("Enter Vehicle Value:");
                double vehicleValue = sc.nextDouble();

                policy = new VehicleInsurence(vName, wheels, vehicleValue);
                break;

            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        double premium = policy.calculatePremium();
        System.out.println("Premium to be Paid: " + premium);

        sc.close();
    }
}
