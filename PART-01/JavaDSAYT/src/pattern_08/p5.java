package pattern_08;

public class p5 {

	/*

	 *
	 * *
	 * * *
	 * * * *
	 * * * * *

 solid pyramid pattern

	 * */
	static void main(String[] args) {
		int n = 5;
		for (int row = 1; row <= n; row++) {
//			space
			for (int col = 1; col <= n - row; col++) {
				System.out.print("  ");
			}
//			star
			for (int col = 1; col <= 2 * row - 1; col++) {
				System.out.print("* ");

			}
			System.out.println();
		}

	}


}
