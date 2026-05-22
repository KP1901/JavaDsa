package pattern_09;

// fibonacci pattern

public class p7 {
	public static void main(String[] args) {

		int n = 5;

		int a = 0;
		int b = 1;

		System.out.println("* ");

		for (int i = 1; i <= n; i++) {

			int c = a + b;

			for (int j = 1; j <= c; j++) {
				System.out.print("* ");

			}
			a = b;
			b = c;

			System.out.println();


		}
	}
}