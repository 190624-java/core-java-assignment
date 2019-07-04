package com.revature.firstassignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	
	public void readFile() throws FileNotFoundException, IOException {
		File file=new File("Data.txt");
		
		try (FileInputStream fis = new FileInputStream(file)) {
			Scanner scanner = new Scanner(fis);
			scanner.useDelimiter("(:|\\n)");
			while(scanner.hasNextLine()) {
				
				String fname, lname, place;
				int age;
				
				fname=scanner.next();
				lname=scanner.next();
				age=scanner.nextInt();
				place=scanner.next();
				
				ReadObject ro=new ReadObject(fname,lname,age,place);
				
				System.out.println("Name: "+fname + " "+ lname);
				System.out.println("Age: "+ age);
				System.out.println("State: "+ place+"\n");
				
				/*
				String strB = new String(scanner.nextLine());
				StringBuilder temp=new StringBuilder();
				ReadObject ro;
				for(char c: strB.toCharArray()) {
					if(c!=':') {
						temp.append(c);
					}
					else {
						
					}
				}
				*/
			}
			scanner.close();
		}
	}
}

class ReadObject{
	String fname;
	String lname;
	int age;
	String place;
	public ReadObject(String fname, String lname, int age, String place) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.place = place;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setPlace(String place) {
		this.place = place;
	}
	
}
