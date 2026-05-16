package part1;

public class Q6 {
	public static void main(String[] args) {

		int max = 200;
		int min = 100;

		int value = (int) Math.floor(Math.random() * (max - min + 1)) + min;
		System.out.println(value);
	}
}
