package bitOperator_06;

public class Q2 {
	public static void main(String[] args) {
		int n = 13;
		int i = 2;
		int mask = 1 << i;
		int position = n & mask;
		if (position == 0) {
			System.out.println("not set");
		} else {
			System.out.println("set");
		}

	}
}
/*

idea :

Idea :

- Create a mask having 1 at ith position
- Use AND (&) operation to check that position

- If ith bit in original number is 1:

  1 & 1 = 1

  → SET

- If ith bit in original number is 0:

  0 & 1 = 0

  → NOT SET


Algorithm :

1. Take number n

2. Take bit position i

3. Create mask:

   mask = 1 << i

4. Perform:

   res = n & mask

5. Check:

   - If res == 0
       print "NOT SET"

   - Else
       print "SET"
 */