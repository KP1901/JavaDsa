package String_02;

public class stringMethods_02 {
	public static void main(String[] args) {

		String name = "  babbar       ";
		String name1 = "babbar";

		// 1. length
		System.out.println(name.length());

		// 2. returns character
		System.out.println(name.charAt(0));

		// 3. check string literal (content)
		System.out.println(name.equals(name1));

		// 4. check string literal (content) ingore case
		System.out.println(name.equalsIgnoreCase(name1));

		// 5. check string is empty or not (empty -> length =0 )
		System.out.println(name.isEmpty());

		// 6. check string is blank or not (blank -> length =0 or inlcudes spaces)
		System.out.println(name.isBlank());

		//7. reomving leading spaces (left or irght)
		System.out.println(name.trim());

		//8. substring()
		System.out.println(name1.substring(0, 2));

		// 9. contains
		System.out.println(name1.contains("love"));

		// 10 .valueOf() => convert any data type into string
		int num = 10;
		String str = String.valueOf(num);
		System.out.println(str + 1);

		// 11.startsWith
		String a = "love babbar";
		System.out.println(a.startsWith("love", 0));

		// 12.endsWith
		System.out.println(a.endsWith("love"));

		//13.toCharArray() => convert character into array
		String names = "Babbar";
		char[] crr = names.toCharArray();

		for (char value : crr) {
			System.out.println(value);
		}

		//14.split() => break the string upon particular criteria
		String myName = "my name is Love";
		String[] strarr = myName.split(" ");

		for (String value : strarr) {
			System.out.println(value);
		}

		//15. repalce
		String na = "babbar";
		System.out.println(na.replace("b", "l"));


	}
}

/*

Ways to Convert to String in Java

String.valueOf(value);    // Best/common way
Integer.toString(num);    // For int
Double.toString(num);     // For double
value.toString();         // For objects (fails if value is null)
"" + value;               // String concatenation

 */