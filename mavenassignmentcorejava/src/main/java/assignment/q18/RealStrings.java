package assignment.q18;

/*
 * Provides implementation for the 3 abstract methods
 *	in abstract class AbstractStrings 
 *
 */
public class RealStrings extends AbstractStrings {

	@Override
	// Returns true if one or more chars are uppercase, false otherwise
	public boolean isUppercase(String s) {
		char[] chars = new char[s.length()];
		
		// load chars in array
		for(int i = 0; i < s.length(); i++) {
			chars[i] = s.charAt(i);
		}
		
		// check if upper
		for(char c : chars) {
			if((int)c >= 65 && c <= 122) { // ensures c is not special character or number
				String lowerLetter = Character.toString(c);
				String upperLetter = (lowerLetter).toUpperCase();
				if((lowerLetter).equals(upperLetter)) return true;
			}	
		}
		return false;
	}

	@Override
	public String makeUpper(String s) {
		return s.toUpperCase();
	}

	@Override
	// converts input string to integer and adds 10 to it
	public int stringToInt(String s) {
		char[] chars = new char[s.length()];
		int sum = 0;
		
		// load chars in array
		for(int i = 0; i < s.length(); i++) {
			chars[i] = s.charAt(i);
		}
		
		// add chars
		for(char c : chars) {
			sum += (int) c;
		}
		return sum + 10;
	}

	
	
}
