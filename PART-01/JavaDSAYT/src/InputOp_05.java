import java.util.Scanner;

public class InputOp_05 {
	static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter age : ");
		float age = sc.nextFloat();
		System.out.println(age);

		/*
		int - nextInt()
		short -nextShort()
		long - nextLong()
		byte - nextByte()

		float - nextFloat()
		double - nextDouble()

		boolean - nextBoolean()

		next -

		*/
		sc.nextLine();

		System.out.println("Enter sentence");
		String sentence = sc.nextLine();
		System.out.println(sentence);

		System.out.println("Enter score");
		int score = sc.nextInt();
		System.out.println(score);

	}
}
/*
-nextInt() leaves \n in the scanner.
-nextLine() reads that \n as input and finishes immediately.

In Java Scanner:

nextInt()
nextDouble()
nextFloat()
next()

leave the newline (\n).

But:

nextLine()

consumes the whole line including the newline.
----------------------------------------------------------------------------------------------------------
“So basically, when input is taken using nextInt() and we press Enter,
the Enter key is also added to the buffer. It is considered an empty line,
but it is not consumed by nextInt(), so nextLine() reads it and returns an empty string.

So nextInt() only consumes 20, not the Enter key. That leftover Enter (\n) is later consumed by sc.nextLine().
If we don’t write an extra nextLine(), then the next nextLine() method consumes it and returns an empty string.”

so only nextLIne consumes input + \n not others like (nextInt,nextFloat)
*/
