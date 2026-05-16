package pattern_08;

public class p4 {

	/*

	 * * * * *
	 * * * *
	 * * *
	 * *
	 *

	 * */
	static void main(String[] args) {
		int n = 5;
		for (int row = 1; row <= n; row++) {
//			stars
			for (int col = 1; col <= n - row + 1; col++) {
				System.out.print("* ");
			}

			System.out.println();

		}

	}


}
