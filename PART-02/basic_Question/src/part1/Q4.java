package part1;

public class Q4 {
	public static void main(String[] args) {
		int num = 5;
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
/*
time complexity

| Complexity | How good it is    |
| ---------- | ----------------- |
| O(1)       | ⭐ Best (constant) |
| O(log n)   | Very fast         |
| O(n)       | Good              |
| O(n log n) | Acceptable        |
| O(n²)      | Slow              |
| O(2ⁿ)      | Very slow         |
-------------------------------------------------------------------------------------------------

FACTORIAL DRY RUN
-----------------

int num = 5;
int fact = 1;

Initial:
num = 5
fact = 1

| Iteration | i | Condition `i <= num` | fact = fact * i | fact |
| --------- | - | -------------------- | --------------- | ---- |
| 1         | 1 | `1 <= 5` ✔           | `1 * 1`         | 1    |
| 2         | 2 | `2 <= 5` ✔           | `1 * 2`         | 2    |
| 3         | 3 | `3 <= 5` ✔           | `2 * 3`         | 6    |
| 4         | 4 | `4 <= 5` ✔           | `6 * 4`         | 24   |
| 5         | 5 | `5 <= 5` ✔           | `24 * 5`        | 120  |
| 6         | 6 | `6 <= 5` ✘           | loop stops      | —    |


OUTPUT
------

120


TIME COMPLEXITY
---------------
O(n)

SPACE COMPLEXITY
----------------
O(1)
 */