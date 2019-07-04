package Assignment1;
import java.util.Comparator;

//Getting names from Employee class to sort names alphabetically for Q7

public class NameComparator implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		
		return e1.getName().compareTo(e2.getName());
		
	}
	
}