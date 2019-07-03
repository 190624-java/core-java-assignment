package com.revature.firstassignment;

import java.util.Comparator;

public class Employee {
	protected String name;
	protected String department;
	protected int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(String name, String department, int age) {
		super();
		this.name = name;
		this.department = department;
		this.age = age;
	}
	
}

class EmployeeNameComparator implements Comparator<Employee>{

	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}

class EmployeeAgeComparator implements Comparator<Employee>{

	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getAge()>=o2.getAge()) {
			if(o1.getAge()==o2.getAge()) {
				return 0;
			}
			else {
				return 1;
			}
		}
		else {
			return -1;
		}
	}
	
}

class EmployeeDepartmentComparator implements Comparator<Employee>{

	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getDepartment().compareTo(o2.getDepartment());
	}
	
}
