package part1;

public class Q1 {

	public static int fib(int n) {
		if (n <= 1) return n;
		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {

//		int n1 = 0;
//		int n2 = 1;
//		int n = 7;
//
//
//		for (int i = 0; i < n; i++) {
//			System.out.print(n1 + " ");
//			int temp = n1 + n2;
//			n1 = n2;
//			n2 = temp;
//		}
		System.out.println(fib(8));
	}

}
