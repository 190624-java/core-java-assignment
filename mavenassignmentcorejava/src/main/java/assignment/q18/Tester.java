package assignment.q18;

public class Tester {

	// Tests q18 class outputs
	public static void main(String[] args) {
		RealStrings rs = new RealStrings();
		
		// Tests isUppercase()
		System.out.println(rs.isUppercase("hello world!")); // prints false
		System.out.println(rs.isUppercase("hello woRld!")); //prints true
		
		
		// Tests makeUpper
		System.out.println(rs.makeUpper("This will become uppercase."));
		
		// Tests stringToInt()
		// should print 508, chars ints are: 65 + 112 + 112 + 108 + 101 = 498 then plus 10, equals 508
		System.out.println(rs.stringToInt("Apple")); 
		
		
	}

}
