package Collection_05.Module_02;

import java.util.*;

public class Deque_02 {
	public static void main(String[] args) {
		Deque<Integer> d = new LinkedList<>();
		d.add(10);
		d.add(20);
		d.add(30);

		System.out.println(d);

//		follow stack

		d.addLast(40);
		System.out.println(d);

		d.removeLast();
		System.out.println(d);

//		follow queue

		d.addLast(1);
		System.out.println(d);

		d.removeFirst();
		System.out.println(d);

		d.add(100);
		d.push(200);
		System.out.println(d);
	}
}

/*

| Behavior | Add       | Remove    |
| -------- | --------- | --------- |
| Stack    | Same side | Same side |
| Queue    | Rear      | Front     |
| Deque    | Any side  | Any side  |


Iterable
   │
   └── Collection
         │
         ├── List
         │     ├── ArrayList
         │     ├── LinkedList
         │     ├── Vector
         │     └── Stack
         │
         ├── Set
         │     ├── HashSet
         │     │      └── LinkedHashSet
         │     ├── SortedSet
         │     │      └── NavigableSet
         │     │              └── TreeSet
         │
         └── Queue
               ├── PriorityQueue
               ├── Deque
               │      ├── ArrayDeque
               │      └── LinkedList


               Map
 ├── HashMap
 │      └── LinkedHashMap
 │
 ├── Hashtable
 │      └── Properties
 │
 ├── SortedMap
 │      └── NavigableMap
 │              └── TreeMap
 │
 └── WeakHashMap

 Important points:

- extends Queue
-Stack extends Vector
-LinkedList implements both:
	-List
	-Deque
-TreeSet uses sorting
-HashSet internally uses HashMap
-ArrayDeque is faster than Stack for stack operations in modern Java

Quick relation chart:

Collection
   ├── List  -> ordered + duplicates allowed
   ├── Set   -> no duplicates
   └── Queue -> processing order
                 └── Deque -> insertion/deletion from both ends



-----------------------------------------------------------------

stack -> add/push -> end may add karta
[10,20,30] -> [10,20,30]

queue -> add/offer -> end may add karta
[101] -> [101,10,20,30]

deque -> add/offer -> end may add karta
		 push -> first may add akrta hai
		 see below chart for deque

| Stack Method | Deque Equivalent |
| ------------ | ---------------- |
| push(e)      | addFirst(e)      |
| pop()        | removeFirst()    |
| peek()       | peekFirst()      |


deque add methods

| Method       | Adds Where |
| ------------ | ---------- |
| addFirst()   | Front      |
| addLast()    | Rear       |
| add()        | Rear       |
| offerFirst() | Front      |
| offerLast()  | Rear       |
| offer()      | Rear       |
| push()       | Front      |


Deque removal methods

| Method        | Removes       |
| ------------- | ------------- |
| remove()      | first element |
| removeFirst() | first element |
| removeLast()  | last element  |
| pop()         | first element |
---------------------------------------------------------------------------------------------------------

Notes :

DEQUE (Double Ended Queue)

- Insert/Delete from both ends
- Can behave like Stack
- Can behave like Queue
- More flexible than Queue

Methods:
addFirst()
addLast()
removeFirst()
removeLast()
offerFirst()
offerLast()
peekFirst()
peekLast()

Special Stack Methods:
push()
pop()

Time Complexity:
add/remove at both ends -> O(1)
peek -> O(1)

Applications:
- Stack implementation
- Queue implementation
- Sliding Window Problems
- Browser History

 */