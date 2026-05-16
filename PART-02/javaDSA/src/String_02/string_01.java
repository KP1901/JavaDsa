package String_02;

import java.util.Scanner;

public class string_01 {


	public static void main(String[] args) {

		//	creation

		String str = "Love";

		String st = new String("Hi");

		//	access

		System.out.println(str.charAt(0));

//		compare string

		String name1 = "love";
		String name2 = "Love";

//		== check reference are same or not
		if (name1 == name2) {
			System.out.println("same refe");
		}
//		check string (case sensitive)
		if (name1.equals(name2)) {
			System.out.println("same string content");
		}

		//		check string (ignore case)
		if (name1.equalsIgnoreCase(name2)) {
			System.out.println("same string content and ignores case");
		}

		// string input
		// next() => take only first word
		// nextLine() => take full sentence

		Scanner sc = new Scanner(System.in);

		System.out.println("enter full name");
		String fullName = sc.nextLine();
		System.out.println(fullName);

		System.out.println("enter full name");
		String firstName = sc.next();
		System.out.println(firstName);

	}
}
