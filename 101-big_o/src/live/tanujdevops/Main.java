package live.tanujdevops;

public class Main {
	public static void main(String[] args) {
		printItems(10);
	}

//	time complexity : O(n)
	public static void printItems(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(i);
		}
	}
}
