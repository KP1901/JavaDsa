package pattern_09;

public class p2 {
	static void main(String[] args) {

		int n = 5;
		int a = 1;
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(a + " ");
				a++;
			}
			System.out.println();
		}
	}
}
