package Collection_05.Module_03;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_03 {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(40);
		set.add(30);
		set.add(20);

		System.out.println(set);
	}
}
/*

TREESET

- Stores unique elements
- No duplicates allowed
- Elements stored in sorted order
- Does not maintain insertion order
- Null values not allowed

Internal Working:
- Red-Black Tree (Self Balancing BST)

Methods:
add()
remove()
contains()
first()
last()
higher()
lower()

Time Complexity:
add      -> O(log n)
remove   -> O(log n)
contains -> O(log n)

Applications:
- Sorted unique data
- Range operations
- Leaderboards
- Ranking systems
 */