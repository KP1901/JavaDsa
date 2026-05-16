package pattern_09;

public class p3 {
	static void main(String[] args) {

		int n = 5;


		for (int row = 1; row <= n; row++) {
			char ch = 'E';

			for (int col = 1; col <= row; col++) {
				System.out.print((col + ch - 1) + "  ");

			}

			System.out.println();
		}
	}
}
