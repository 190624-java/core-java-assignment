package com.revature.core_java_assignment_jmacias;
import java.io.*;

public class Q20 {
	public static void readData() throws IOException {
		File data = new File(".\\src\\main\\resources\\Data.txt");
	
	BufferedReader bReader = new BufferedReader(new FileReader(data));
	System.out.println(bReader.readLine());
	bReader.close();
	}
}
