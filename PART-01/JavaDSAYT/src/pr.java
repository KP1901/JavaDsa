

public class pr {

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	static void main() {
		int result = add(10, 20, 30);
		System.out.println(result);
	}
}
