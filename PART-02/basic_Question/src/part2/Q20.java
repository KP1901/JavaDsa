package part2;

public class Q20 {
	public static void main(String[] args) {

		int num = 2687;
		int countEvenDigit = 0;

		while (num != 0) {
			int rem = num % 10;
			if (rem % 2 == 0) {
				countEvenDigit++;
			}
			num = num / 10;
		}
		System.out.println(countEvenDigit);
	}
}
/*

Idea:
- take a number
- extract each digit
- check whether digit is divisible by 2
- if yes, increase count
- otherwise ignore it
- after checking all digits,
  print total even digits

 Algorithm:

Algorithm:
1. Initialize count as 0
2. Extract digits one by one
3. Check divisibility by 2
4. Increase count if even
5. Remove last digit
6. Repeat until number becomes 0
7. Print count

Complexity

TC :
O(log_10 n)

SC :
O(1)
---------------------------------------------------------------------------------------

num = 2687
countEvenDigit = 0

| Iteration | Condition (num != 0) | num  | rem = num % 10 | rem % 2 == 0 | countEvenDigit | num = num / 10 |
| --------- | -------------------- | ---- | -------------- | ------------ | -------------- | -------------- |
| 1         | 2687 != 0 → True     | 2687 | 7              | No           | 0              | 268            |
| 2         | 268 != 0 → True      | 268  | 8              | Yes          | 1              | 26             |
| 3         | 26 != 0 → True       | 26   | 6              | Yes          | 2              | 2              |
| 4         | 2 != 0 → True        | 2    | 2              | Yes          | 3              | 0              |
| 5         | 0 != 0 → False       | -    | -              | -            | -              | -              |

 */