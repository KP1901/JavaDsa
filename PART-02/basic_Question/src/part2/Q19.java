package part2;

public class Q19 {
	public static void main(String[] args) {

		int num = 5687;
		int minDigit = num % 10;

		while (num != 0) {
			int rem = num % 10;
			if (rem < minDigit) {
				minDigit = rem;
			}
			num = num / 10;
		}
		System.out.println(minDigit);
	}
}
/*

Idea:
- extract every digit from number
- compare digits one by one to min
- keep track of min digit found
- after checking all digits,
  remaining smallest digit is answer

 Algorithm:

1. Take last digit as initial min digit
2. Extract digits one by one from number
3. Compare current digit with min digit
4. If current digit is greater,
   update min digit
5. Remove last digit from number
6. Repeat until number becomes 0
7. Print min digit

Complexity

TC :
O(number of digits)

SC :
O(1)
 */