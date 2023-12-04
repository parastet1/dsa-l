package live.tanujdevops;

public class Main5 {
	public static void main(String[] args) {
		addItems(10);
	}

//	time complexity : O(1)
//	no matter how big the value of n is, the number of operation remains constant
//	there is only one addition operation
	public static int addItems(int n) {
		return n + n;
	}
}
