package part2;

public class Q34 {
	public static void main(String[] args) {
		int n = 35;
		int num = n + 1;
		int root = (int) Math.sqrt(num);
		if (root * root == num) {
			System.out.println("sunny");
		} else {
			System.out.println("not sunny");
		}
	}
}
