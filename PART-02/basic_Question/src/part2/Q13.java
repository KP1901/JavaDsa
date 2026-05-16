package part2;

import java.util.ArrayList;

public class Q13 {


	public static void main(String[] args) {


/*
 this is brute force => becuase we are trying all possible options without optimization

🔹 In your code

You:

Find all factors of a ✅
Find all factors of b ✅
Compare each with .contains() ✅

👉 That is brute force because:

You are checking many unnecessary possibilities
*/

//		int a = 12;
//		int b = 20;
//
//		ArrayList<Integer> factorsA = new ArrayList<>();
//		ArrayList<Integer> factorsB = new ArrayList<>();
//
//
//		for (int i = 1; i <= a; i++) {
//			if (a % i == 0) {
//				factorsA.add(i);
//			}
//		}
//
//		for (int i = 1; i <= b; i++) {
//			if (b % i == 0) {
//				factorsB.add(i);
//			}
//		}
//
//		int GCD = 0;
//
//		for (int x : factorsA) {
//			if (factorsB.contains(x)) {
//				GCD = x;
//			}
//		}
//
//		System.out.println(GCD);

		int a = 18;
		int b = 20;

		while (b != 0) {
			int rem = a % b;
			a = b; // 20
			b = rem; // 18 % 20 = 18
		}
		int gcd = a;

		System.out.println(gcd);

	}

}
