package recursion;

// 1 — Print Increasing Numbers
public class Q1 {

	public static void increase(int n) {

		if (n == 11) {
			return;
		}

		System.out.println(n);

		increase(n + 1);
	}

	public static void main(String[] args) {

		increase(1);
	}
}
/*

Dry Run

Call 1:
increase(1)

Print:
1

Return:
increase(2) -> wait


Call 2:
increase(2)

Print:
2

Return:
increase(3) -> wait


Call 3:
increase(3)

Print:
3

Return:
increase(4) -> wait


Call 4:
increase(4)

Print:
4

Return:
increase(5) -> wait


Call 5:
increase(5)

Print:
5

Return:
increase(6) -> wait


Call 6:
increase(6)

Print:
6

Return:
increase(7) -> wait


Call 7:
increase(7)

Print:
7

Return:
increase(8) -> wait


Call 8:
increase(8)

Print:
8

Return:
increase(9) -> wait


Call 9:
increase(9)

Print:
9

Return:
increase(10) -> wait


Call 10:
increase(10)

Print:
10

Return:
increase(11) -> wait


Call 11:
increase(11)

Return:
stop
 */