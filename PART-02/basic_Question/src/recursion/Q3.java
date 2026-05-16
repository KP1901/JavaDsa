package recursion;

// 3 — Print 1 to N Using Returning Phase

public class Q3 {
	public static void increase(int n) {

		if (n == 0) {
			return;
		}

		increase(n - 1);

		System.out.println(n);
	}

	public static void main(String[] args) {

		increase(5);
	}
}
/*
Dry Run

Call 1:
increase(5)

Return:
increase(4) -> wait


Call 2:
increase(4)

Return:
increase(3) -> wait


Call 3:
increase(3)

Return:
increase(2) -> wait


Call 4:
increase(2)

Return:
increase(1) -> wait


Call 5:
increase(1)

Return:
increase(0) -> wait


Call 6:
increase(0)

Return:
stop


Backward Printing:

1

2

3

4

5

 */