package Assignment1;
import java.util.*;

public class Q18StringClass extends StringCases {

	String check = "";
	String origValue = "";
	boolean hasUpper = true;

	Scanner input = new Scanner(System.in);
	
	public void stringCheckUpper() {

		System.out.println("Enter a string to check for uppercase characters: ");
		origValue = input.next();
		check = origValue.toLowerCase();

		if (origValue == check) {
			
			hasUpper = false;
			
		} else if (origValue != check) {

			hasUpper = true;
		}
		System.out.println(hasUpper);
		

	}

	public void stringLowerToUpper() {
		
		System.out.println(origValue.toUpperCase());

	}

	public void stringToInt() {
		
		int x = Integer.parseInt(origValue);
		System.out.println(x + 10);

	}

}