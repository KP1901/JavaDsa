package part1;

public class Q3 {
	public static void main(String[] args) {
		int num = 121;
		int temp = num;
		int revSum = 0;

		while (num != 0) {
			int rem = num % 10;
			revSum = revSum * 10 + rem;
			num = num / 10;
		}
		if (temp == revSum) {
			System.out.println("its a palindrome");
		} else {
			System.out.println("its not a palindrome");
		}
	}

}
/*
palindrome logic :

n = 123;

give me first 3
give me then 32
give me then 321
-------------------------------------------------------------------------------------------------------------

PALINDROME NUMBER DRY RUN
-------------------------

int num = 121;
int temp = num;
int revSum = 0;

Initial:
num = 121
temp = 121
revSum = 0


| Iteration | Condition `num != 0` | rem = num % 10 | revSum = revSum * 10 + rem | revSum | num = num / 10 |
| --------- | -------------------- | -------------- | -------------------------- | ------ | -------------- |
| 1         | `121 != 0` ✔         | 1              | `0 * 10 + 1`               | 1      | 12             |
| 2         | `12 != 0` ✔          | 2              | `1 * 10 + 2`               | 12     | 1              |
| 3         | `1 != 0` ✔           | 1              | `12 * 10 + 1`              | 121    | 0              |
| 4         | `0 != 0` ✘           | loop stops     | —                          | —      | —              |


OUTPUT
------

its a palindrome


TIME COMPLEXITY
---------------
O(d)
d = number of digits

SPACE COMPLEXITY
----------------
O(1)

 */