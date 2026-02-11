package com.lembda;

import java.util.Scanner;
import java.util.function.Function;

//Create an employee classs with fields empId, empName,and salary;
//write a lambda function to calculate the revised salary of an employee by increasing the salary by 15 %

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int empId = sc.nextInt();
		String empName = sc.nextLine();
		sc.nextLine();
		double salary = sc.nextDouble();
		
		
		Employee employee = new Employee(empId, empName, salary);
		
		Function<Double, Double> obj = (a)->a+(a*0.15);
		
		double currentSalary = employee.getSalary();
		
		employee.setSalary(obj.apply(currentSalary));
		
		System.out.println("increased salary is " + employee.getSalary());
		
	}
}
