package String_02;

import java.util.*;

public class remove_duplicate_op_01 {
	public static void removeDuplicate(String str) {

//		String newStr = "";

		Set<Character> set = new LinkedHashSet<>();

		StringBuilder newStr = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			set.add(ch);
		}

//		Character[] arr = set.toArray(new Character[0]);
//
//		for (int i = 0; i < arr.length; i++) {
//			newStr += arr[i];
//		}
//
//		System.out.println(newStr);

		for (char ch : set) {
			newStr.append(ch);
		}
		System.out.println(newStr);


	}

	public static void main(String[] args) {
		String inputString = "programming";

		removeDuplicate(inputString);
	}
}

/*
Note : Set can also be traversed using:

for-each
Iterator
stream()
toArray()

Only this is impossible:

set.get(i)

because there is no index.

NOt full optimal :

String
↓
LinkedHashSet
↓
Array
↓
String
 */
