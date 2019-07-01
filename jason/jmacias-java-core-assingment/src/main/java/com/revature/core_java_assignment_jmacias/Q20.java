package com.revature.core_java_assignment_jmacias;
import java.io.*;

public class Q20 {
	// Instructions: 
	// Create a notepad file called Data.txt and enter the following:
	// Mickey:Mouse:35:Arizona
	// Hulk:Hogan:50:Virginia
	// Roger:Rabbit:22:California
	// Wonder:Woman:18:Montana
	// Write a program that would read from the file and print it out to the 
	// screen in the following
	// format:
	// Name: Mickey Mouse
	// Age: 35 years
	// State: Arizona State
	
	// private function to format an array into printable text for other method
	private static String printLine(String[] line) {
		return "Name: " + line[0] + " " + line[1] + "\n" +
				"Age: " + line[2] + " years\n" +
				"State: " + line[3] + " state" + "\n";
	}
	
	public static void readData() throws IOException {
		File data = new File(".\\src\\main\\resources\\Data.txt");
	
	BufferedReader bReader = new BufferedReader(new FileReader(data));
	String line = bReader.readLine();
	String[] lineArr1 = line.split(":");
	String line2 = bReader.readLine();
	String[] lineArr2 = line2.split(":");
	String line3 = bReader.readLine();
	String[] lineArr3 = line3.split(":");
	System.out.println(printLine(lineArr1));
	System.out.println(printLine(lineArr2));
	System.out.println(printLine(lineArr3));
	bReader.close();
	}
}
