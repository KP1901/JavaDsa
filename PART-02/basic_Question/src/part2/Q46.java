package part2;

public class Q46 {
	public static void main(String[] args) {

		int a = 8;
		int b = 15;

		while (b != 0) {
			int rem = a % b;
			a = b;
			b = rem;
		}
		int gcd = a;
		if(gcd > 1)
		{
			System.out.println("no co prime");
		}
		else{
			System.out.println("co prime");
		}
	}
}
