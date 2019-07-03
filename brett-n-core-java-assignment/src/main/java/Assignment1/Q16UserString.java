package Assignment1;
import java.util.Scanner;

public class Q16UserString {

	public void numOfCharacters() {

		char[] str2;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string for the number of characters: ");
		String str = input.next();
		str2 = str.toCharArray();

		System.out.println(str2.length);

		input.close();
	}
}