package Collection_05.Module_01;

import java.util.*;

public class Vector_03 {
	public static void main(String[] args) {
		Vector<Integer> list = new Vector<>();
//		List<Integer> list = new Vector<>();
//		Collection<Integer> collection = new Vector<>();

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
		List<Integer> list1 = new Vector<>();
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

		Vector<Integer> list3 = new Vector<>();
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

//	    Vector methods

		Vector<Integer> list5 = new Vector<>();
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
		Vector<Integer> newList = (Vector<Integer>) list5.clone();
		System.out.println(newList);

//		ensureCapacity
		Vector<Integer> newL = new Vector<>();
//		newL.ensureCapacity(100);

//		isEmpty
		System.out.println(newL.isEmpty());

//		indexOf
		System.out.println(newList.indexOf(101));

//		lastindexOf
		System.out.println(newList.lastIndexOf(101));

//		Vector front/back operations

		Vector<Integer> list6 = new Vector<>();
		list6.add(101);
		list6.add(102);
		list6.add(103);
		list6.add(101);
		list6.add(102);

//		addElement -> end
		list6.addElement(100);
		System.out.println(list6);

//		removeElement
		list6.removeElement(105);
		System.out.println(list6);

//		elementAt(index)
		list6.elementAt(1);
		System.out.println(list6);


	}
}

/*

NOtes :

VECTOR

- Dynamic array
- Legacy class
- Synchronized
- Thread-safe
- Slower than ArrayList

Internal Working:
- Resizable array

Methods:
addElement()
removeElement()
elementAt(index)
firstElement()
lastElement()
capacity()

Time Complexity:
Access -> O(1)
Insertion at end -> O(1)
Insertion in middle -> O(n)

Applications:
- Thread-safe dynamic storage
---------------------------------------------------------------------

How to identify which methods belongs to which class

Examples

1.get(index)

Behavior:
index access

So belongs to:
List

2.addFirst()

Behavior:
front insertion

So belongs to:
Deque

3.push()/pop()

Behavior:
stack

So belongs to:
-Stack
-Deque

 */