package com.revature.firstassignment;

public class Fibonacci {
	
	public static void fibonacci() {
		//System.out.println(0);
		int curr =1;
		//int next;
		int prev=0;
		int temp;
		System.out.print(prev+","+curr);
		for(int i=1;i<25;i++) {
			temp=curr;
			curr=curr+prev;
			prev=temp;
			System.out.print(","+curr);
			
		}
		System.out.println();
	}

}
