package String_02;

import java.util.*;

public class first_non_repeat_ch_op_02 {

	public static void main(String[] args) {

		String inputString = "aabbcdde";

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < inputString.length(); i++) {
			if (map.containsKey(inputString.charAt(i))) {
				map.put(inputString.charAt(i), 1);
			}
			else{
//				map.
			}
		}
		System.out.println(map);
	}
}
