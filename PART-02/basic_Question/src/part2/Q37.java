package part2;

public class Q37 {
	public static void main(String[] args) {
		int n = 12;
		StringBuilder bin = new StringBuilder();

		if (n == 0) {
			System.out.println("0");
			return;
		}
		while (n > 0) {
			bin.append(n % 2);
			n = n / 2;
		}
		System.out.println(bin.reverse());
	}
}
