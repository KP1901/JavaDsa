package Collection_05.Module_02;

import java.util.PriorityQueue;

public class PriorityQueue_03 {

	public static void main(String[] args) {
		PriorityQueue<Integer> p = new PriorityQueue<>();
		p.add(6);
		p.add(1);
		p.add(2);
		p.add(3);
		p.add(5);

		System.out.println(p);

//		poll -> remove top/highest priorty element
//		p.poll();
		System.out.println(p);

	}

}
/*

Notes :

PRIORITYQUEUE

- Elements stored based on priority
- Default: Min Heap
- Smallest element comes first
- Does not maintain insertion order
- Duplicate elements allowed
- Null values not allowed

Internal Working:
- Binary Heap

Methods:
add()
offer()
poll() -> remove high priority element
peek() -> view highest priority element
remove() ->remove head element
element() -> view head element

Time Complexity:
offer -> O(log n)
poll  -> O(log n)
peek  -> O(1)

Applications:
- CPU Scheduling
- Dijkstra Algorithm
- Task Scheduling
- Heap Operations
-----------------------------------------------------------------------------------------------
Notes :

BINARY TREE

- Hierarchical Data Structure
- Each node can have at most 2 children
- Left Child and Right Child
- Root node is top node

Terminology:
- Root
- Parent
- Child
- Leaf Node
- Height
- Depth
- Subtree

Traversals:
- Preorder  -> Root Left Right
- Inorder   -> Left Root Right
- Postorder -> Left Right Root
- Level Order -> Level by Level

Time Complexity:
Traversal -> O(n)
Search    -> O(n)

Applications:
- Expression Trees
- Hierarchical Data
- File Systems
- Binary Search Tree base
--------------------------------------------------------------------------'

Height of binary heap is log n

            1  -> 1 node
          /   \
         2     3 - 2 node
       /  \   /  \
      4   5  6   7 - 4 node

Level 0 -> 1 node
Level 1 -> 2 nodes
Level 2 -> 4 nodes
Level 3 -> 8 nodes
Level 4 -> 16 nodes

-------------------------------------------------------------

Priority Queue
      ↓ implemented by
     Heap
      ↓
Complete Binary Tree
      ↓
Stored in Array

-------------------------------------------------------------

PriorityQueue internally uses a Heap (Min Heap by default in Java) and
automatically performs all the heap operations (insert, swap, re-heapify) for you.

You only call add(), peek(), and poll(); Java maintains the heap structure behind the scenes,
so you don't manually build or balance the heap tree.

Example

PriorityQueue<Integer> p = new PriorityQueue<>();

p.add(6);
p.add(1);
p.add(2);
p.add(3);
p.add(5);

Add 6
6
Array:
[6]

Add 1

Insert at end:
  6
 /
1

Now heap property is violated because parent > child.

Swap 1 and 6:

  1
 /
6

Array:
[1, 6]

Add 2

Insert at end:
    1
   / \
  6   2

Since 1 < 2, no swap.

Array:
[1, 6, 2]

Add 3

Insert:
      1
     / \
    6   2
   /
  3

Compare with parent 6.

3 < 6 ⇒ swap
      1
     / \
    3   2
   /
  6

Array:
[1, 3, 2, 6]

Add 5

Insert:
      1
     / \
    3   2
   / \
  6   5

Compare with parent 3.

5 > 3 ⇒ no swap.

Final heap:
      1
     / \
    3   2
   / \
  6   5

Array representation:
[1, 3, 2, 6, 5]
-------------------------------------------------------------

Data Structures
│
├── Linear
│   ├── Array
│   ├── Linked List
│   ├── Stack
│   └── Queue
│
└── Non-Linear
    ├── Tree
    │   ├── BST
    │   ├── AVL
    │   └── Heap
    │
    └── Graph
 */
