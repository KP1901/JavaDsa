package part2;

public class Q22 {
	public static void main(String[] args) {

		int num = 2687;
		int sumOfEvenDigit = 0;

		while (num != 0) {
			int rem = num % 10;
			if (rem % 2 == 0) {
				sumOfEvenDigit += rem;
			}
			num = num / 10;
		}
		System.out.println(sumOfEvenDigit);
	}
}

/*

Idea:
- take a number
- extract each digit
- check whether digit is divisible by 2
- if yes, add to sum
- otherwise ignore it
- after checking all digits,
  print total sum of digits


Algorithm:
1. Initialize sumOfEvenDigit as 0
2. Extract digits one by one
3. Check divisibility by 2
4. If digit is even, add digit to sumOfEvenDigit
5. Remove last digit
6. Repeat until number becomes 0
7. Print sumOfEvenDigit

Complexity

TC :
O(log_10 n)

SC :
O(1)
--------------------------------------------------------------------------------------------

num = 2687
sumOfEvenDigit = 0

| Iteration | Condition (num != 0) | num  | rem = num % 10 | rem % 2 == 0 | sumOfEvenDigit | num = num / 10 |
| --------- | -------------------- | ---- | -------------- | ------------ | -------------- | -------------- |
| 1         | 2687 != 0 → True     | 2687 | 7              | No           | 0              | 268            |
| 2         | 268 != 0 → True      | 268  | 8              | Yes          | 0 + 8 = 8      | 26             |
| 3         | 26 != 0 → True       | 26   | 6              | Yes          | 8 + 6 = 14     | 2              |
| 4         | 2 != 0 → True        | 2    | 2              | Yes          | 14 + 2 = 16    | 0              |
| 5         | 0 != 0 → False       | -    | -              | -            | -              | -              |

 */