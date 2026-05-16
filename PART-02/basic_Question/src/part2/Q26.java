package part2;

public class Q26 {
	public static void main(String[] args) {
		int original = 989;
		int n = original;
//		int place = 1;
//		int count = 0;
//
//		while (n != 0) {
//			count++;
//			n = n / 10;
//		}
//
//		while (1 < count) {
//			place = place * 10;
//			count--;
//		}
//		int res = original / place;
//		System.out.println(res);

		while (original > 9) {
			original = original / 10;
		}
		System.out.println(original);
	}
}

/*

-brute force approach => find total digit then find place which will extract first digit
-opmtial approach => reduce the number till 1nth place

*/