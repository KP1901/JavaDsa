package Collection_05.Module_02;

import java.util.*;

public class QueueBasics_01 {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(100);
//		queue methods

//		add (task successful -> true fails -> error)
//		q.add(10);
//		q.add(20);
//		q.add(30);
//		q.add(40);

//		offer (task successful -> true fails -> false) so best choice is offer for queue
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);

		System.out.println(q);

//		clear
//		q.clear();

//		element -> returns exception if collection is empty
		System.out.println(q.element());

//		peek -> returns null if collection is empty (best choice over element)
		System.out.println(q.peek());

//		remove() -> returns and remove head of queue & eturns exception if collection is empty
		System.out.println(q.remove());

//		poll() -> returns and remove head of queue & returns null if collection is empty (best choice over remove)
		System.out.println(q.poll());

	}
}

/*

That’s Why Same LinkedList Object Can Behave Differently As List

List<Integer> list = new LinkedList<>();

You use:

add()
get()
set()
remove(index)

As Queue
Queue<Integer> q = new LinkedList<>();

You use:

offer()
poll()
peek()

FIFO behavior.

As Deque

Deque<Integer> dq = new LinkedList<>();

You use:

addFirst()
addLast()
removeFirst()
removeLast()

Double-ended behavior.
-----------------------------------------------------------------------------

Notes :

QUEUE

- Follows FIFO
- First In First Out
- Insert from rear
- Remove from front

Methods:
offer()
poll()
peek()
add()
remove()

Time Complexity:
offer -> O(1)
poll  -> O(1)
peek  -> O(1)

Applications:
- CPU Scheduling
- Printer Queue
- BFS Traversal
- Task Processing
------------------------------------------------------------

| Word | Meaning           |
| ---- | ----------------- |
| Head | Starting side     |
| Tail | Ending side       |
| Top  | Stack top element |

head/front -> [10,20,30] <- tail/rear

Exception Top for stack

bottom -> [10,20,30] <- top

or vertically

30
20
10
------------------------------------------------------
Queue :
front/head -> peek()

Stack
top -> peek()

Collection
│
├── List
│   ├── ArrayList
│   ├── LinkedList  ← also implements Deque
│   └── Vector
│       └── Stack
│
├── Queue
│   ├── PriorityQueue
│   └── Deque
│       ├── ArrayDeque
│       └── LinkedList
│
└── Set
    ├── HashSet
    ├── LinkedHashSet
    └── TreeSet


Map  ← Separate from Collection
│
├── HashMap
├── LinkedHashMap
└── TreeMap

*/