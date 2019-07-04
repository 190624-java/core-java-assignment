package Assignment1;

public class Q4Factorial {

	public static int factorial(int n) {

		int solution = 1;
		for (int i = 1; i <= n; i++) {

			solution = solution * i;

		}

		return solution;

	}

}