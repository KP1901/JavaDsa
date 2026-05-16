package part2;


public class Q27 {
	public static void main(String[] args) {
//		brute-force
//		int n = 145;
//		int sum = 0;
//
//		while (n != 0) {
//			int rem = n % 10;
//			int fact = 1;
//
//				for (int i = 1; i <= rem; i++) {
//					fact = fact * i;
//				}
//			sum = sum + fact;
//			n = n / 10;
//		}
//		System.out.println(sum);

		int[] arr = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};

		int original = 145;
		int n = original;
		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			int fact = arr[rem];
			sum = sum + fact;
			n = n / 10;
		}

		if(original == sum)
		{
			System.out.println("Strong Number");
		}
		else{
			System.out.println("Not Strong Number");
		}
	}
}
/*

❌ Recomputing (brute force)
            |
            |
            |
            |
✅ Precompute + Lookup (optimized)
This pattern is used in:
-Digit problems
-Frequency counting
-Hashing
-Dynamic programming








*/