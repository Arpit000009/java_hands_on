package com.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Create an Employee class with three fields: name, age and salary
//Create the constructor and getter setters for the fields
//Create collection of Employee objects in main method
//Using stream filter out all employees whose salary in greater than 5000
//
//Sort the employees by age
//
//Calculate bonus for each employee and display (Bonus= 10% of salary)


public class Employee {
	String name;
	int age;
	double salary;
	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		List<Employee>list = Arrays.asList(new Employee("Arpit",22,3000),new Employee("mithun",24,35000),new Employee("nikhil",22,25000));
		
		list.stream().filter(obj->obj.getSalary()>5000).sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
		System.out.println();
		list.stream().filter(obj->obj.getSalary()>5000).forEach(System.out::println);
		System.out.println();
		list.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
		System.out.println();
		list.stream().map(obj->obj.getSalary()*0.1).forEach(x->System.out.println(x));
	}
}
