//Create a notepad file called Data.txt and enter the provided information
//Write a program that would read from the file and print it out to the screen in the provided format
//DONE
import java.util.*;
import java.io.*;
public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question20 q20 = new Question20();
		q20.read();
	}

	private static final String file = "data.txt";
	
	public void read()
	{
		try(Scanner scanner = new Scanner( new
				FileInputStream(new File(file))))
				{
					while(scanner.hasNextLine())
					{
						String data = scanner.nextLine();
						Scanner line = new Scanner(data);
						line.useDelimiter(":");
						System.out.println("Name: " + line.next() +
											" " + line.next() +
											"\nAge: " + line.next() +
											"\nState: " + line.next() + " State\n");
						line.close();
					}
				} catch (FileNotFoundException e)
		{
					System.out.println("The file was not found");
					e.printStackTrace();
		}
	}
}
