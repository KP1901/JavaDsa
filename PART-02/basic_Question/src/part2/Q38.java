package part2;

public class Q38 {
	public static void main(String[] args) {
		int n = 25;
		StringBuilder bin = new StringBuilder();

		if (n == 0) {
			System.out.println("0");
			return;
		}
		while (n > 0) {
			bin.append(n % 8);
			n = n / 8;
		}
		System.out.println(bin.reverse());
	}
}
