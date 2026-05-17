package part1;

public class Q4 {
	public static void main(String[] args) {
		int num = 5;
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
/*
time complexity

| Complexity | How good it is    |
| ---------- | ----------------- |
| O(1)       | ⭐ Best (constant) |
| O(log n)   | Very fast         |
| O(n)       | Good              |
| O(n log n) | Acceptable        |
| O(n²)      | Slow              |
| O(2ⁿ)      | Very slow         |
-------------------------------------------------------------------------------------------------

FACTORIAL DRY RUN
-----------------

int num = 5;
int fact = 1;

Initial:
num = 5
fact = 1


FOR LOOP
--------
for(int i = 1; i <= num; i++)


ITERATION 1
-----------

i = 1

fact = fact * i
     = 1 * 1
     = 1

After Iteration 1:
fact = 1


ITERATION 2
-----------

i = 2

fact = fact * i
     = 1 * 2
     = 2

After Iteration 2:
fact = 2


ITERATION 3
-----------

i = 3

fact = fact * i
     = 2 * 3
     = 6

After Iteration 3:
fact = 6


ITERATION 4
-----------

i = 4

fact = fact * i
     = 6 * 4
     = 24

After Iteration 4:
fact = 24


ITERATION 5
-----------

i = 5

fact = fact * i
     = 24 * 5
     = 120

After Iteration 5:
fact = 120


LOOP ENDS
---------
i = 6
6 <= 5 -> FALSE


OUTPUT
------

120


TIME COMPLEXITY
---------------
O(n)

SPACE COMPLEXITY
----------------
O(1)
 */