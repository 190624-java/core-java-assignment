package com.revature.main;

public class Employee extends EmployeeComparator{

	private String name = "";
	private String department = "";
	private int age = 0;
	
	//Constructor by Method
	//Used for quick test case creations
	public void buildEmployee(String name, String department, int age) throws Exception {
		this.setName(name);
		this.setDepartment(department);
		this.setAge(age);
	}
	
	
//----------------------------------------
//			Getters and Setters
//----------------------------------------
	
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
	public void setAge(int age) throws Exception{
		if(age<0) throw new Exception("Error: -age. Age must be >= 0");
		this.age = age;
	}
	



//----------------------------------------
//		Comparison methods
//----------------------------------------
	
	public boolean lessThan(Employee b) {
		if(0 > this.compare(this, b)) return true;
		else return false;
	}
	public boolean greaterThan(Employee b) {
		if(0 < this.compare(this, b)) return true;
		else return false;
	}
	public boolean equals(Employee b) {
		if(0 == this.compare(this, b)) return true;
		else return false;
	}
	
	

}

