package Assignment1;
import java.util.Scanner;

public class Q5SubString {

	public void subStringMethod() {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a string");
		String str = input.next();

		char[] arr = str.toCharArray();

		System.out.println("Please enter sub1");
		int sub1 = input.nextInt();

		System.out.println("Please enter sub2");
		int sub2 = input.nextInt();

		while (sub1 <= sub2) { //Prints from sub1 to sub2 (inclusive)

			System.out.println(arr[sub1]);
			sub1++;
		}
		
		input.close();
	}
}