package com.revature.core_java_assignment_jmacias;

import java.util.Comparator;

// Instructions:
// Sort two employees based on their name, department, and age
// using the Comparator interface.

public class Q7SortByName implements Comparator<Employee> {
	// sort by name
	public int compare(Employee a, Employee b) {
		return a.name.compareTo(b.name);
	}
	

}
