package pr;

import java.util.*;

public class Qu {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(4);

		for (int i = 0; i < list.size(); i++) {
			boolean alreadyProcess = false;

			Object element = list.get(i);

			for (int j = 0; j < i; j++) {
				if (element.equals(list.get(j))) {
					alreadyProcess = true;
					break;
				}
			}

			if (alreadyProcess) {
				continue;
			}
			int count = 0;

			for (int j = 0; j < list.size(); j++) {
				if (element.equals(list.get(j))) {
					count++;
				}
			}

			System.out.println(element + " -> " + count + " times");
		}


	}
}

/*

Question:
Count frequency of each element in an ArrayList without printing duplicate frequencies.

Example Input:
[1,2,2,3,1,2,4]

Expected Output:
1 -> 2
2 -> 3
3 -> 1
4 -> 1

Idea:

1. Pick one element
2. Check if already processed before current index
3. If yes → skip
4. Else count occurrences
5. Print frequency

Algorithm:

Pick element
↓
Check previous indexes
↓
Already processed?
↓ Yes → Skip
↓ No
Count frequency
Print

Dry Run Table:

| i | Element | Previous Elements Checked | Already Processed? | Count | Output |
| - | ------- | ------------------------- | ------------------ | ----- | ------ |
| 0 | 1       | none                      | No                 | 2     | 1 → 2  |
| 1 | 2       | [1]                       | No                 | 3     | 2 → 3  |
| 2 | 2       | [1,2]                     | Yes                | Skip  | -      |
| 3 | 3       | [1,2,2]                   | No                 | 1     | 3 → 1  |
| 4 | 1       | [1,2,2,3]                 | Yes                | Skip  | -      |
| 5 | 2       | [1,2,2,3,1]               | Yes                | Skip  | -      |
| 6 | 4       | [1,2,2,3,1,2]             | No                 | 1     | 4 → 1  |


Mistake I Made:

- Checked whole list for already processed elements
- Current element matched itself
- Everything got skipped

Learning:

- For already processed logic:
  check only previous indexes (0 to i-1)

Complexity:

Time = O(n²)  → brute force
Space = O(1)
 */