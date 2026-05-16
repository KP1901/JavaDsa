package part2;

public class n3 {
	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {
			// part 1
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			// part 2
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			// part 3
			for (int j = 2; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
