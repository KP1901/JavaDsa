package part2;

public class Q2 {
	public static void main(String[] args) {
		int n = 100;
		for (int i = 2; i <= n; i++) {
			boolean isPrime = true;
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(i + " ");
			}
		}

	}
}
/*
Extra Insight :

| Condition           | Iterations | What happens internally   | Faster?  |
| ------------------- | ---------- | ------------------------- | -------- |
| `j <= Math.sqrt(i)` | Same       | Calls `sqrt()` every loop | ❌ Slower |
| `j * j <= i`        | Same       | Only multiplication       | ✅ Faster |

Example for i = 97

| j   | `j <= sqrt(97)` | `j*j <= 97`   |
| --- | --------------- | ------------- |
| 2   | `2 <= 9.84` ✔   | `4 <= 97` ✔   |
| 3   | `3 <= 9.84` ✔   | `9 <= 97` ✔   |
| 4   | `4 <= 9.84` ✔   | `16 <= 97` ✔  |
| ... | ...             | ...           |
| 9   | `9 <= 9.84` ✔   | `81 <= 97` ✔  |
| 10  | `10 <= 9.84` ✘  | `100 <= 97` ✘ |

Main point:
j <= Math.sqrt(i)

and

j * j <= i
do SAME work logically ✅

But:
Math.sqrt(i)
is more expensive than:

j * j

So programmers prefer:
for(int j = 2; j * j <= i; j++)
--------------------------------------------------------------------------------------------------------------------

dry run :

| i | j check               | Condition      | Divisible? | isPrime | Output  |
| - | --------------------- | -------------- | ---------- | ------- | ------- |
| 2 | `2*2 <= 2` → `4<=2` ✘ | loop not run   | —          | true    | 2       |
| 3 | `2*2 <= 3` → `4<=3` ✘ | loop not run   | —          | true    | 2 3     |
| 4 | `2*2 <= 4` ✔          | `4 % 2 == 0` ✔ | Yes        | false   | 2 3     |
| 5 | `2*2 <= 5` ✔          | `5 % 2 != 0`   | No         | true    | 2 3 5   |
| 6 | `2*2 <= 6` ✔          | `6 % 2 == 0` ✔ | Yes        | false   | 2 3 5   |
| 7 | `2*2 <= 7` ✔          | `7 % 2 != 0`   | No         | true    | 2 3 5 7 |

 */