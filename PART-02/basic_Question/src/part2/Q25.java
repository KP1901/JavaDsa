package part2;

public class Q25 {
	public static void main(String[] args) {
		int n = 1234;
		int temp1 = n;
		int temp = n;
		int place = 1;
		int count = 0;

		while (n != 0) {
			count++;
			n = n / 10;
		}

		while (temp != 0) {
			place = place * 10;
			temp = temp / 10;
		}

		int res = temp % place;
		System.out.println(place);
	}
}
