package part2;

public class Q30 {
	public static void main(String[] args) {
		int n = 21;
		int original = n;
		int sum = 0;

		while (n != 0) {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		if (sum != 0 && original % sum == 0) {
			System.out.println("Harshad number");
		} else {
			System.out.println("Not Harshad number");
		}
	}
}
