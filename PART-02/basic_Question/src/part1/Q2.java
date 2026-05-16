package part1;

public class Q2 {

	public static void main(String[] args) {


		int n = 12;
		boolean isPrime = true;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("this is prime");
		} else {
			System.out.println("this is not prime");
		}
	}
}

/*
 1) Divisor / Factor
------------

A divisor is a number that divides another number completely.

Example:
n = 6

6 / 2 = 3   → 2 is a divisor
6 / 3 = 2   → 3 is a divisor
6 / 4 = 1.5 → 4 is NOT a divisor

How to find divisor

n = 12; -> underroot 12 is 2^3 = so run tills 3.46 ~ 3

// way 1

1 -> 12 / 1 = 12 -> (1,12)
2 -> 12 / 2 = 6 -> (2,6)
3 -> 12 / 3 = 4 -> (3,4)

// way 2


2) Factor
-----------

Factors are numbers that multiply together to form n.

Example:
n = 6

1 × 6
2 × 3

how to find factor :

// way 1

1 -> 12 / 1 = 12 -> (1,12)
2 -> 12 / 2 = 6 -> (2,6)
3 -> 12 / 3 = 4 -> (3,4)

Divisor → usually spoken as a single number dividing another number
Factor → often spoken as multiplication pairs

3) Factor Pair Observation
----------------------------

Example:
n = 36

Factor Pairs:

1 × 36
2 × 18
3 × 12
4 × 9
6 × 6
9 × 4
12 × 3
18 × 2
36 × 1


√36 = 6


Important Observation:
------------------------

After √n, factor pairs start repeating in reverse order.

Example:

2 × 18
18 × 2

3 × 12
12 × 3

So if we already checked before √n,
we automatically know the pair after √n.


4) Complexity
----------------

Brute Force:
Check from 1 to n-1

Time Complexity:
O(n)


Optimal:
Check from 1 to √n

Time Complexity:
O(√n)


5) Final Conclusion
---------------------

“To check if a number has any divisor other than 1 and itself,
we only need to check up to √n.”

Pattern:

Factor Pair Observation Pattern
----------------------------------------------------------------------------------

Initial:

n = 7
isPrime = true


Loop:
for (int i = 2; i <= Math.sqrt(n); i++)

√7 = 2.64


-----------------------------------

Iteration 1:

i = 2

Condition:
2 <= 2.64 → true

Check:
7 % 2 == 0

Result:
1 == 0 → false

So:
isPrime remains true


-----------------------------------

Next Iteration:

i = 3

Condition:
3 <= 2.64 → false

Loop stops


-----------------------------------

Final:

isPrime = true

Output:
this is prime
 */
