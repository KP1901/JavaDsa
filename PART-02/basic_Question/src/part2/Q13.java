package part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Q13 {


	public static void main(String[] args) {


		//	1 brute force

		int a = 12;
		int b = 18;

		TreeSet<Integer> set1 = new TreeSet<>();
		Set<Integer> set2 = new TreeSet<>();

		for (int i = 1; i * i <= a; i++) {
			if (a % i == 0) {
				set1.add(i);
				set1.add(a / i);
			}
		}

		for (int i = 1; i * i <= b; i++) {
			if (b % i == 0) {
				set2.add(i);
				set2.add(b / i);
			}
		}
//
//		set1.retainAll(set2);
//
//		System.out.println(set1.last());


//		way - 2 brute force

//		int a = 12;
//		int b = 18;
//
//		int min = Math.min(a, b);
//		int gcd = 1;
//		for (int i = 1; i <= Math.sqrt(min); i++) {
//			if (a % i == 0 && b % i == 0) {
//				gcd = Math.max(gcd, i);
//			}
//
//			int pair = min / i;
//
//			if (a % pair == 0 && b % pair == 0) {
//				gcd = Math.max(gcd, pair);
//			}
//
//		}
//		System.out.println(gcd);

//		way 3 - optimal solution

//		int a = 12;
//		int b = 18;
//
//		while(b !=0){
//			int rem= (a % b);
//			a = b ;
//			b = rem;
//		}
//		int gcd = a;
//		System.out.println(a);


	}
}

/*
Way 1 - Brute Force

1. First store all factor pairs of both a and b into sets
   Example:
   For 12 → (1,12), (2,6), (3,4)

If i is divisor,
paired divisor = min / i

2. Make the factors common
   Common factors → intersection of both sets

3. Take the last/largest common element
   That will be the GCD

TC : O (a) + O(b) = O(a+b)

SC :O (a) + O(b) = O(a+b)

a = 12
b = 18

set1 = {}
set2 = {}

Dry Run for a = 12

i * i <= 12

| Iteration | Condition           | i | 12 % i == 0 | Added in set1 |
| --------- | ------------------- | - | ----------- | ------------- |
| 1         | 1 * 1 <= 12 → True  | 1 | Yes         | 1, 12         |
| 2         | 2 * 2 <= 12 → True  | 2 | Yes         | 2, 6          |
| 3         | 3 * 3 <= 12 → True  | 3 | Yes         | 3, 4          |
| 4         | 4 * 4 <= 12 → False | - | -           | -             |

Dry Run for b = 18

Loop condition:

i * i <= 18


| Iteration | Condition           | i | 18 % i == 0 | Added in set2 |
| --------- | ------------------- | - | ----------- | ------------- |
| 1         | 1 * 1 <= 18 → True  | 1 | Yes         | 1, 18         |
| 2         | 2 * 2 <= 18 → True  | 2 | Yes         | 2, 9          |
| 3         | 3 * 3 <= 18 → True  | 3 | Yes         | 3, 6          |
| 4         | 4 * 4 <= 18 → True  | 4 | No          | Nothing       |
| 5         | 5 * 5 <= 18 → False | - | -           | -             |

------------------------------------------------------
way 2 - brute force

GCD Using Optimized Brute Force

Idea:
-start from min number
-Instead of checking from 1 → min(a,b),
-check only till √min(a,b)
-because divisors come in pairs.

Example:
12 → (1,12), (2,6), (3,4)

If i is divisor,
paired divisor = min / i

Algorithm:
1. Run loop from 1 → √min
2. Check i divides both numbers
3. Check paired divisor (min/i) divides both numbers
4. Store maximum common divisor
5. then print gcd

Example:
a = 12
b = 18
min = 12

√12 ≈ 3



Time Complexity:
O(√min(a,b))

Space Complexity:
O(1)

----------------------------------------------------------------------------------------------


Way 3 - Optimal Solution

- Only remainder (a % b) is not always the GCD
- So we keep dividing until remainder becomes 0
- When remainder becomes 0,
  current divisor is the GCD


48 % 18 = 12   ← not GCD
18 % 12 = 6
12 % 6 = 0    ← stop

GCD = 6


dry run

| Step | a  | b  | rem = a % b | Reassign                  | Reason                                           |
| ---- | -- | -- | ----------- | ------------------------- | ------------------------------------------------ |
| 0    | 12 | 18 | 12          | Swap → `a = 18`, `b = 12` | `12 % 18 = 12`, remainder did not become smaller |
| 1    | 18 | 12 | 6           | `a = 12`, `b = 6`         | Problem size reduced                             |
| 2    | 12 | 6  | 0           | Stop                      | When remainder becomes `0`, current `b` is GCD   |









*/
