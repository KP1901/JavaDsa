package part2;

public class Q7 {
	public static void main(String[] args) {
		int num = 123;
		int sum = 0;
		while (num != 0) {
			int rem = num % 10;
			sum += rem;
			num = num / 10;
		}
		System.out.println(sum);
	}
}
/*

num = 123
sum = 0

| Iteration | Condition `num != 0` | rem = num % 10 | sum += rem | sum | num = num / 10 |
| --------- | -------------------- | -------------- | ---------- | --- | -------------- |
| 1         | `123 != 0` ✔         | 3              | 0 + 3      | 3   | 12             |
| 2         | `12 != 0` ✔          | 2              | 3 + 2      | 5   | 1              |
| 3         | `1 != 0` ✔           | 1              | 5 + 1      | 6   | 0              |
| 4         | `0 != 0` ✘           | loop stops     | —          | —   | —              |

 */