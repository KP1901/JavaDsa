package part2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q33 {
	public static void main(String[] args) {

//		int n = 10023;
//		int temp = n;
//		boolean isDuck = false;
//		while (temp != 0) {
//			if (temp % 10 == 0) {
//				isDuck = true;
//				break;
//			}
//			temp = temp / 10;
//		}
//		if (isDuck) {
//			System.out.println("duck number");
//		} else {
//			System.out.println("not duck number");
//		}

		String num = "10022";
		char[] chArray = num.toCharArray();
		boolean isDuck = false;

		if (num.charAt(0) != '0') {
			for (int i = 1; i < num.length(); i++) {
				if (num.charAt(i) == '0') {
					isDuck = true;
					break;
				}
			}
		}
		System.out.println(isDuck);
//		if(chArray.contains)

	}
}
