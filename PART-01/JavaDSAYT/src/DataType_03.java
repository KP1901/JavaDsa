import java.sql.SQLOutput;

public class DataType_03 {
	static void main(String[] args) {

		// numeric datatype

		byte num1 = 125;
		System.out.println(num1);
		short num2 = 3250;
		System.out.println(num2);
		int num3 = 123434;
		System.out.println(num3);
		long num4 = 12331311123L;
		System.out.println(num4);

		// floating point

		float num5 = 2.4545234f;
		System.out.println(num5);
		double num6 = 2.4577575756755d;
		System.out.println(num6);

		// non numeric

		char ch = 'a';
		System.out.println(ch);
		boolean isLoggedIn = true;
		System.out.println(isLoggedIn);

		//numeric to ch
		char ch1 = 'a';
		System.out.println(ch1 + 1);
		System.out.println((char) (ch1 + 1));

		// implicit conversion (small data stored in large data)
		int n1 = 2;
		System.out.println(n1);


		// explicit conversion (typecasting) => data will loss if it not came under range
		long n2 = 1234566765;
		int n3 = (int) n2;
		System.out.println(n3);


		int k = 40000;
		short v = (short) k;
		System.out.println(v);

	}
}
