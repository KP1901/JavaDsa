package part2;

public class Q19 {
	public static void main(String[] args) {

		int num = 5687;
		int minDigit = num % 10;

		while (num != 0) {
			int rem = num % 10;
			if (rem < minDigit) {
				minDigit = rem;
			}
			num = num / 10;
		}
		System.out.println(minDigit);
	}
}
