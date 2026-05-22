package bitOperator_06;

public class LE {
	public static void main(String[] args) {
//		int base = 2;
//		int power = 3;
//
//		System.out.println((base << power) / 2);

		int n = 8;

		if ((n & (n - 1)) == 0) {
			System.out.println("yes it is power");
		} else {
			System.out.println("no power of 2");
		}

//		swap using Xor

		int a = 5;
		int b = 6;

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;


		System.out.println(a);
		System.out.println(b);

//
		int d = 1;
		int e = 2;
		int f = 1;
		int g = 4;
		int h = 2;
		int i = 4;
		int j = 15;

		System.out.println(d ^ e ^ f ^ g ^ h ^ i ^ j);
		System.out.println();

//		count 1 set bit
		int k = 7;
		int count = 0;

		while (k != 0) {
			count++;
			k = k & (k - 1);
		}
		System.out.println(count);
	}
}
/*


Positive Number Representation

a = 5

Binary:
00000000 00000000 00000000 00000101


Negative Number Representation (-5)

Step 1: Write binary of +5

00000000 00000000 00000000 00000101


Step 2: Take 1’s Complement (flip bits)

11111111 11111111 11111111 11111010


Step 3: Add 1 (2’s Complement)

11111111 11111111 11111111 11111011


Final Representation of -5

11111111 11111111 11111111 11111011


Important Notes

1. Positive numbers:
   - MSB (sign bit) = 0

2. Negative numbers:
   - stored using 2’s complement
   - MSB (sign bit) = 1

3. 1’s Complement:
   - flip all bits
   - 0 -> 1
   - 1 -> 0

4. 2’s Complement:
   - 1’s complement + 1

5. Formula:

   Negative Number =
   2’s complement of positive number


Example Summary

+5
00000000 00000000 00000000 00000101

1’s complement
11111111 11111111 11111111 11111010

+1
11111111 11111111 11111111 11111011

Therefore:
-5 =
11111111 11111111 11111111 11111011
-------------------------------------------------------------------------------------------------------------

 a ^ a = 0;
 0 ^ a or a ^ 0 = a;
 */