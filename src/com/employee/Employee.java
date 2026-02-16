package com.employee;

public class Employee {
	int empId;
	private String name;
	private double salary;
	private int age;
	private String department;
	public Employee(int empId, String name, double salary,int age,String departmant) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.age = age ;
		this.department = departmant;
	}
	
	
	
	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", age=" + age + ", department="
				+ department + "]";
	}



	
	
	
}
