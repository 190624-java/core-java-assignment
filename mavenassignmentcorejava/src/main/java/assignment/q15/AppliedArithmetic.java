package assignment.q15;

public class AppliedArithmetic implements Arithmetic {

	@Override
	public double addition(double a, double b) {
		return a + b;
	}

	@Override
	public double subtraction(double a, double b) {
		return a - b;
	}

	@Override
	public double multiplication(double a, double b) {
		return a * b;
	}

	@Override
	public double division(double a, double b) {
		return a / b;
	}

}
