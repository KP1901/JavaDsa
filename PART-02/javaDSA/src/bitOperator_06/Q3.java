package bitOperator_06;

public class Q3 {
	public static void main(String[] args) {
		int n = 13;
		int i = 2;

		int masking = 1 << i;
		int res = n | masking;
		System.out.println(res);


	}
}
/*

Idea :

- Create a mask having 1 at ith position
- Use OR (|) operation

- Because:

  0 | 1 = 1
  1 | 1 = 1

- So OR with 1 always makes the bit become 1

Algorithm :

Algorithm :

1. Take number n

2. Take bit position i

3. Create mask:

   mask = 1 << i

4. Perform:

   res = n | mask

5. Print result

----------------------------------------------------------------------------------------------------

dry run :

n = 13
i = 2

13 = 1101

| Step | Operation          | Calculation               | Binary                | Result |
| ---- | ------------------ | ------------------------- | --------------------- | ------ |
| 1    | Initialize `n`     | `n = 13`                  | `1101`                | 13     |
| 2    | Initialize `i`     | `i = 2`                   | -                     | 2      |
| 3    | Left Shift         | `1 << 2`                  | `0001 << 2 = 0100`    | 4      |
| 4    | Store in `masking` | `masking = 4`             | `0100`                | 4      |
| 5    | OR Operation       | `13 | 4`                 | `1101 | 0100 = 1101` | 13     |
| 6    | Store in `res`     | `res = 13`                | `1101`                | 13     |
| 7    | Print Output       | `System.out.println(res)` | -                     | 13     |

 */