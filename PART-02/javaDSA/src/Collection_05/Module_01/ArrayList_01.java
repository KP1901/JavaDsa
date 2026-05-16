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

//		toArray -> convert (collection) to array
		Object[] arr = list3.toArray();

		for (Object value : arr) {
			System.out.println(value);
		}

//		contains
		System.out.println(list3.contains(400));

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
add()
remove()
contains()
size()
clear()
isEmpty()

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
add()
get()
set()
remove()
indexOf()

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
add()
remove()
get()
set()
contains()
size()

Time Complexity:
Access -> O(1)
Add at end -> O(1)
Remove/Add in middle -> O(n-1) -> O(n)
Search -> O(n) -> check every element till the n size

Applications:
- Storing dynamic data
- Frequent access using index
- General-purpose lists

 */