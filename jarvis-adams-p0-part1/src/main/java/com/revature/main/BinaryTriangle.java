package com.revature.main;

//Q13. Display the triangle on the console as follows using any type of loop.  Do NOT use a 
//simple group of print statements to accomplish this.  
//	0 
//	1 0
//	1 0 1
//	0 1 0 1
public class BinaryTriangle {

	boolean b;

	BinaryTriangle(){
		this.b = true;
	}
	
	private void alternateBinary() {
		this.b = !this.b;
	}
	
	public void printTriangle(){
		for(int i=1; i<5; i++) {
			for(int j=i; j>0;j--) {
				if(!this.b) System.out.print(" 0");
				else System.out.println(" 1");
			}
			System.out.println();
		}
	}
}
