package Assignment1;
import java.util.ArrayList;

public class Q9PrimeNumbers {

	public void Prime() {

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 1; i < 100; i++) { //Adding numbers 1 to 100
			al.add(i);
		}

		System.out.println(al);

		for (int i = 0; i < al.size() - 1; i++) {

			if (!isPrime(al.get(i))) { //Remove the element if it's not prime and shifts
				al.remove(i);
				i--;
			}
		}

		System.out.println(al);

	}

	public static boolean isPrime(int x) { //Method that determines if the number is prime

		boolean isPrime = true;
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				isPrime = false;
			}
		}
		return isPrime;

	}

}