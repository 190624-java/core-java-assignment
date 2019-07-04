package com.revature.firstassignment;

import java.util.ArrayList;

public class PrimePrint {
	public static void primePrint() {
		ArrayList<Integer> numList = new ArrayList<Integer>(100);
		int i=1;
		while(i<101) {
			numList.add(i);
			i++;
		}//array now has 1 to 100
		//System.out.println(numList.toString());
		
		for(int n : numList) {
			//System.out.println(n);
			if(isPrime(n)) {
				System.out.print(n+",");
			}
		}
		System.out.println("\n");
		
		
	}
	
	public static boolean isPrime(int n) {
		int denom=2;
        while (denom<n)
        {
            if (n%denom==0)
            {
                //cannot be a prime number
                return false;
            }
            denom++;
        }      
        return true;
	}
}
