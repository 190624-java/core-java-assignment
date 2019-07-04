package com.revature.core_java_assignment_jmacias;

public class Q1 {
	// Instructions:
	// Perform a bubble sort on the following integer array
	// 1,0,5,6,3,2,3,7,9,8,4
	
	public static int[] bubbleSort(int[] arr) {
		/* setting up flag to be set as false in do while loop and
		 	toggled to true if any indexes were swapped in this pass
		 	so that loop can be stopped if the whole array is looped
		 	through without a swap*/
		boolean swapped;
		do {
			swapped = false;
			/* bubble sort loop, comparing value at index i with
			 	following value and swapping if first is greater*/
			for (int i = 0; i < arr.length -1 ; i++) {
				if (arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					swapped = true;
				}	
			}
		}
		while(swapped);
		// return sorted array
		return arr;
	}
	
}
