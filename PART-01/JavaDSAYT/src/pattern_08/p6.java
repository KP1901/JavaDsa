package pattern_08;

public class p6 {

	/*

	 *
	 * *
	 * * *
	 * * * *
	 * * * * *

 inverted pyramid pattern
	 * */
	static void main(String[] args) {
		int n = 5;
		for (int row = 1; row <= n; row++) {
//			space
			for (int col = 1; col <= row - 1; col++) {
				System.out.print("  ");
			}
//			star
			for (int col = 1; col <= 2 * n - 2 * row + 1; col++) {
				System.out.print("* ");

			}
			System.out.println();
		}

	}


}
