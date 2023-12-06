package live.tanujdevops;

public class Main6 {
	public static void main(String[] args) {
		int[] collection = { 1, 2, 3, 4, 5, 6 };
		int location = findLocation(6, collection);
		System.out.println(location);
	}

//	time complexity : O(logn)
	public static int findLocation(int n, int[] collection) {
		int left = 0;
		int right = collection.length - 1;
		int mid;
		while (left <= right) {
			mid = left + (right - left) / 2;
			if (n == collection[mid]) {
				return mid;
			} else if (n > collection[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}	
		}

		return -1;
	}
}
