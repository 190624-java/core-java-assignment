//Question: Sort two employees based on their name, department, and age using the Comparator interface
import java.util.*;
public class Question7 {

	static List<Employee> eList = new ArrayList<Employee>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eList.add(new Employee("Dude", "Sales", 43));
		eList.add(new Employee("Gretchen", "HR", 47));
		Collections.sort(eList);
		for(Employee e: eList)
		{
			System.out.println(e.getName());
		}
		Collections.sort(eList, new Employee());
		for(Employee e: eList)
		{
			System.out.println(e.getName() + ": " + e.getDepartment() + " " + e.getAge());
		}
	}
public void addEmployee(String n, String d, int a)
{
	eList.add(new Employee(n, d, a));
}
public List<Employee> sortEmployees()
{
	Collections.sort(eList);
	for(Employee e: eList)
	{
		System.out.println(e.getName());
	}
	Collections.sort(eList, new Employee());
	for(Employee e: eList)
	{
		System.out.println(e.getName() + ": " + e.getDepartment() + " " + e.getAge());
	}
	return eList;
}
}
class Employee implements Comparator<Employee>, Comparable<Employee>
{
	private String name;
	private String department;
	private int age;
	Employee()
	{
		
	}
	Employee(String n, String d, int a)
	{
		this.name = n;
		this.age = a;
		this.department = d;
	}
	public int getAge()
	{
		return age;
	}
	public String getDepartment()
	{
		return department;
	}
	public String getName()
	{
		return name;
	}
	public int compareTo(Employee e)
	{
		return (this.name).compareTo(e.name);
	}
	public int compare(Employee e, Employee e1)
	{
		return e.department.compareTo(e1.department);
	}
	public int compare(Employee e, Employee e1, int parameter)
	{
		switch(parameter)
		{
		case 1:
			return e.age - e1.age;
		case 2:
			return e.department.compareTo(e1.department);
		case 3:
			return e.name.compareTo(e1.name);
		}
		return e.age - e1.age;
	}
}