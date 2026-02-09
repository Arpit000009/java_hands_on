package com.payrollManagement;

public class ParmanentEmployee implements Employee{
	
	int employeeId;
	String name;
	String depatment;
	int type;
	double baseSalary;
	double HRA;
	
	
	
	public ParmanentEmployee(int employeeId, String name, String depatment, int type, double baseSalary,
			double H) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.depatment = depatment;
		this.type = type;
		this.baseSalary = baseSalary;
		this.HRA = HRA;
	}



	@Override
	public double calculateSalary() {
		
		double totalSalary = baseSalary + HRA;
		totalSalary = totalSalary - (totalSalary*10);
		return totalSalary;
	}

}
