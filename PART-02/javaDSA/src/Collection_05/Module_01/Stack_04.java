package Collection_05.Module_01;

import java.util.*;

public class Stack_04 {
	public static void main(String[] args) {

		Stack<Integer> list = new Stack<>();
//		List<Integer> list = new Stack<>();
//		Collection<Integer> collection = new Stack<>();

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
		List<Integer> list1 = new Stack<>();
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

		Stack<Integer> list3 = new Stack<>();
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

//	    Stack methods

		Stack<Integer> list5 = new Stack<>();
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
		Stack<Integer> newList = (Stack<Integer>) list5.clone();
		System.out.println(newList);

//		ensureCapacity
		Stack<Integer> newL = new Stack<>();
//		newL.ensureCapacity(100);

//		isEmpty
		System.out.println(newL.isEmpty());

//		indexOf
		System.out.println(newList.indexOf(101));

//		lastindexOf
		System.out.println(newList.lastIndexOf(101));


		Stack<Integer> list6 = new Stack<>();
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

//      Stack methods

		Stack<Integer> stack1 = new Stack<>();
		stack1.add(1);
		stack1.add(2);
		stack1.add(3);
		stack1.add(4);

//		push
		stack1.push(5);
		System.out.println(stack1);

//		pop
		stack1.pop();
		System.out.println(stack1);

//		peek
		System.out.println(stack1.peek());

//		search
		System.out.println(stack1.search(2));

//		empty
		System.out.println(stack1.empty());
	}
}
/*

[10,20,30] <- top side

----------------------------------------------

Notes :

STACK

- Follows LIFO
- Last In First Out
- Insert/Delete from same side
- Legacy class
- Extends Vector

Methods:
push()
pop()
peek()

Time Complexity:
push -> O(1)
pop  -> O(1)
peek -> O(1)

Applications:
- Undo operations
- Recursion
- Expression evaluation
- Backtracking
 */
