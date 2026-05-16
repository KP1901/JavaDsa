package pattern_08;

public class p10 {
	static void main(String[] args) {

		int n = 4;

//		for (int row = 1; row <= n; row++) {
////			space
//			for (int col = 1; col <= n - row; col++) {
//				System.out.print("  ");
//			}
////			star
//			for (int col = 1; col <= 2 * row - 1; col++) {
//				System.out.print("* ");
//
//			}
//			System.out.println();
//		}
//		for (int row = 1; row <= n; row++) {
////			space
//			if (row == 1) continue;
//			for (int col = 1; col <= row - 1; col++) {
//				System.out.print("  ");
//			}
////			star
//			for (int col = 1; col <= 2 * n - 2 * row + 1; col++) {
//				System.out.print("* ");
//
//			}
//			System.out.println();
//		}

		for (int i = 1; i <= n; i++) {
//			part 1
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
//			part 2
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <= n - 1; i++) {
//			part 3
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
//			part 4
			for (int j = 1; j <= 2 * (n - i) - 1; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

}
