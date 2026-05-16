package Collection_05.Module_03;

import java.util.HashSet;
import java.util.Set;

public class HashSet_01 {
	public static void main(String[] args) {

//		reatainAll()

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);

		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);

		set1.retainAll(set2);

		System.out.println(set1);

//		containsAll()

		System.out.println(set1.containsAll(set2));

//		Set<Integer> set = new HashSet<>();
//		set.add(10);
//		set.add(10);
//		set.add(10);
//		set.add(20);
//		set.add(30);
//		set.add(20);

//		System.out.println(set);

	}
}
/*

Notes :

HASHSET

- Stores unique elements
- No duplicates allowed
- Does not maintain insertion order
- Allows one null value
- Fast searching

Internal Working:
- Hash Table

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
- Removing duplicates
- Fast lookup/search
- Membership checking
 */