package com.collection;

import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Set<Student> StudSet = new TreeSet<Student>(new AgeComparator());
		StudSet.add(new Student(1, "Shayam", 22));
		StudSet.add(new Student(3, "Akash", 24));
		StudSet.add(new Student(2, "Ram", 21));
		
		for(Student str:StudSet) {
			System.out.println(str.getStudName());
		}
		
		System.out.println(StudSet);
	}
}
