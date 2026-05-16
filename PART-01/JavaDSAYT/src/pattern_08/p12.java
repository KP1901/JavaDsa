package pattern_08;

public class p12 {
	static void main(String[] args) {
		int n = 4;
		for (int row = 1; row <= n; row++) {
//			part 1
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
//			part 2
			for (int col = 1; col <= (n - row) * 2; col++) {
				System.out.print("  ");
			}
//			part 3
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
//		new bottom

		for (int row = 1; row <= n; row++) {
//			part 1
			if (row == 1) continue;

			for (int col = 1; col <= (n - row) + 1; col++) {
				System.out.print("* ");
			}
//			part 2
			for (int col = 1; col <= (2 *  row) - 2; col++) {
				System.out.print("  ");
			}
//			part 3
			for (int col = 1; col <= (n - row) + 1; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
