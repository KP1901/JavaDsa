package String_02;

public class remove_duplicate_br_01 {
	public static String removeDuplicate(String str) {

		String newStr = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean isDuplicate = false;
			for (int j = 0; j < newStr.length(); j++) {
				if (ch == newStr.charAt(j)) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				newStr += ch;
			}
		}

		return newStr;
	}

	public static void main(String[] args) {
		String inputString = "programming";

		System.out.println(removeDuplicate(inputString));
	}
}

/*


Challenge: Remove Duplicate Characters

BRUTE FORCE

Idea:

* Take one character at a time from the original string.
* Check whether this character already exists in the result built so far.
* If found → skip it.
* If not found → add it.

Algorithm:

1. Create an empty result string.
2. Pick a character from the input string.
3. Search for this character in the current result.
4. If duplicate exists → skip it.
5. If duplicate doesn't exist → add it.
6. Repeat for all characters.
7. Return result.

Complexity:
Time → O(n²)
Space → O(n)

Reason:

* Outer loop runs for every character.
* Inner loop searches previous/result characters repeatedly.
* Nested searching leads to O(n²).

OPTIMIZED (LinkedHashSet)

Idea:

* Repeated searching wastes time.
* Store already-seen characters.
* LinkedHashSet removes duplicates automatically and keeps insertion order.

Algorithm:

1. Create a LinkedHashSet.
2. Traverse the string character by character.
3. Add each character to the set.
4. Traverse the set elements.
5. Append elements into final result.
6. Return result.

Complexity:
Time → O(n)
Space → O(n)

Reason:

* Character is checked directly in the set.
* No repeated searching.

DSA Thinking Pattern:
Brute Force:
Repeated searching

Optimization:
Store information once and reuse it

 */