package pattern_08;

public class p3 {
	static void main(String[] args) {
		/*
		 * * * * *
		 * * * * *
		 * * * * *
		 * * * * *
		 * * * * *
		 rombus pattern
		 * */

		int n = 5;

		for (int row = 1; row <= n; row++) {
//			spaces
			for (int col = 1; col <= n - row; col++) {
				System.out.print("  ");
			}
//			star
			for (int col = 1; col <= n; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}


	}
}
