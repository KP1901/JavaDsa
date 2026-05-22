package bitOperator_06;

public class Q5 {
	public static void main(String[] args) {

		int n = 10;
		int i = 0;
		int mask = 1 << i;
		int res = n ^ mask;
		System.out.println(res);

	}
}
/*

Idea :

- Create a mask having 1 at ith position

- Use XOR (^) operation

- Because:

  0 ^ 1 = 1
  1 ^ 1 = 0

- So XOR with 1 toggles the bit

- Remaining bits stay unchanged

Algorithm :

1. Take number n

2. Take bit position i

3. Create mask:

   mask = 1 << i

4. Perform:

   res = n ^ mask

5. Print result
---------------------------------------------------------------------------------------------------

Initial values:
n = 10
i = 0

10 = 1010

| Step | Operation       | Calculation               | Binary | Result |
| ---- | --------------- | ------------------------- | ------ | ------ |
| 1    | Initialize `n`  | `n = 10`                  | `1010` | 10     |
| 2    | Initialize `i`  | `i = 0`                   | -      | 0      |
| 3    | Left Shift      | `1 << 0`                  | `0001` | 1      |
| 4    | Store in `mask` | `mask = 1`                | `0001` | 1      |
| 5    | XOR Operation   | `1010 ^ 0001`             | `1011` | 11     |
| 6    | Store in `res`  | `res = 11`                | `1011` | 11     |
| 7    | Print Output    | `System.out.println(res)` | -      | 11     |

 */