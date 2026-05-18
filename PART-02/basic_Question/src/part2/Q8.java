package part2;

public class Q8 {
	public static void main(String[] args) {
		int num = 1234;
		int finalRes = 1;
		while (num != 0) {
			int rem = num % 10;
			finalRes *= rem;
			num = num / 10;
		}
		System.out.println(finalRes);
	}
}

/*

| Iteration | Condition `num != 0`  | rem = num % 10 | finalRes *= rem | finalRes  | num = num / 10 |
| --------- | --------------------  | -------------- | ----------      | ---       | -------------- |
| 1         | `1234 != 0` ✔         | 4              | 1 * 4           | 4         | 123             |
| 2         | `123 != 0` ✔          | 3              | 4 * 3           | 12         | 12              |
| 3         | `12 != 0` ✔           | 2              | 12 * 2           | 24         | 1              |
| 4         | `1 != 0` ✔            | 1              | 24 * 1           | 24         | 0              |
| 5         | `0 != 0` ✘            | loop stops     | —               | —         | —              |


*/