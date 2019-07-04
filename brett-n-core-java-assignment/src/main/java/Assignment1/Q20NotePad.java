package Assignment1;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Q20NotePad {

	private static final String file = "src/main/resources/Data.txt";

	public void read() {

		try (Scanner input = new Scanner(new FileInputStream(new File(file)))) {

			while (input.hasNextLine()) {

				String info = input.nextLine();
				Scanner line = new Scanner(info);
				line.useDelimiter(";");
				System.out.println("Name: " + line.next() +  line.next() + "\nAge: " + line.next() + "\nState: "
						+ line.next());
				line.close();

			}

		} catch (FileNotFoundException e) {
			System.out.println("The file was not found");
			e.printStackTrace();
		}

	}

}