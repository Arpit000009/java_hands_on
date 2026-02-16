package com.employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list .add(new Employee(1, "Arpit", 51000,22,"it"));
		list .add(new Employee(1, "sumit", 50000,23,"ec"));
		list .add(new Employee(1, "subham", 52000,24,"sales"));
		list .add(new Employee(1, "mayank", 56000,25,"it"));
		list .add(new Employee(1, "mayank", 56000,25,"sales"));
		list .add(new Employee(1, "mayank", 56000,25,"it"));
		list .add(new Employee(1, "mayank", 56000,25,"ec"));
		
		Stream<Employee> stream = list.stream();
		//Stream<Employee> stream2 = list.stream();
	//System.out.println(stream.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst());
	//System.out.println(stream2.max(Comparator.comparingInt(Employee::getAge)));
	Map<String, Long> stream3 = list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
	System.out.println(stream3);
	
//	System.out.println(stream.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary))));
	
	double avgSal = stream.collect(Collectors.averagingDouble(Employee::getSalary));
	list.stream().filter(e->e.getSalary()>avgSal).forEach(System.out::print);
	
	list.stream().sorted(Comparator.comparing(Employee::getDepartment).thenComparingDouble(Employee::getSalary)).forEach(System.out::println);
	}
}
