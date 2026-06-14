package Collection_05.Module_01;

import java.util.*;

//list or Collection -> interface

// ArrayList -> concrete class

public class ArrayList_01 {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
//		List<Integer> list = new ArrayList<>();
//		Collection<Integer> collection = new ArrayList<>();

//		collection methods (common)
//		add
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);

//		remove
		list.remove(1);
		System.out.println(list);

//		addAll
		List<Integer> list1 = new ArrayList<>();
		list1.add(50);
		list1.add(60);
		list.addAll(list1);

		System.out.println(list);

//		removeAll
		list.removeAll(list1);
		System.out.println(list);

//		size
		System.out.println(list.size());

//		clear -> remove all elements
		System.out.println(list1.size());
		list1.clear();
		System.out.println(list1);

//		iterator
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println("elements " + iterator.next());
		}

//		toArray -> convert (collection) to array
		Object[] arr = list1.toArray();

		for (Object value : arr) {
			System.out.println(value);
		}

//		contains
		System.out.println(list1.contains(400));

//		list methods

		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(100);
		list3.add(200);
		list3.add(300);

//		get - get exist one
		System.out.println(list3.get(1));

//		set -> update exist one
		list3.set(2, 400);
		System.out.println(list3);

//		indexOf -> give index
		System.out.println(list3.indexOf(400));


//	    Arraylist methods

		ArrayList<Integer> list5 = new ArrayList<>();
		list5.add(101);
		list5.add(102);
		list5.add(103);

//		sort -> ascending

		Collections.sort(list5);
		System.out.println(list5);

//		sort -> decending
		Collections.sort(list5, Collections.reverseOrder());
		System.out.println(list5);

//		clone
		ArrayList<Integer> newList = (ArrayList<Integer>) list5.clone();
		System.out.println(newList);

//		ensureCapacity
		ArrayList<Integer> newL = new ArrayList<>();
		newL.ensureCapacity(100);

//		isEmpty
		System.out.println(newL.isEmpty());

//		indexOf
		System.out.println(newList.indexOf(101));
	}


}
/*

NOtes :

COLLECTION

- Root interface of Collection Framework
- Stores group of objects
- Parent of List, Set, Queue

Features:
- Dynamic size
- Works with objects
- Provides common methods

Methods:
add() -> at element
remove() -> remove element
contains() -> check element
size()
clear() -> clear all element
isEmpty() -> check size is o or not
containsAll() -> check whether all element exits
retainAll() -> keep only common elements

Applications:
- Data storage
- Data manipulation
- Framework base interface
--------------------------------------------------
Notes :

LIST

- Child interface of Collection
- Maintains insertion order
- Allows duplicates
- Supports indexing

Implementations:
- ArrayList
- LinkedList
- Vector

Methods:
get()
set()
add(index, element)
addAll(index, collection)
remove(index)
indexOf()
lastIndexOf()
listIterator()
subList()
replaceAll()
sort()

Time Complexity:
Access -> Depends on implementation

Applications:
- Ordered data storage
- Index-based access
- Dynamic lists

---------------------------------------------------

Notes :

ARRAYLIST

- Dynamic array
- Maintains insertion order
- Allows duplicates
- Allows indexing
- Not synchronized
- Faster random access

Internal Working:
- Resizable array

Methods:
ensureCapacity() -> don't grow everytime just create the capacity(size) 100 / reserve extra spaec
trimToSize() -> remove unused space
clone() -> create a copy of java collection Arraylist

Note : we see capacity in java using capacity method in vector class

Time Complexity:
Access -> O(1)
Add at end -> O(1)
Remove/Add in middle -> O(n-1) -> O(n)
Exampe :
[10,20,30,40] add 15 at index 1
[10,_,20,30,40] so it shifted 3 times -> n - 1 -> O(n)

Search -> O(n) -> check every element till the n size

Applications:
- Storing dynamic data
- Frequent access using index
- General-purpose lists
---------------------------------------------------------------

| Situation                          | Use ArrayList? |
| ---------------------------------- | -------------- |
| Access by index frequently         | ✅              |
| Store and iterate data             | ✅              |
| Read operations more               | ✅              |
| Append at end                      | ✅              |
| Insert/remove in middle frequently | ❌              |


| Operation                      | Time             |
| ------------------------------ | ---------------- |
| Add Last (`add()`)             | O(1) *amortized* |
| Remove Last                    | O(1)             |
| Add First                      | O(n)             |
| Remove First                   | O(n)             |
| Access by Index (`get(i)`)     | O(1)             |
| Search (`contains`, `indexOf`) | O(n)             |
| Insert at Middle               | O(n)             |
| Remove from Middle             | O(n)             |

Use ArrayList when:

✅ Frequent random access (get(index))

✅ More reading than modifying

✅ Need fast access to any position

list.get(500);

Fast → O(1)

Use LinkedList when:

✅ Frequent insertions/deletions at the beginning or when you already have the node position

addFirst();
removeFirst();

Fast → O(1)

 */