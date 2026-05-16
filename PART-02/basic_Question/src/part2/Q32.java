package part2;

public class Q32 {
	public static void main(String[] args) {
		int n = 1124;
		int temp = n;
		int sum = 0;
		int product = 1;

		while (temp != 0) {
			int rem = temp % 10;
			sum = sum + rem;
			product = product * rem;
			temp = temp / 10;
		}
		if (sum == product) {
			System.out.println("spy number");
		} else {
			System.out.println("not spy number");
		}
	}
}
