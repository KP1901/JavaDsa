package part2;

public class Q21 {
	public static void main(String[] args) {

		int num = 2687;
		int countOddDigit = 0;

		while (num != 0) {
			int rem = num % 10;
			if (rem % 2 != 0) {
				countOddDigit++;
			}
			num = num / 10;
		}
		System.out.println(countOddDigit);
	}
}
