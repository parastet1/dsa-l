package live.tanujdevops;

public class TowerOfHanoi {
	private static int stepCounter = 0;

	public static void main(String[] args) {
		transfer(5, "A", "B", "C");
	}

	public static void transfer(int n, String source, String intermediate, String destination) {
		if (n == 0)
			return;
		transfer(n - 1, source, destination, intermediate);
		System.out.println("step #" + ++stepCounter + " a disk from " + source + " to " + destination);
		transfer(n - 1, intermediate, source, destination);
	}

}
