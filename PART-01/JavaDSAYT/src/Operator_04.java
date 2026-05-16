public class Operator_04 {
	static void main(String[] args) {

		// arithmetic

		int a = 10;
		int b = 6;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);

		// relational operator

		int n1= 10;
		int n2 = 20;
		System.out.println(n1<n2);
		System.out.println(n1>n2);
		System.out.println(n1<=n2);
		System.out.println(n1>=n2);
		System.out.println(n1==n2);
		System.out.println(n1!=n2);
		System.out.println();

		// logical operator

		int a1 = 10;
		int a2 = 30;
		System.out.println(a1<a2 && a1>a2);
		System.out.println(a1<a2 || a1>a2);
		System.out.println(!(a1<a2));

		// assignment operator

		int n3 = 10;
		n3 += 20;
		n3 -= 10;
		n3 *= 10;
		n3 /= 10;
		n3 %= 2;

		System.out.println(n3);

		// unary operator

		int n4 = -10;
		System.out.println(-n4);

		int n5 = 10;
		int c = n5++ + --n5 - n5++;
		System.out.println(c);

		int n6 = 20;
		int n7 = n6++ -  --n6; // 20 - 20
		System.out.println(n7);

	}
}
