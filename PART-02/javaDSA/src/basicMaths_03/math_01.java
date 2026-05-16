package basicMaths_03;

public class math_01 {
	static boolean checkPrime(int n) {
		for (int i = 2; i <= n - 1; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int num = 15;
		System.out.println(checkPrime(num));
	}
}
