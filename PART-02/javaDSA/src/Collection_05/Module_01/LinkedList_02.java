package Collection_05.Module_01;

//linkedlist -> concrete class

import java.util.*;

public class LinkedList_02 {
	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();
//		List<Integer> list = new LinkedList<>();
//		Collection<Integer> collection = new LinkedList<>();

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
		List<Integer> list1 = new LinkedList<>();
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

		LinkedList<Integer> list3 = new LinkedList<>();
		list3.add(100);
		list3.add(200);
		list3.add(300);

//		get
		System.out.println(list3.get(1));

//		set
		list3.set(2, 400);
		System.out.println(list3);

//		toArray -> convert (collection) to array
		Object[] arr = list3.toArray();

		for (Object value : arr) {
			System.out.println(value);
		}

//		contains
		System.out.println(list3.contains(400));

//	    LinkedList methods

		LinkedList<Integer> list5 = new LinkedList<>();
		list5.add(101);
		list5.add(102);
		list5.add(103);
		list5.add(101);

//		sort -> ascending

		Collections.sort(list5);
		System.out.println(list5);

//		sort -> decending
		Collections.sort(list5, Collections.reverseOrder());
		System.out.println(list5);

//		clone
		LinkedList<Integer> newList = (LinkedList<Integer>) list5.clone();
		System.out.println(newList);

//		ensureCapacity
		LinkedList<Integer> newL = new LinkedList<>();
//		newL.ensureCapacity(100);

//		isEmpty
		System.out.println(newL.isEmpty());

//		indexOf
		System.out.println(newList.indexOf(101));

//		lastindexOf
		System.out.println(newList.lastIndexOf(101));

//		linked list as Queue and Deque

		LinkedList<Integer> list6 = new LinkedList<>();
		list6.add(101);
		list6.add(102);
		list6.add(103);
		list6.add(101);
		list6.add(102);

//		addFirst
		list6.addFirst(100);
		System.out.println(list6);

//		addLast
		list6.addLast(105);
		System.out.println(list6);

//		removeFirst
		list6.removeFirst();
		System.out.println(list6);

//		removeLast
		list6.removeLast();
		System.out.println(list6);

//		getFirst
		System.out.println(list6.getFirst());

//		getLast
		System.out.println(list6.getLast());

//		peek
		System.out.println(list6.peek());

//		poll
		System.out.println(list6.poll());
		System.out.println(list6);
	}

}

/*

-donest support index based array
-for reverse use decendingIterator()
--------------------------------------------------------------------------------------------------------

Notes :

LINKEDLIST

- Doubly linked list
- Dynamic memory allocation
- Maintains insertion order
- Allows duplicates
- Fast insertion/deletion
- Slow random access

Internal Working:
- Nodes connected using links
- Each node stores:
  predata | value | nextValue

Methods:
add()
remove()
get()
set()
addFirst()
addLast()

Time Complexity:
Access -> O(n)
Add/Remove at start -> O(1)
Add/Remove at end -> O(1)
Search -> O(n)

Applications:
- Frequent insertion/deletion
- Queue implementation
- Deque implementation

*/