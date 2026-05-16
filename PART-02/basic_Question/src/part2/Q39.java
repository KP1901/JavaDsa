package part2;

public class Q39 {
	public static void main(String[] args) {

		int n = 31;
		int sum = 0;
		int b = 1;
		while (n != 0) {
			if (n % 10 > 7) {
				System.out.println("invalid octal number");
				return;
			}
			sum = sum + n % 10 * b;
			b = b * 8;
			n = n / 10;
		}
		System.out.println(sum);
	}
}
