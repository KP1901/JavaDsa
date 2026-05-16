package recursion;
// 9 — count digits
public class Q9 {
	public static int countFn(int count, int n) {
		if (n == 0) {
			return 1;
		}
		return count + countFn(1, n / 10);
	}
	public static void main(String[] args) {
		System.out.println(countFn(0, 124));
	}
}

/*
Dry Run

Call 1:
countDigits(123)

Return:
1 + countDigits(12) -> wait

Call 2:
countDigits(12)

Return:
1 + countDigits(1) -> wait

Call 3:
countDigits(1)

Return:
1 + countDigits(0) -> wait

Call 4:
countDigits(0)

Return:
0

Backward:

1 + 0 = 1
1 + 1 = 2
1 + 2 = 3


Forward:
countFn(0,124)
    countFn(1,12)
        countFn(1,1)
            countFn(1,0) → 1

Backward:
            1 + 1 = 2
        1 + 2 = 3
    0 + 3 = 3
 */
