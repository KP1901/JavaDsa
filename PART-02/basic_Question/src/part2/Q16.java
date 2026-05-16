package part2;

public class Q16 {
	public static void main(String[] args) {

		int base = 2;
		int power = 5;
		int res = 1;

		while (power != 0) {
			if (power % 2 != 0) {
				res *= base;
			}
			base = base * base;
			power = power / 2;
		}

		System.out.println(res);
	}
}
