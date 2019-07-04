package com.revature.firstassignment;

import java.time.LocalDateTime;
import java.util.ArrayList;
//import java.util.Calendar;
import java.util.Scanner;

public class SwitchCases {
	//use strings
	/*
	public void switchCases(int a) {
		//Scanner scanner = new Scanner(System.in);
		//int a = scanner.nextInt();
		switch(a) {
		case 1:
			System.out.println("Enter a number: ");
			//double d = scanner.nextDouble();
			
			//System.out.println(Math.sqrt(d));
			
		case 2:
			//System.out.println(Calendar.getInstance().getTime());
			LocalDateTime.now().toString();
		case 3:
			System.out.println("yay");
		}
			
	}
	*/
	
	public void switchCases(Scanner scanner) {
		System.out.println("Do you want:\n(1)Square root of the next number you enter\n"
				+ "(2)The current time\n(3)Example of string storage");
		int a = scanner.nextInt();
		switch(a) {
		case 1:
			System.out.println("Enter a number: ");
			double d=scanner.nextDouble();
			System.out.println(Math.sqrt(d));
			break;
		case 2:
			System.out.println(LocalDateTime.now().toString());
			break;
		case 3:
			String example = "I am learning Core Java";
			Scanner strScan = new Scanner(example);
			ArrayList<String> strList = new ArrayList<String>();
			while(strScan.hasNext()) {
				strList.add(strScan.next());
			}
			System.out.println(strList.toString());
			strScan.close();
			break;
		}
	}
}
