package part2;

public class Q16 {
	public static void main(String[] args) {

		int n = 625;

		int low = 1;
		int high = n;

		double ans = 0;

		// Binary Search
		while (low <= high) {

			int mid = (low + high) / 2;

			if (mid * mid == n) {
				ans = mid;
				break;
			} else if (mid * mid < n) {
				ans = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		// Decimal precision starts from answer
		while (ans * ans <= n) {
			ans += 0.001;
		}

		System.out.printf("%.2f", ans);
	}
}
/*
idea :
- start from 1
- keep increasing by 0.001
- check square of current number
- when square becomes greater than n,
  current value is approximate square root

algorithm :

Algorithm:

1. Initialize:
   low = 1
   high = n
   ans = 0
2. Run loop while low <= high
3. Find middle:
   mid = (low + high) / 2
4. Check:
   - if mid * mid == n
       store mid in ans
       stop loop

   - if mid * mid < n
       store mid in ans
       move right:
       low = mid + 1

   - else
       move left:
       high = mid - 1
5. Run loop while ans * ans <= n
6. Increment ans by 0.001
7. Print answer with required precision

TC : TC=O(log n + 1000 (3 precision)

SC : O(1)
 */