package part2;

public class Q28 {
	public static void main(String[] args) {

//		works but not optmized
		int original = 6;
		int n = original;
		int sum = 0;

//		for (int i = 1; i < n; i++) {
//			if (n % i == 0) {
//				sum = sum + i;
//			}
//		}
//		System.out.println(sum);

		for (int i = 1; i <= Math.sqrt(n); i++) {
// first check divisor
			if (n % i == 0) {
				if (n / i == i) {
					sum = sum + i;

				} else {
					sum = sum + i + n / i;
				}
			}
		}
		sum = sum - n;
		if(sum == original)
		{
			System.out.println("perfect number");
		}
		else{
			System.out.println("not perfect number");
		}
	}
}

// we are handling perfect squarte becasue have duplicate pair (6,6)