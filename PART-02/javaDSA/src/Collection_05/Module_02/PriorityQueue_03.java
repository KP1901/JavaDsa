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
offer()
poll()
peek()
add()
remove()

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
 */
