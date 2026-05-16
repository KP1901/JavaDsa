package Collection_05.Module_03;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_03 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(40);
		set.add(30);
		set.add(20);

		System.out.println(set);
	}
}
/*

TREESET

- Stores unique elements
- No duplicates allowed
- Elements stored in sorted order
- Does not maintain insertion order
- Null values not allowed

Internal Working:
- Red-Black Tree (Self Balancing BST)

Methods:
first()
last()
higher()
lower()
ceiling()
floor()
pollFirst()
pollLast()

Time Complexity:
add      -> O(log n)
remove   -> O(log n)
contains -> O(log n)

Applications:
- Sorted unique data
- Range operations
- Leaderboards
- Ranking systems
---------------------------------------------------------------------------

========================
RED-BLACK TREE NOTES
========================

1) What is Red-Black Tree?
---------------------------

A Red-Black Tree is a:

    Self-Balancing Binary Search Tree (BST)

Used internally in:
- TreeSet
- TreeMap

Purpose:
- Keep data sorted
- Keep tree balanced
- Make searching/insertion/deletion fast


2) BST Rule
------------

    Left < Root < Right

Example:

          20
         /  \
       10    30


3) Problem with Normal BST
---------------------------

Insertion:

    10, 20, 30, 40

Normal BST becomes:

    10
      \
       20
          \
           30
              \
               40

Looks like linked list.

Searching becomes:

    O(n)


4) Solution → Self Balancing
-----------------------------

Red-Black Tree automatically balances the tree.

Balanced tree:

            20
           /  \
         10    30
                  \
                   40

Height stays small.

Operations become:

    O(log n)


5) Node Structure
------------------

Each node stores:

class Node {
    int data;
    Node left;
    Node right;
    Node parent;
    boolean color;
}


6) Colors
-----------

Each node has:
- RED
- BLACK

Example:

        20(B)
       /    \
    10(R)  30(R)


7) Important Rules
-------------------

RULE 1:
--------
Root is always BLACK.


RULE 2:
--------
Red node cannot have red child.

Invalid:

    10(R)
       \
       20(R)


RULE 3:
--------
Every path must have same number of BLACK nodes.

This helps maintain balance.


8) Rotation
------------

Rotation means:

    Rearranging nodes without breaking BST rule


9) Left Rotation
-----------------

Before:

    10
      \
       20
          \
           30

After Left Rotation:

         20
        /  \
      10    30


10) Right Rotation
-------------------

Before:

            30
           /
         20
        /
      10

After Right Rotation:

          20
         /  \
       10    30


11) Example Insertion
----------------------

Insert:

    10, 20, 30


STEP 1:
--------

    10(B)


STEP 2:
--------

    10(B)
       \
       20(R)


STEP 3:
--------

    10(B)
       \
       20(R)
            \
            30(R)

Problem:
- Red parent
- Red child

So:
- Left Rotation
- Recoloring

Final Tree:

          20(B)
         /    \
      10(R)  30(R)


12) Internal Working
---------------------

Red-Black Tree uses:
- BST insertion
- Recoloring
- Rotations
- Pointer/reference changes

No data shifting happens.

Only node references change.


13) Time Complexity
--------------------

add()       -> O(log n)
remove()    -> O(log n)
contains()  -> O(log n)


14) Used In
------------

TreeSet       -> Red-Black Tree
TreeMap       -> Red-Black Tree
PriorityQueue -> Heap
HashSet       -> Hash Table


15) Easy Memory Trick
----------------------

Normal BST
→ Can become tall and slow

Red-Black Tree
→ Automatically balanced
→ Fast operations
----------------------------------------------------------------------------------------------------

Main Tree Types in DSA

| Tree                     | Purpose                  |
| ------------------------ | ------------------------ |
| Binary Tree              | Basic tree structure     |
| Binary Search Tree (BST) | Fast searching           |
| AVL Tree                 | Strictly balanced BST    |
| Red-Black Tree           | Self-balancing BST       |
| Heap Tree                | PriorityQueue            |
| Trie                     | String searching         |
| Segment Tree             | Range queries            |
| Fenwick Tree (BIT)       | Prefix sums              |
| B-Tree                   | Databases/File systems   |
| B+ Tree                  | Databases                |
| N-ary Tree               | Multiple children        |
| Expression Tree          | Expressions/calculations |

 */