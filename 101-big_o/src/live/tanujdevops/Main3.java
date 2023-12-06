package live.tanujdevops;

public class Main3 {
	public static void main(String[] args) {
		printItems(5);
	}

//	time complexity : O(n * n)
//	O(n^2) grows much faster as compared to O(n)
//	meaning for a small input it will do many operations
//	hence from time complexity perspective, it is less efficient
//	so, if there is a way to do same calculation by taking O(n) time, then there is huge gain in efficiency
	public static void printItems(int n) {
		// n times
		for (int i = 0; i < n; i++) {
			// n times
			for (int j = 0; j < n; j++) {
				System.out.println(i + "," + j);
			}
		}
	}
}
