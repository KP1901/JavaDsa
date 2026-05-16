package part2;

public class Q42 {
	public static void main(String[] args) {
		int n = 121;
		int temp = n;
		int temp1 = n;
		int place = 1;
		boolean isPalindrome = true;

		// find place value
		while (temp > 9) {
			place = place * 10;
			temp = temp / 10;
		}

		while (temp1 > 9) {
			int right = temp1 % 10;
			int left = temp1 / place;

			if (left != right) {
				isPalindrome = false;
				break;
			}

			// remove first and last digit
			temp1 = temp1 - (left * place);
			temp1 = temp1 / 10;

			// update place (2 digits removed)
			place = place / 100;
		}

		if (isPalindrome) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}