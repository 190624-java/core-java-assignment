package Assignment1Tests;
import org.junit.Test;
import Assignment1.Q2FibonacciNumbers;

public class Q2Test {

	
	@Test
	public void positiveFibNumbers() { //Program created to print fibonacci sequence based on amt passed
									   //and looped. Amt returned should be 0 in both tests
		
		Q2FibonacciNumbers tester = new Q2FibonacciNumbers();
		
		tester.printFib(-25);
		tester.printFib(0);
		
	}
	
}
