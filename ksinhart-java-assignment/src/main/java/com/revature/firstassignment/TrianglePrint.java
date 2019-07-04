package com.revature.firstassignment;

import java.util.LinkedList;

public class TrianglePrint {
	
	public static void printTriangle() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		boolean flip=true;//while true its 0
						//while false its 1
		int line =1;
		while(line<=4) {
			if(flip) {
				list.addFirst(0);
				flip=false;
			}
			else {
				list.addFirst(1);
				flip=true;
			}
			
			//System.out.println(list.toString());
			
			for(int n : list) {
				System.out.print(n+" ");
			}
			System.out.println();
			
			line++;
		}
	}
	
}
