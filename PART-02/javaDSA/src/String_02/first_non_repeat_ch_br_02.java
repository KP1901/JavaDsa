package String_02;

public class first_non_repeat_ch_br_02 {
	public static void main(String[] args) {

		String inputString = "aabbcdde";
		String firstch = "";

		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			int count = 0;

			for (int j = 0; j < inputString.length(); j++) {
				if (ch == inputString.charAt(j)) {
					count++;
				}
			}
			if (count == 1) {
				firstch += ch;
				break;
			}
		}
		System.out.println(firstch);

	}
}
