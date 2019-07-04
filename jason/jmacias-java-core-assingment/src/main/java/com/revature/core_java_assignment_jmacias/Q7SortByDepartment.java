package com.revature.core_java_assignment_jmacias;

import java.util.Comparator;

public class Q7SortByDepartment implements Comparator<Employee> {
	// sort by department
	public int compare(Employee a, Employee b) {
		return a.department.compareTo(b.department);
	}
	

}
