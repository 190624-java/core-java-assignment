package Assignment1;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q14Switch {

	public void Switch() {

		Scanner input = new Scanner(System.in); 
		char character = 'A';
		int number = 0;

		switch (character) {

		case 'A': {

			System.out.println("Enter a number to take the square of: "); // Square root of input number
			number = input.nextInt();
			System.out.println(Math.sqrt(number));
			break;
		}

		case 'B': {

			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy"); //Retrieves date in specified format
			LocalDate localDate = LocalDate.now();
			System.out.println(dtf.format(localDate));
			break;
		}

		case 'C': {
			String str = "I am learning Core Java"; //Splitting string at specified character with x amt of splits
			String[] str2 = str.split("n", 2);
			for (String s : str2) {
				System.out.println(s);
			}
		}
		
		input.close();
		
		}
	}
}