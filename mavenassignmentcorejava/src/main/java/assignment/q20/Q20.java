package assignment.q20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

public class Q20 {
	
	private static HashMap<Integer, String> records = new HashMap<Integer, String>();
	private static FileReader fr;
	private static BufferedReader br;
	private static int rowInFile = 0; // number of rows in a file
	private static String path = "src/main/resources/Data.txt";
	
	public static void caller(int recordNumber) {
		loadFile();
		readText();
		getFileInformation(recordNumber);
	}
	
	private static void loadFile() {		
		try {		
			fr = new FileReader(path);
			br = new BufferedReader(fr);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
	// reads text from the file and stores into records
	private static void readText() {
		String line;
		try {			
			while((line = br.readLine()) != null) {
				records.put(rowInFile, line);
				rowInFile++;
			}
			fr.close();
			br.close();
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static void getFileInformation(int recordNumber) {
		String[] text = records.get(recordNumber).split(":");
		System.out.println("Name: " + text[0] + " " + text[1]);
		System.out.println("Age: " + text[2] + " years");
		System.out.println("State: " + text[3]);
	}
}
