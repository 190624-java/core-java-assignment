package com.revature.java_projects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question20 
{
	private static String file = "resources/Data.txt";
	
	public static void readAnswer() 
	{

		try(Scanner scan = new Scanner(new FileInputStream(new File(file))))
		{
			while(scan.hasNextLine()) 
			{
				String line = scan.nextLine();
				Scanner cons = new Scanner(line);
				cons.useDelimiter(":");
				System.out.println("Name: " + cons.next() + " " + cons.next());
				System.out.println("Age: " + cons.next() + " years");
				System.out.println("State: " + cons.next() + " state");
				System.out.println();
				cons.close();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
