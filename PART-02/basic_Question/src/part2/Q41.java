package part2;

public class Q41 {
	public static void main(String[] args) {
		int a = 42;
		int b = 31;
//		int temp = b;
//		b = a;
//		a = temp;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a);
		System.out.println(b);


	}
}
