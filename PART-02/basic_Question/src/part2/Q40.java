package part2;

public class Q40 {
	public static void main(String[] args) {
		int n = 1011;
		while (n != 0) {
			int rem = n % 1000;
			System.out.println(rem);
			n = n / 1000;
		}
	}
}
