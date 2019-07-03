package com.revature.java_projects;
import java.util.*;
public class JavaCoreProject {


	static Scanner readLn = new Scanner(System.in);
	static int outNum = 0;
	
	
	public static void main(String[] args) 
	{
		
		System.out.println("Jeeves: Which problem shall I solve for you sir?");
		String choice = readLn.nextLine();
		System.out.println(choice);
		boolean solving = true;
		while(solving)
		{

			try 
			{
				outNum = Integer.parseInt(choice);
				runJeeves(outNum);
				solving = false;
				break;
			}
			catch(Exception e) 
			{
				e.printStackTrace();
				System.out.println("Jeeves:I'm sorry sir, please enter a simple integer. I'm a very simple bot.");
				return;
			}
		}

	}

	static void runJeeves(int outNum) 
	{
		if(outNum == 1) 
		{
			Question1.readanswer();
		}
		else if(outNum == 2) 
		{
			Question2.readAnswer();
		}
		else if(outNum == 3) 
		{
			Question3 question3 = new Question3();
			System.out.println("Jeeves: I shall reverse whatever you say! Give me something to work my magic on sir.");
			question3.readAnswer(readLn.nextLine());
		}
		else if(outNum == 4) 
		{
			System.out.println("Jeeves: I shall calculate the factorial of any number you give me sir, just say the word!");
			Question4.readAnswer(readLn.nextInt());
		}
		else if(outNum == 5) 
		{
			System.out.println("Jeeves: Tell me some words sir, and a number, and I shall truncate your words at that number.");
			String str = readLn.nextLine();
			int idx = readLn.nextInt();
			System.out.println("");
			Question5.readAnswer(str, idx);
		}
		else if(outNum == 6) 
		{
			System.out.println("Jeeves: Good sir,please tell me an integer so I might tell you if it is odd, or even.");
			Integer num = readLn.nextInt();
			Question6 question6 = new Question6(num);
			
		}
		else if(outNum == 7) 
		{
			Question7.readAnswer();
		}
		else if(outNum == 8) 
		{
			Question8.readAnswer();
		}
		else if(outNum == 9) 
		{
			Question9.readAnswer();
		}
		else if(outNum == 10) 
		{
			System.out.println("Jeeves: Excellent choice, pick two numbers and I'll tell you which is lower!");
			int temp = Question10.readAnswer(Integer.parseInt(readLn.nextLine()),Integer.parseInt(readLn.nextLine()));
			System.out.println(temp);
		}		
		else if(outNum == 11) 
		{
			Question11.readAnswer();
		}
		else if(outNum == 12) 
		{
			Question12.readAnswer();
		}
		else if(outNum == 13) 
		{
			Question13.readAnswer();
		}
		else if(outNum == 14) 
		{
			Question14.readAnswer(readLn.nextInt());
		}
		else if(outNum == 15) 
		{
			Question15 question15 = new Question15();
			try
			{
				System.out.println("Jeeves: What numbers shall I perform mathematics on for you sir?");
				Integer num = readLn.nextInt();
				System.out.println("Jeeves: And the next number sir?");
				Integer num2 = readLn.nextInt();
				float add = question15.add(num, num2);
				System.out.println("Jeeves: Right then, first for addition I have " + num + " which is added to " + num2 + ", which gives us a total of " + add);
				float subtract = question15.subtract(num, num2);
				System.out.println("Jeeves: Next we'll subtract " + num + " with " + num2 + ", which results in " + subtract);
				float multiply = question15.multiply(num, num2);
				System.out.println("Jeeves: Thirdly we'll multiply " + num + " and " + num2 + " together to get " + multiply);
				float divide = question15.divide(num, num2);
				System.out.println("Jeeves: Finally we shall divide" + num + " by "+ num2 + " for a quotient of " + divide);
			}
			catch(Exception e)
			{
				System.out.println("Jeeves:I'm sorry sir, please only use one number at a time, and be sure to only provide me with numbers!");
				System.out.println("Jeeves: Let's try again shall we? From the top then.");
				return;
			}
			
			
		}
		else if(outNum == 16) 
		{
			Question16 question16 = new Question16();
		}
		else if(outNum == 17) 
		{
			System.out.println("Jeeves: Taking an interest in finances are we? Very well, first input the principal of your investment sir.");
			double principal = readLn.nextDouble();
			System.out.println("Jeeves: Next, kindly provide me for the years you've been accruing interest, decimals are fine.");
			double time = readLn.nextDouble();;
			System.out.println("Jeeves: Finally, please provide me with the rate, or percentage you expect the principal to grow by.");
			double rate = readLn.nextDouble();;
			Question17.readAnswer(principal, rate, time);;
		}
		else if(outNum == 18) 
		{
			Question18 question18 = new Question18();
		}
		else if(outNum == 19) 
		{
			Question19.readAnswer();
		}
		else if(outNum == 20) 
		{
			Question20.readAnswer();
		}
	}
	
	
}
