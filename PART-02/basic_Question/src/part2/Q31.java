package part2;

public class Q31 {
	public static void main(String[] args) {
		int n = 6;
		int original = n;
		int temp = n;
		int sqOfN = n * n;
		int place = 1;
		while (temp != 0) {
			place = place * 10;
			temp = temp / 10;
		}
		if (sqOfN % place == original) {
			System.out.println("automorphic");
		} else {
			System.out.println("non automorphic");
		}
	}
}
/*

“Take last k digits of square and compare with n”
 k = number of digits in n

 🧠 What pattern is this?

👉 It’s a “last digits pattern” (very important in DSA)
   You are focusing only on the ending part of a number

   🔥 General pattern

Whenever a problem says:

“last digit”
“last k digits”
“ends with”
“trailing digits”

👉 Think:

Use modulo ( % ) with powers of 10
place = 10^k(k = number of digits in n)
 */