package assignment_1;

import java.util.Comparator;

public class Employee{
	
	String name;
	int age;
	String department;
	
	public Employee(String name, int age, String department) {
		this.name = name;
		this.age = age;
		this.department = department;
	}

}

class sortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
