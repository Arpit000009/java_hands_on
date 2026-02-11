package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<Employee>list = Arrays.asList(new Employee("emp1","arpit",22),new Employee("emp1","mithun",22),new Employee("emp1","nikhil",22));
//		Stream<Employee>empStream = list.stream();
		
		List<Employee> l = list.stream().filter(obj->obj.getEmpName().charAt(0)=='n').collect(Collectors.toList());
		
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i).getEmpName());;
		}
		}
}
