package patterns;
//hour glass pattern

public class P1 {
	static void main() {
		int n = 10;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= (2 * n - 1) - (2 * i - 2); j++) {
				if (i % 2 != 0) {
					if (j % 2 == 0) {
						System.out.print("  ");
					} else {
						System.out.print("* ");
					}
				} else {
					if (j % 2 != 0) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			if (i == 1) continue;
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				if (i % 2 != 0) {
					if (j % 2 == 0) {
						System.out.print("  ");
					} else {
						System.out.print("* ");
					}
				}
				else {
					if (j % 2 != 0) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}

	}
}
