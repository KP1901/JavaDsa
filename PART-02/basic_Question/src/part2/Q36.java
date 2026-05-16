package part2;

public class Q36 {
	public static void main(String[] args) {
		int a = 111;
		int b = 1;
		int sum = 0;

		while (a != 0) {
			int rem = a % 10;
			sum = sum + rem * b;
			b = b * 2;
			a = a / 10;
		}

		System.out.println(sum);
	}
}
