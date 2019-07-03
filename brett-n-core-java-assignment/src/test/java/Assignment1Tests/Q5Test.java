package Assignment1Tests;

import org.junit.Test;

import Assignment1.Q5SubString;

public class Q5Test {

	Q5SubString tester = new Q5SubString();
	
	@Test
	
	public void indexException() { //SubString works by converting to char array after input from scanner,
								   //then iteratively prints the value from sub1 to sub2
								   //going higher than the specified index should provide an indexoutofboundsexception
		
		tester.subStringMethod();  //Negative test due to throwing OutOfBoundsException(invalid data input)
		
	}
	
}
