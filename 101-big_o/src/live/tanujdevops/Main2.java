package live.tanujdevops;

public class Main2 {
	public static void main(String[] args) {
		printItems(10);
	}

//	time complexity : O(2n) == O(n)
//	constants can be dropped
	public static void printItems(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(i);
		}

		for (int i = 0; i < n; i++) {
			System.out.println(i);
		}
	}
}
