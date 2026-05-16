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

		int i = Math.max(a, b);
		int lcm = i;

		while (true) {
			if (i % a == 0 && i % b == 0) {
				lcm = i;
				break;
			}
			i++;
		}
		System.out.println(lcm);

//		int a = 18;
//		int b = 20;
//
//// store original values
//		int n1 = a;
//		int n2 = b;
//
//// Euclidean Algorithm for GCD
//		while (b != 0) {
//			int rem = a % b;
//			a = b;
//			b = rem;
//		}
//
//		int gcd = a;
//
//// safer LCM calculation (avoid overflow)
//		int lcm = (n1 / gcd) * n2;
//
//		System.out.println("GCD = " + gcd);
//		System.out.println("LCM = " + lcm);

	}

}
