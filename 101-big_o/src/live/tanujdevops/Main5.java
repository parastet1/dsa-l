package live.tanujdevops;

public class Main5 {
	public static void main(String[] args) {
		addItems(100000);
	}

//	time complexity : O(2) == O(1)
//	no matter how big the value of n is, the number of operation remains constant
//	there is only 2 addition operation
	public static int addItems(int n) {
		return n + n + n;
	}
}
