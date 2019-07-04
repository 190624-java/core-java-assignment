package Assignment1;

public class Q12Array {

	int[] arr = new int[101]; //Initializing array

	public void evenNumbers() {

		for (int i = 0; i < arr.length; i++) {

			arr[i] = i;  //Storing numbers 0 - 100 in array
		}

		for (int temp : arr) {

			if (temp % 2 == 0) { //If value in temp returns remainder 0 (is even) print

				System.out.println(temp);

			}

		}

	}

}