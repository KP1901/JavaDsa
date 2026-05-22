package part2;

public class Q23 {
	public static void main(String[] args) {

		int num = 1687;
		int sumOfOddDigit = 0;

		while (num != 0) {
			int rem = num % 10;
			if (rem % 2 != 0) {
				sumOfOddDigit += rem;
			}
			num = num / 10;
		}
		System.out.println(sumOfOddDigit);
	}
}
/*

Idea:
- take a number
- extract each digit
- check whether digit is not divisible by 2
- if yes, add to sum
- otherwise ignore it
- after checking all digits,print total sum of odd digits


Algorithm:
1. Initialize sumOfOddDigit as 0
2. Extract digits one by one
3. Check whether digit is odd
4. If digit is odd, add digit to sumOfOddDigit
5. Remove last digit
6. Repeat until number becomes 0
7. Print sumOfOddDigit

Complexity

TC :
O(log_10 n)

SC :
O(1)
--------------------------------------------------------------------------------------------

num = 2687
sumOfOddDigit = 0

| Iteration | Condition (num != 0) | num  | rem = num % 10 | rem % 2 != 0 | sumOfOddDigit | num = num / 10 |
| --------- | -------------------- | ---- | -------------- | ------------ | ------------- | -------------- |
| 1         | 1687 != 0 → True     | 1687 | 7              | Yes          | 0 + 7 = 7     | 168            |
| 2         | 168 != 0 → True      | 168  | 8              | No           | 7             | 16             |
| 3         | 16 != 0 → True       | 16   | 6              | No           | 7             | 1              |
| 4         | 1 != 0 → True        | 1    | 1              | Yes          | 7 + 1 = 8     | 0              |
| 5         | 0 != 0 → False       | -    | -              | -            | -             | -              |


 */