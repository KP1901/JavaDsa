package part1;

public class Q2 {

	public static void main(String[] args) {

		int n = 100;
		for (int i = 2; i <= n; i++) {
			boolean isDivisor = false;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					isDivisor = true;
					break;
				}
			}
			if (!isDivisor) {
				System.out.println(i);
			}

		}
//		int n = 7;
//		boolean isPrime = true;
//
//		for (int i = 2; i <= Math.sqrt(n); i++) {
//			if (n % i == 0) {
//				isPrime = false;
//				break;
//			}
//		}
//		if (isPrime) {
//			System.out.println(n);
//		}
	}
}

/*
  1: divisor :
  n  = 6 ;
  <p>
  6 / 2 = 3 => 2 is divisor
  6 / 3 = 2 => 3 is divisor
  6 / 4 = 1.23 => 4 is divisor
  <p>
  2 : factor :
  n = a x b;
  n = 6 ;
  <p>
  1x6
  2x3
  <p>
  🔍 Example (36)
  Pairs:
  <p>
  2 × 18
  3 × 12
  4 × 9
  6 × 6
  ------
  9 x 4
  12 x 3 like so on
  <p>
  √36 = 6
  <p>
  “After √n, factor pairs appear in reverse order, so any divisor after √n would
  already have its pair before √n. That’s why we don’t need to check beyond √n.”
  <p>
  brute force - 1 to n- 1 because we are checking every element
  optimal - 1 to √n
  <p>
  so final : “To check if a number has any divisor other than 1 and itself, we only need to check up to √n.”
 */
