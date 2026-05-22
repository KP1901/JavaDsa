package part2;

public class Q36 {
	public static void main(String[] args) {

//		way 1 best approach

//		int a = 10101;
//		int b = 1;
//		int sum = 0;
//
//		while (a != 0) {
//			int rem = a % 10;
//			sum = rem * b + sum;
//			b = b * 2;
//			a = a / 10;
//		}
//
//		System.out.println(sum);

//		way 2 - not good

		int n = 10101;
		int a = 1;
		int i = 0;
		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			if (rem == 1) {
//				sum = sum + a;
				sum = sum + (int) Math.pow(2, i);
			}
//			a = a * 2;
			i++;
			n = n / 10;
		}
		System.out.println(sum);
	}
}
