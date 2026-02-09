package com.payrollManagement;

public class ContractualEmployee implements Employee{
	
	int employeeId;
	String name;
	String depatment;
	String type;
	double hoursWorked;
	double hourlyRate;
	
	
	
	public ContractualEmployee(int employeeId, String name, String depatment, String type, double hoursWorked,
			double hourlyRate) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.depatment = depatment;
		this.type = type;
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}



	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		double totalSalary = hourlyRate* hoursWorked;
		totalSalary = totalSalary - (totalSalary*10);
		return totalSalary;
	}

}
