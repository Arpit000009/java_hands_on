package com.collection;

import java.util.Comparator;

public class nameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getStudName().compareTo(o2.getStudName());
	}

}
