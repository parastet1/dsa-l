package live.tanujdevops;

public class Main4 {
	public static void main(String[] args) {
		printItems(10);
	}

//	time complexity : O(n * n + n) = O(n*n)
//	non-dominant terms can be dropped
	public static void printItems(int n) {
		// O(n*n)
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(i + "," + j);
			}
		}

		// O(n)
		for (int k = 0; k < n; k++) {
			System.out.println(k);
		}
	}
}
