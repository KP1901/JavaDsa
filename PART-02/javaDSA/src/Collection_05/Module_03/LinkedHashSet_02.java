package Collection_05.Module_03;

import java.util.*;

public class LinkedHashSet_02 {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(20);

		System.out.println(set);
	}
}
/*
NOtes :

LINKEDHASHSET

- Stores unique elements
- No duplicates allowed
- Maintains insertion order
- Allows one null value
- Slightly slower than HashSet

Internal Working:
- Hash Table + Doubly Linked List

Methods:
add()
remove()
contains()
size()
clear()

Time Complexity:
add      -> O(1)
remove   -> O(1)
contains -> O(1)

Applications:
- Unique data with insertion order
- Caching
- Ordered lookup storage
 */