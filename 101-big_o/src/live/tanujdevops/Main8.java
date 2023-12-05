package live.tanujdevops;

public class Main8 {
	public static void main(String[] args) {
		printItems(10, 20);
	}

//	time complexity : O(m * n)
	public static void printItems(int m, int n) {
//		O(n)
		for (int i = 0; i < m; i++) {
//			O(m)
			for (int j = 0; j < n; j++) {
				System.out.println(i + "," + j);
			}
		}

	}
}
