package Assignment1;
import java.util.Comparator;

//Getting department from Employee class to sort alphabetically for Q7

public class DepartmentComparator implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		
		return e1.getDepartment().compareTo(e2.getDepartment());
		
	}
	
}
