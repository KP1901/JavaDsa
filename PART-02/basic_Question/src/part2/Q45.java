package part2;

public class Q45 {
	public static void main(String[] args) {
		int n = 36;
		int sum = 0;

		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				System.out.println(i);
				sum = sum + i;

				if (i != n / i) {
					System.out.println(n / i);
					sum = sum + n / i;

				}
			}
		}
		System.out.println(sum);
	}
}