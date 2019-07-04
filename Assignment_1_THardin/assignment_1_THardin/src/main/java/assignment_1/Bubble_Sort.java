package assignment_1;

public class Bubble_Sort {
	//Q1 Bubble sort 1,0,5,6,3,2,3,7,9,8,4
	
	//sorts the array which will be passed in
	void sort(int arr[])
	{
		int n = arr.length;
		
		//first loop is used to keep the second loop from checking the end of the array which is already sorted
		for (int i = 0; i < n-1; i++) {
			//second loop compares elements and moves the larger element to the end of the array
			for (int j = 0; j < n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	void printIntArray(int arr[]) {
		int n = arr.length;
		
		for (int i = 0; i < n-1; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
}
