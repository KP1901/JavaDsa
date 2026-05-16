package recursion;

//5 — Factorial
public class Q5 {

	public static int fact(int n) {

		if (n == 0) {
			return 1;
		}

		return n * fact(n - 1);
	}

	public static void main(String[] args) {

		System.out.println(fact(5));
	}
}
/*

Dry Run

Call 1:
fact(5)

Return:
5 * fact(4) -> wait


Call 2:
fact(4)

Return:
4 * fact(3) -> wait


Call 3:
fact(3)

Return:
3 * fact(2) -> wait


Call 4:
fact(2)

Return:
2 * fact(1) -> wait


Call 5:
fact(1)

Return:
1


Backward:

2 * 1 = 2

3 * 2 = 6

4 * 6 = 24

5 * 24 = 120
 */