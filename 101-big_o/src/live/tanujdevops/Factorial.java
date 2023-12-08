package live.tanujdevops;

public class Factorial {

	public static void main(String[] args) {
		int n = 6;
		System.out.printf("%d! = %d", n, factorial(n));
	}

//	Recursive relation:
//	T(n) = a, n <= 1
//	     = b + T(n-1), n > 1
//	
//	     = O(n)
	private static int factorial(int n) {
		if (n <= 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}
