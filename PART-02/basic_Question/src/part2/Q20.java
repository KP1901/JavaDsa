package part2;

public class Q20 {
	public static void main(String[] args) {

		int num = 2687;
		int countEvenDigit = 0;

		while (num != 0) {
			int rem = num % 10;
			if (rem % 2 == 0) {
				countEvenDigit++;
			}
			num = num / 10;
		}
		System.out.println(countEvenDigit);
	}
}
