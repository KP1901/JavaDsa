package pattern_09;

public class p6 {
	static void main(String[] args) {
		int n = 4;
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n - row; col++) {
				System.out.print("   ");
			}
			for (int col = 1; col <= row; col++) {
				int a = col;
				int b = 'A' - 1;
				int ans = a + b;
				char finalAns = (char) ans;
				System.out.print(finalAns + " ");
			}

			System.out.println();
		}

	}
}