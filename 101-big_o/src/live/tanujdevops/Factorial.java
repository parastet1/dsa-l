package live.tanujdevops;

public class Factorial {

	public static void main(String[] args) {
		int n = 6;
		System.out.printf("%d! = %d", n, factorial(n));
	}

	private static int factorial(int n) {
		if (n <= 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}
