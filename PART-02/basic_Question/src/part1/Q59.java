package part1;


public class Q59 {

	public static int power(int base, int pow) {
		if (pow == 0) return 1;
		return base * power(base, pow - 1);
	}

	public static void main(String[] args) {
		System.out.println(power(2, 5));
	}
}
