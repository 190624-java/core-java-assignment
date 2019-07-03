package Assignment1;

public class Q1BubbleSort {

	public void bubbleSort(int[] arr) {

		int i, j, temp;

		for (i = 0; i < arr.length - 1; i++) { // Creation of outer loop (arr.length(11) - 1, only 10 elements
			for (j = 0; j < arr.length - i - 1; j++) { // Creation of inner loop (arr.length(11) - i - 1 to avoid
														// indexoutofbounds)
				if (arr[j] > arr[j + 1]) {
					temp = arr[j]; // Move j to temp
					arr[j] = arr[j + 1]; // Move j+1 to j
					arr[j + 1] = temp; // Move temp to j+1

				}
			}
		}
	}

	public void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i]);

		}
	}

}