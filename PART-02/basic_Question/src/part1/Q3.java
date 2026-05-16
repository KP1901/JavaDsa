package part1;

public class Q3 {
	public static void main(String[] args) {
		int num = 121;
		int temp = num;
		int revSum = 0;

		while (num != 0) {
			int rem = num % 10;
			revSum = revSum * 10 + rem;
			num = num / 10;
		}
		if (temp == revSum) {
			System.out.println("its a palindrome");
		} else {
			System.out.println("its not a palindrome");
		}
	}

}
