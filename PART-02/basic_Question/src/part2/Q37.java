package part2;

public class Q37 {
	public static void main(String[] args) {

//		way 1 using stringbuilder

/*
	int n = 0;
		StringBuilder bin = new StringBuilder();

		if (n == 0) {
			System.out.println("0");
			return;
		}
		while (n != 0) {
			bin.append(n % 2);
			n = n / 2;
		}
		System.out.println(bin.reverse());
 */


//		way 2 using Integer

		int n = 10;
		int res = 0;
		int i = 0;
		while (n != 0) {
			int bit = n & 1;
			res = bit * (int) Math.pow(10, i) + res;
			n = n >> 1;
			i++;
		}
		System.out.println(res);
	}
}
/*
Idea:

- Binary representation is made using only 0 and 1
- Extract the last binary bit using:
  n & 1
- Remove last bit using:
  n >> 1
- Store each extracted bit at its correct position using powers of 10
- Continue until n becomes 0


Algorithm:

1. Initialize:
   n = given decimal number
   res = 0
   i = 0

2. Run loop while n != 0

3. Find last bit:
   bit = n & 1

4. Store bit at correct position:
   res = bit * 10^i + res

5. Remove last bit:
   n = n >> 1

6. Increment i

7. Print res


TC : O(log n)

SC : O(1)


| Iteration | n  | Binary of n | bit = n & 1 | res Calculation           | res  | n >> 1 | i |
| ----------|----|-------------|-------------|---------------------------|------|--------|---|
| 1         | 10 | 1010        | 0           | 0 * 10^0 + 0             | 0    | 5      | 1 |
| 2         | 5  | 0101        | 1           | 1 * 10^1 + 0             | 10   | 2      | 2 |
| 3         | 2  | 0010        | 0           | 0 * 10^2 + 10            | 10   | 1      | 3 |
| 4         | 1  | 0001        | 1           | 1 * 10^3 + 10            | 1010 | 0      | 4 |

Final Output = 1010

*/