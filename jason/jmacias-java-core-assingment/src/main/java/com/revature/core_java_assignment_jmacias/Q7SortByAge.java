package com.revature.core_java_assignment_jmacias;

import java.util.Comparator;

public class Q7SortByAge implements Comparator<Employee> {
	// Sort by age

	public int compare(Employee a, Employee b) {
		return a.age - b.age;
	}
}
