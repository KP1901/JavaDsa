package String_02;

public class String_03 {
	static void printString(String str) {
		int n = str.length();
		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			System.out.println(ch);
		}
	}

	static int checkLength(String str) {
		int count = 0;
		char[] chs = str.toCharArray();
		for (char ch : chs) {
			count++;
		}
		return count;
	}

	static int countVowel(String str) {
		int n = str.length();
		int count = 0;
		for (int i = 0; i < n; i++) {
			char ch = str.toLowerCase().charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}

	static String reverString(String str) {
		int n = str.length() - 1;
		String newStr = "";

		for (int i = n; i >= 0; i--) {
			char ch = str.charAt(i);
			newStr += ch;
		}
		return newStr;
	}

	static boolean checkStringIsPalindrome(String str) {
		String original = str;
		int n = str.length() - 1;
		String newStr = "";

		for (int i = n; i >= 0; i--) {
			char ch = str.charAt(i);
			newStr += ch;
		}
		if (original.equals(newStr)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
//		question 1
		String st = "kIran";
		printString(st);

		// question 2
		System.out.println(checkLength(st));

//		question 3
		System.out.println(countVowel(st));

		// question 4
		System.out.println(reverString(st));

		String sts = "mam";

		System.out.println(checkStringIsPalindrome(sts));
	}
}
