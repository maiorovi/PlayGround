package features.domain;

public class Testing {

	public static void main(String[] args) {

	}

	private int factorial(int n) {
		if (n == 0) {
			return 1;
		}

		return n * factorial(n - 1);

	}

}
