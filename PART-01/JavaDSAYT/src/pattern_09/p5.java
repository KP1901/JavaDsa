package pattern_09;

public class p5 {
	static void main(String[] args) {
		int n = 4;
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n - row; col++) {
				System.out.print("  ");
			}
			for (int col = 1; col <= 2 * row - 1; col++) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}
}
