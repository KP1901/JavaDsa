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
 */