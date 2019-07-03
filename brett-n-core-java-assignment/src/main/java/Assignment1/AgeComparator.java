package Assignment1;
import java.util.Comparator;

// Getting age from Employee class to compare age for Q7

public class AgeComparator implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		if (e1.getAge() == e2.getAge()) {
			return 0;
		} else if (e1.getAge() > e2.getAge()) {
			return 1;
		} else {
			return -1;
		}
	}
}
