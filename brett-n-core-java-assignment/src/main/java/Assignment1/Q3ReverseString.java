package Assignment1;
import java.util.Scanner;

public class Q3ReverseString {
	
	String original;
	
	public void reverseString() {
		
		System.out.println("Enter a string to be reversed");
		Scanner input = new Scanner(System.in);
		original = input.nextLine();
		
		for(int i = original.length() - 1; i >= 0; i--) { //Loop to decrement string character array(reversal)
			System.out.print(original.charAt(i));
		}
		
		input.close();
		
	}
	
}