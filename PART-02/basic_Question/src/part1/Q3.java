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


WHILE(num != 0)
----------------

ITERATION 1
-----------

rem = num % 10
    = 121 % 10
    = 1

revSum = revSum * 10 + rem
       = 0 * 10 + 1
       = 1

num = num / 10
    = 121 / 10
    = 12

After Iteration 1:
num = 12
revSum = 1


ITERATION 2
-----------

rem = 12 % 10
    = 2

revSum = 1 * 10 + 2
       = 12

num = 12 / 10
    = 1

After Iteration 2:
num = 1
revSum = 12


ITERATION 3
-----------

rem = 1 % 10
    = 1

revSum = 12 * 10 + 1
       = 121

num = 1 / 10
    = 0

After Iteration 3:
num = 0
revSum = 121


LOOP ENDS
---------
num == 0


IF CONDITION
------------

if(temp == revSum)

121 == 121  -> TRUE


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