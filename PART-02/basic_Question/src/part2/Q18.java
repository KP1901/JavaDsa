package part2;

public class Q18 {
	public static void main(String[] args) {

		int num = 1256;
		int maxNum = num % 10;

		while (num != 0) {
			int rem = num % 10;
			if (rem > maxNum) {
				maxNum = rem;
			}
			num = num / 10;
		}
		System.out.println(maxNum);
	}
}

/*

Idea:
- extract every digit from number
- compare digits one by one to max
- keep track of largest digit found
- after checking all digits,
  remaining largest digit is answer

 Algorithm:

1. Take last digit as initial maximum digit
2. Extract digits one by one from number
3. Compare current digit with maximum digit
4. If current digit is greater,
   update maximum digit
5. Remove last digit from number
6. Repeat until number becomes 0
7. Print maximum digit

Complexity

TC :
O(number of digits)

SC :
O(1)
 */