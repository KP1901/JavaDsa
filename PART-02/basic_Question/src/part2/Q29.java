package part2;

public class Q29 {
	public static void main(String[] args) {
		int n = 9;
		int original = n;
		int sqOfN = n * n;
		int sum = 0;

		while (sqOfN != 0) {
			int rem = sqOfN % 10;
			sum = sum + rem;
			sqOfN = sqOfN / 10;
		}
		if (sum == original) {
			System.out.println("Neon number");
		} else {
			System.out.println("Not Neon number");
		}
	}
}
