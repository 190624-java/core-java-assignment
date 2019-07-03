package assignment.q7;

import java.util.Comparator;

public class Q7 implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		int nameRank = e1.getName().compareTo(e2.getName()); //ascending alphabetically
		int depRank = e1.getDepartment().compareTo(e2.getDepartment()); //ascending alphabetically
		int ageRank = e1.getAge() - e2.getAge(); //ascending numerically
		
		return nameRank + depRank + ageRank;
	}
}
