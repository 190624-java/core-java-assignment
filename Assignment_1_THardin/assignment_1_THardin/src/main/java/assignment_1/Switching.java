package assignment_1;

import java.util.Scanner;
import java.lang.Math;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Switching {
	
	void runSwitch(Scanner scanner) {
		
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		System.out.println("Case 1: Find the suare root of a number");
		System.out.println("Case 2: Display today's date.");
		System.out.println("Case 3: Split up 'I am learing Core Java");
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		System.out.println("Please enter a case number.");
		
		int choice = scanner.nextInt();
		
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		
		switch(choice){
		
		case 1:{
			
			System.out.println("Enter the number.");
			
			int r1 = scanner.nextInt();
			
			System.out.println(Math.sqrt(r1));
			
		}break;
		
		case 2:{
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
			LocalDate localDate = LocalDate.now();
			System.out.println(dtf.format(localDate));
			
		}break;
		
		case 3:{
			String str = "I am learning core java";
			String[] arr = str.split("\\s+");
			
		}break;
		
		}
	}

}
