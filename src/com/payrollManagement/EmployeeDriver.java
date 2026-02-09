package com.payrollManagement;

import java.util.Scanner;

public class EmployeeDriver {
	
//	Exception Handling
//	Create a custom checked exception named InvalidSalaryException that should be thrown when:
//	Base salary ≤ 0
//	Hours worked ≤ 0
//	Hourly rate ≤ 0
//	Handle this exception appropriately in the main application.
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int employeeId;
        String name;
        String depatment;
        int type;
        double hoursWorked = 0;
        double hourlyRate = 0;
        double baseSalary = 0;
        double HRA = 0;

        System.out.println("Enter Employee Id:");
        employeeId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Name:");
        name = sc.nextLine();

        System.out.println("Enter Department:");
        depatment = sc.nextLine();

        System.out.println("Select Employee Type");
        System.out.println("1. Permanent Employee");
        System.out.println("2. Contractual Employee");
        type = sc.nextInt();
        
        System.out.println("enter the no of employees");
        int n = sc.nextInt();
        int i = 0;
        
        while(i<n) {
        	switch (type) {

            case 1:
                System.out.println("Enter Base Salary:");
                baseSalary = sc.nextDouble();
                try {
                	
                	if(baseSalary<=0) {
                		throw new InvalidSalaryException("base salary can not be equalto or less than salary");
                	}
                }
                catch (InvalidSalaryException e) {
					// TODO: handle exception
				}

                System.out.println("Enter HRA:");
                HRA = sc.nextDouble();

                System.out.println("Permanent Employee Details Entered");
                break;

            case 2:
                System.out.println("Enter Hours Worked:");
                hoursWorked = sc.nextDouble();
                try {
                	
                	if(hoursWorked<=0) {
                		throw new InvalidSalaryException("hours Worked can not be equalto or less than salary");
                	}
                }
                catch (InvalidSalaryException e) {
					// TODO: handle exception
				}

                System.out.println("Enter Hourly Rate:");
                hourlyRate = sc.nextDouble();
                
                try {	
                	if(hourlyRate<=0) {
                		throw new InvalidSalaryException("hourly Rate can not be equalto or less than salary");
                	}
                }
                catch (InvalidSalaryException e) {
					// TODO: handle exception
				}

                System.out.println("Contractual Employee Details Entered");
                break;

            default:
                System.out.println("Invalid Employee Type");
        }

        }
        

        
        
    }
}
