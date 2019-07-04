package com.revature.main;

import java.util.Comparator;

//Q7. Sort two employees based on their name, department, and age using the Comparator 
//interface.
public class EmployeeComparator implements Comparator<Employee>{


	@Override
	public int compare(Employee o1, Employee o2) {
//		//Check that the objects are of type Employee
//		if(Employee.class.isInstance(o1) && Employee.class.isInstance(o2)) {
			Employee a = (Employee)o1;
			Employee b = (Employee)o2;
			int lexCompare; 
			
			//Sort Level 1 (Department)
			//Find comparison value
			lexCompare = a.getDepartment().compareTo(b.getDepartment());
			//Check comparison value
			if(lexCompare<0) return -1; //less than
			else if(lexCompare>0) return 1; //greater than
			else { //equal to, so there are further tests
				//Sort Level 2 (Department, then Name)
				//Find next comparison value
				lexCompare = a.getName().compareTo(b.getName());
				//Check comparison value
				if(lexCompare<0) return -1;
				else if (lexCompare>0) return 1;
				else { //equal to, so there is 1 more test
					//Sort Level 3 (Department, Name, then Age)
					return this.compareAge(a.getAge(), b.getAge());
				}
			}
//		}
//		return -1;
	}	
	
	private int compareAge(int a, int b) {
		if(a<b) return -1;
		if(a>b) return 1;
		return 0;		
	}
	
}
