package assignment;

// Bubble Sort an array
public class Q1 {
	
	public static int[] bubbleSort(int a[]) {
		int temp;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length - 1; j++) {
				if(a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
}
