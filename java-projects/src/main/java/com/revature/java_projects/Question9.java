package com.revature.java_projects;

import java.util.ArrayList;

public class Question9 
{
	public static void readAnswer() 
	{
		int[] TotalNum = new int[100];
	    int pop = 1;
	    for(int l = 0; l<TotalNum.length; l++)
	    {
	        TotalNum[l] = pop;
	        pop++;
	    }
	    ArrayList<Integer> PrimeNum = new ArrayList<Integer>();
	    boolean isPrime = true;
	    boolean dividing = true;
	    int curNum;
	    int intDivision = 0;
	    float numerator = 1.00f;
	    float divNumber;
	    for(int i=0; i<100; i++)
	    {
	    	curNum = i+1;
	        while(dividing == true)
	        {
	        	
	        	if(numerator <= 100) 
	        	{
	        		divNumber = curNum/numerator;
	        		//System.out.println(curNum + " divided by " + numerator + " equal " + divNumber);
	        		if(divNumber == (int)divNumber) 
	        		{
	        			intDivision++;
	        		}
	        		
	        		numerator++;
	        	}

	        	
	        	if(intDivision>2)
	            {
	                isPrime = false;
	                intDivision = 0;
	                dividing = false;
	                numerator = 1;
	            }
	        	if(numerator >= 100 && isPrime == true) 
	        	{
	        		intDivision = 0;
	        		dividing = false;
	        		numerator = 1;
	        	}

	        }
	        if(isPrime == true)
	        {
	            PrimeNum.add(curNum);
	        }

	        isPrime = true;
	        dividing = true;
	
	    }
	    System.out.println(PrimeNum);
	}
}
