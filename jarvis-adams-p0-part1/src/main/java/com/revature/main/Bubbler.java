package com.revature.main;

public class Bubbler {

	
	//Constructor
	public Bubbler() {	}
	
	int[] defaultA = {1,0,5,6,3,2,3,7,9,8,4};
	
	public int[] doDefaultSort() {
		int[] defaultA = {1,0,5,6,3,2,3,7,9,8,4};
		return bubbleSort(defaultA);
	}
	
	/**
	 * Bubble sorts the given array in-place
	 * @param a the array to sort
	 * @return
	 */
	public int[] bubbleSort(int[] a) {
		int temp; //for swapping bubbled values		
		
		//outer loop prevents repeat comparisons from the left, working right.
		for(int r=0; r<a.length; r++) {
			//inner loop does comparisons from right to left, effectively bubbling smallest values
			//toward the left.
			for(int i=a.length-1; i>r; i--) {			
				//if value on the right is greater than the one on the left, swap the two.
				//this causes a comparison with the value that was potentially smaller, effectively
				//bubbling the smallest value to the farthest left as it can go.
				if(a[i]<a[i-1]) {					
					//Swap the values
					temp = a[i];
					a[i] = a[i-1];
					a[i-1] = temp;
				}				
			};
		}
		return a;
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public boolean equals(int[]a, int[]b) {
		//Tests for false conditions
		if(a.length != b.length) {
			System.out.println("Not Equal Length of Arrays");
			return false;
		} 
		//Test each character along the length of the array
		for(int i=0; i<a.length; i++) {
			if(a[i] != b[i]) return false;
		}
		
		//If no fail case occurred, then there is a pass case.
		return true;		
	}
}
