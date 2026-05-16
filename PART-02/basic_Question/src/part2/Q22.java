package part2;

public class Q22 {
	public static void main(String[] args) {

		int num = 2687;
		int sumOfEvenDigit = 0;

		while (num != 0) {
			int rem = num % 10;
			if (rem % 2 == 0) {
				sumOfEvenDigit += rem;
			}
			num = num / 10;
		}
		System.out.println(sumOfEvenDigit);
	}
}
