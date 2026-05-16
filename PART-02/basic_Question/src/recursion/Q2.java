package recursion;

// 2 — Print Decrease Numbers
public class Q2 {

	public static void decrease(int n) {

		if (n == 0) {
			return;
		}

		System.out.println(n);

		decrease(n - 1);
	}

	public static void main(String[] args) {

		decrease(10);
	}
}
/*

Dry Run

Call 1:
decrease(10)

Print:
10

Return:
decrease(9) -> wait


Call 2:
decrease(9)

Print:
9

Return:
decrease(8) -> wait


Call 3:
decrease(8)

Print:
8

Return:
decrease(7) -> wait


Call 4:
decrease(7)

Print:
7

Return:
decrease(6) -> wait


Call 5:
decrease(6)

Print:
6

Return:
decrease(5) -> wait


Call 6:
decrease(5)

Print:
5

Return:
decrease(4) -> wait


Call 7:
decrease(4)

Print:
4

Return:
decrease(3) -> wait


Call 8:
decrease(3)

Print:
3

Return:
decrease(2) -> wait


Call 9:
decrease(2)

Print:
2

Return:
decrease(1) -> wait


Call 10:
decrease(1)

Print:
1

Return:
decrease(0) -> wait


Call 11:
decrease(0)

Return:
stop
 */