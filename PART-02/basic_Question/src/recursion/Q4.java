package recursion;

// 4 — Sum of First N Numbers

public class Q4 {
	public static int sum(int n) {

		if (n == 0) {
			return 0;
		}

		return n + sum(n - 1);
	}

	public static void main(String[] args) {

		System.out.println(sum(5));
	}
}
/*

Dry Run

Call 1:
sum(5)

Return:
5 + sum(4) -> wait


Call 2:
sum(4)

Return:
4 + sum(3) -> wait


Call 3:
sum(3)

Return:
3 + sum(2) -> wait


Call 4:
sum(2)

Return:
2 + sum(1) -> wait


Call 5:
sum(1)

Return:
1 + sum(0) -> wait


Call 6:
sum(0)

Return:
0


Backward:

1 + 0 = 1

2 + 1 = 3

3 + 3 = 6

4 + 6 = 10

5 + 10 = 15
 */