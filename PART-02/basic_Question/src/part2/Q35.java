package part2;

public class Q35 {
	public static void main(String[] args) {

		int n = 89;
		int temp = n;

		// Step 1: count digits
		int count = 0;
		while (temp != 0) {
			count++;
			temp /= 10;
		}

		temp = n;
		int sum = 0;

		// Step 2: process digits from right to left
		while (temp != 0) {
			int rem = temp % 10;

			// power calculation
//			int power = 1;
//			for (int i = 0; i < count; i++) {
//				power *= rem;
//			}
			int power =(int) Math.pow(rem, count);

			sum += power;
			count--;          // decrease position
			temp /= 10;
		}

		if (sum == n) {
			System.out.println("Disarium number");
		} else {
			System.out.println("Not Disarium number");
		}
	}
}