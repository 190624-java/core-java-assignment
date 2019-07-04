package assignment_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharacterReader {
	File file = new File("characters.txt");
	public void read() {
		try(Scanner scanner = new Scanner(new FileInputStream(file))){
			
			while(scanner.hasNextLine()) {
				String data = scanner.nextLine();
				Scanner line = new Scanner(data);
				line.useDelimiter(":");
				System.out.println("Name: " + line.next() + " " + line.next());
				System.out.println("Age: " + line.next() + " years");
				System.out.println("State: " + line.next());
				System.out.println();
				line.close();
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found");
			e.printStackTrace();
		}
	}

}
