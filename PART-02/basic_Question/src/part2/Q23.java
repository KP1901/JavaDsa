package part2;

public class Q23 {
	public static void main(String[] args) {

		int num = 1687;
		int sumOfOddDigit = 0;

		while (num != 0) {
			int rem = num % 10;
			if (rem % 2 != 0) {
				sumOfOddDigit += rem;
			}
			num = num / 10;
		}
		System.out.println(sumOfOddDigit);
	}
}
