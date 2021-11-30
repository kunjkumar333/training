package businesscode;

public class Calculator {

	public double add(double a, double b) {
		return a + b;
	}

	public double subtract(double a, double b) {
		return a - b;
	}

	public double multiply(double a, double b) {
		return a * b;
	}

	public double divide(double a, double b) {
		if (b == 0) {
			throw new ArithmeticException();
		}
		return a / b;
	}

	public double multiply(int a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}
}
