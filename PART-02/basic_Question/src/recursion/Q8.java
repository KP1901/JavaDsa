package recursion;

// 8 — Power Function
public class Q8 {
	public static int power(int base, int pow) {

		if (pow == 0) {
			return 1;
		}

		return base * power(base, pow - 1);
	}

	public static void main(String[] args) {

		System.out.println(power(2, 5));
	}
}
/*

Dry Run

Call 1:
power(2, 3)

Return:
2 * power(2, 2) -> wait


Call 2:
power(2, 2)

Return:
2 * power(2, 1) -> wait


Call 3:
power(2, 1)

Return:
2 * power(2, 0) -> wait


Call 4:
power(2, 0)

Return:
1


Backward:

2 * 1 = 2
2 * 2 = 4
2 * 4 = 8
 */