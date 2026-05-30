package pattern_08;

public class p8 {
	static void main(String[] args) {
		int n = 6;
//		for (int row = 1; row <= n; row++) {
//			for (int col = 1; col <= row; col++) {
//				if (row == 1 || row == 2 || row == n) {
//					System.out.print("* ");
//				} else {
//					if (col == 1 || col == row) {
//						System.out.print("* ");
//					} else {
//						System.out.print("  ");
//					}
//				}
//			}
//			System.out.println();


		for (int row = 1; row <= n; row++) {
			if (row == 1 || row == 2 || row == n) {
				for (int col = 1; col <= row; col++) {
					System.out.print("* ");
				}
			} else {
				System.out.print("* ");
				for (int col = 1; col <= row - 2; col++) {
					System.out.print("_ ");
				}
				System.out.print("* ");
			}
			System.out.println();

		}


	}
}
