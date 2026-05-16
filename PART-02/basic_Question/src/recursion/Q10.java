package recursion;
public class Q10 {
	public static int sumOfDigits(int sum, int n) {
		if (n == 0) return n;
		return n % 10 + sumOfDigits(0, n / 10);
	}
	public static void main(String[] args) {
		System.out.println(sumOfDigits(0, 12));
	}
}
/*
Dry Run

Call 1:
sumOfDigits(12)

Return:
2 + sumOfDigits(1)  -> wait

Call 2:
sumOfDigits(1)

Return:
1 + sumOfDigits(0) -> wait

Call 3:
sumOfDigits(0)

Return:
0

Backward:
1 + 0 = 1
2 + 1 = 3
 */