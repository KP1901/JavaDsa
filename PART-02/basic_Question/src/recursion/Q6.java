package recursion;

// 6 — Reverse String
public class Q6 {
	public static String reverse(String str) {

		if (str.isEmpty()) {
			return "";
		}

		return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
	}

	public static void main(String[] args) {

		System.out.println(reverse("JAVA"));
	}
}
/*

Dry Run

Call 1:
reverse("JAVA")

Return:
'A' + reverse("JAV") -> wait


Call 2:
reverse("JAV")

Return:
'V' + reverse("JA") -> wait


Call 3:
reverse("JA")

Return:
'A' + reverse("J") -> wait


Call 4:
reverse("J")

Return:
'J' + reverse("") -> wait


Call 5:
reverse("")

Return:
""


Backward:

'J' + "" = "J"
'A' + "J" = "AJ"
'V' + "AJ" = "VAJ"
'A' + "VAJ" = "AVAJ"
 */