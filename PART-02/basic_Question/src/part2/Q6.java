package part2;

public class Q6 {
	public static void main(String[] args) {
		int num = 12;
		int count = 0;

		if (num == 0) {
			System.out.println(1);
			return;
		}
		while (num != 0) {
			count++;
			num = num / 10;
		}
		System.out.println(count);
	}
}
/*

Dry Run
int num = 12345;
int count = 0;

| Iteration | Condition `num != 0` | count++    | count | num = num / 10 |
| --------- | -------------------- | ---------- | ----- | -------------- |
| 1         | `12345 != 0` ✔       | ✔          | 1     | 1234           |
| 2         | `1234 != 0` ✔        | ✔          | 2     | 123            |
| 3         | `123 != 0` ✔         | ✔          | 3     | 12             |
| 4         | `12 != 0` ✔          | ✔          | 4     | 1              |
| 5         | `1 != 0` ✔           | ✔          | 5     | 0              |
| 6         | `0 != 0` ✘           | loop stops | —     | —              |


Tc : O(d)
For 12345 -> 5 operations

Sc : O(1)

 */