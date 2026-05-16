package part2;

public class Q18 {
	public static void main(String[] args) {

		int num = 5687;
		int maxNum = num % 10;

		while (num != 0) {
			int rem = num % 10;
			if (rem > maxNum) {
				maxNum = rem;
			}
			num = num / 10;
		}
		System.out.println(maxNum);
	}
}
