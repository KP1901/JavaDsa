package part2;

import java.util.ArrayList;

public class Q14 {


	public static void main(String[] args) {


/*
 This is brute force because we are trying possible values one by one
 without using any mathematical optimization.

🔹 In this code:

We start from max(a, b) and keep increasing i
For each i, we check:
    - Is it divisible by a?
    - Is it divisible by b?

👉 This is brute force because:
- We do not know where LCM is
- So we check every number sequentially
- Many checks are unnecessary

👉 Time Complexity:
O(a × b) in worst case
*/

		int a = 12;
		int b = 20;

//		int i = Math.max(a, b);
//		int lcm = i;
//
//		while (true) {
//			if (i % a == 0 && i % b == 0) {
//				lcm = i;
//				break;
//			}
//			i++;
//		}
//		System.out.println(lcm);


// store original values
		int n1 = a;
		int n2 = b;

// Euclidean Algorithm for GCD
		while (b != 0) {
			int rem = a % b;
			a = b;
			b = rem;
		}

		int gcd = a;

// safer LCM calculation (avoid overflow)
		int lcm = (n1 / gcd) * n2;

		System.out.println("GCD = " + gcd);
		System.out.println("LCM = " + lcm);

	}

}

/*

brute force -

1. Start from bigger number
2. Keep checking:
   Is it divisible by both numbers?
3. If yes → LCM found
4. Else increase number

TC : O(LCM(a,b)

SC : O(1)

dry run :

a = 12
b = 20

i = max(12, 20)
i = 20

| Iteration | i  | i % 12 | i % 20 | Divisible by both? | Action |
| --------- | -- | ------ | ------ | ------------------ | ------ |
| 1         | 20 | 8      | 0      | No                 | i++    |
| 2         | 21 | 9      | 1      | No                 | i++    |
| 3         | 22 | 10     | 2      | No                 | i++    |
| 4         | 23 | 11     | 3      | No                 | i++    |
| 5         | 24 | 0      | 4      | No                 | i++    |
| 6         | 25 | 1      | 5      | No                 | i++    |
| 7         | 26 | 2      | 6      | No                 | i++    |
| 8         | 27 | 3      | 7      | No                 | i++    |
| 9         | 28 | 4      | 8      | No                 | i++    |
| 10        | 29 | 5      | 9      | No                 | i++    |
| 11        | 30 | 6      | 10     | No                 | i++    |
| 12        | 31 | 7      | 11     | No                 | i++    |
| 13        | 32 | 8      | 12     | No                 | i++    |
| 14        | 33 | 9      | 13     | No                 | i++    |
| 15        | 34 | 10     | 14     | No                 | i++    |
| 16        | 35 | 11     | 15     | No                 | i++    |
| 17        | 36 | 0      | 16     | No                 | i++    |
| 18        | 37 | 1      | 17     | No                 | i++    |
| 19        | 38 | 2      | 18     | No                 | i++    |
| 20        | 39 | 3      | 19     | No                 | i++    |
| 21        | 40 | 4      | 0      | No                 | i++    |
| 22        | 41 | 5      | 1      | No                 | i++    |
| 23        | 42 | 6      | 2      | No                 | i++    |
| 24        | 43 | 7      | 3      | No                 | i++    |
| 25        | 44 | 8      | 4      | No                 | i++    |
| 26        | 45 | 9      | 5      | No                 | i++    |
| 27        | 46 | 10     | 6      | No                 | i++    |
| 28        | 47 | 11     | 7      | No                 | i++    |
| 29        | 48 | 0      | 8      | No                 | i++    |
| 30        | 49 | 1      | 9      | No                 | i++    |
| 31        | 50 | 2      | 10     | No                 | i++    |
| 32        | 51 | 3      | 11     | No                 | i++    |
| 33        | 52 | 4      | 12     | No                 | i++    |
| 34        | 53 | 5      | 13     | No                 | i++    |
| 35        | 54 | 6      | 14     | No                 | i++    |
| 36        | 55 | 7      | 15     | No                 | i++    |
| 37        | 56 | 8      | 16     | No                 | i++    |
| 38        | 57 | 9      | 17     | No                 | i++    |
| 39        | 58 | 10     | 18     | No                 | i++    |
| 40        | 59 | 11     | 19     | No                 | i++    |
| 41        | 60 | 0      | 0      | Yes                | Stop   |

----------------------------------------------------------------------------
optimal solution :

- first find gcd using ecudliean algorthm
- then use fromula =(a / gcd) * b;

a = 12
b = 20

n1 = 12
n2 = 20

| Iteration | Condition (b != 0) | a  | b  | rem = a % b | a = b | b = rem |
| --------- | ------------------ | -- | -- | ----------- | ----- | ------- |
| 1         | 20 != 0 → True     | 12 | 20 | 12          | 20    | 12      |
| 2         | 12 != 0 → True     | 20 | 12 | 8           | 12    | 8       |
| 3         | 8 != 0 → True      | 12 | 8  | 4           | 8     | 4       |
| 4         | 4 != 0 → True      | 8  | 4  | 0           | 4     | 0       |
| 5         | 0 != 0 → False     | -  | -  | -           | -     | -       |


 */