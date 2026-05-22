package bitOperator_06;

public class Q4 {
	public static void main(String[] args) {
		int n = 10;
		int i = 0;
		int mask = ~(1 << i);
		int position = n & mask;
		System.out.println(position);

	}
}
/*

Idea :

- Create a mask having 1 at ith position

- Invert the mask using ~

- After inversion:

  target position becomes 0
  remaining positions become 1

- Use AND (&) operation

- Because:

  bit & 0 = 0   → clears bit
  bit & 1 = same bit

- So only ith bit becomes 0
  and all other bits remain unchanged

Algorithm :

1. Take number n

2. Take bit position i

3. Create mask:

   mask = 1 << i

4. Invert mask:

   mask = ~mask

5. Perform:

   res = n & mask

6. Print result
---------------------------------------------------------------------------------------------------------

Initial values:

n = 10
i = 0

Binary form:

10 = 1010

| Step | Operation           | Calculation                    | Binary    | Result |
| ---- | ------------------- | ------------------------------ | --------- | ------ |
| 1    | Initialize `n`      | `n = 10`                       | `1010`    | 10     |
| 2    | Initialize `i`      | `i = 0`                        | -         | 0      |
| 3    | Left Shift          | `1 << 0`                       | `0001`    | 1      |
| 4    | NOT Operation       | `~(0001)`                      | `...1110` | -2     |
| 5    | Store in `mask`     | `mask = -2`                    | `...1110` | -2     |
| 6    | AND Operation       | `1010 & 1110`                  | `1010`    | 10     |
| 7    | Store in `position` | `position = 10`                | `1010`    | 10     |
| 8    | Print Output        | `System.out.println(position)` | -         | 10     |

 */