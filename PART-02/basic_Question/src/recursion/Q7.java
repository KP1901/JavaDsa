package recursion;

// 7 — Fibonacci

public class Q7 {

	public static int fibonacci(int n) {

		if (n == 0) return 0;

		if (n == 1) return 1;

		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {

		System.out.println(fibonacci(8));
	}
}

/*

Dry Run

Call 1:
fibonacci(4)

Return:
fibonacci(3) + fibonacci(2) -> wait


Call 2:
fibonacci(3)

Return:
fibonacci(2) + fibonacci(1) -> wait


Call 3:
fibonacci(2)

Return:
fibonacci(1) + fibonacci(0) -> wait


Call 4:
fibonacci(1)

Return:
1


Call 5:
fibonacci(0)

Return:
0


Backward:

1 + 0 = 1

fibonacci(2) = 1


Call 6:
fibonacci(1)

Return:
1


Backward:

1 + 1 = 2

fibonacci(3) = 2


Call 7:
fibonacci(2)

Return:
fibonacci(1) + fibonacci(0) -> wait


Call 8:
fibonacci(1)

Return:
1


Call 9:
fibonacci(0)

Return:
0


Backward:

1 + 0 = 1

fibonacci(2) = 1


Final Backward:

2 + 1 = 3

fibonacci(4) = 3
 */