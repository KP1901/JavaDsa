package Collection_05.Module_02;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeue_04 {
	public static void main(String[] args) {
		Deque<Integer> q = new ArrayDeque<>();
		q.offer(20);
		q.offerFirst(30);
		q.offerLast(50);

		System.out.println(q);

		q.pollLast();
		q.pollFirst();
		System.out.println(q);

		System.out.println(q.peek());
	}
}

/*

Deque Can Work As

1. Queue
FIFO

2. Stack
LIFO

Both.

That’s why it is VERY powerful.

| Method        | Purpose      |
| ------------- | ------------ |
| addFirst()    | insert front |
| addLast()     | insert rear  |
| removeFirst() | remove front |
| removeLast()  | remove rear  |
| peekFirst()   | see front    |
| peekLast()    | see rear     |
-----------------------------------------------------------------------------------------------
Notes :

ARRAYDEQUE

- Resizable array implementation of Deque
- Faster than Stack and LinkedList in most cases
- Insert/Delete from both ends
- No indexing support
- Does not allow null values

Internal Working:
- Circular dynamic array

Methods:
addFirst()
addLast()
removeFirst()
removeLast()
offerFirst()
offerLast()
push()
pop()

Time Complexity:
add/remove at both ends -> O(1)
peek -> O(1)

Applications:
- Stack implementation
- Queue implementation
- Deque operations
- Sliding Window Problems
*/