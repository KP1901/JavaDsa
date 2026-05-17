package part1;

public class Q5 {
	public static void main(String[] args) {
		int n = 1634;
		int temp1 = n;
		int original = n;
		int count = 0;
		int sum = 0;

		while (n != 0) {
			count++;
			n = n / 10;
		}

		while (temp1 != 0) {
			int rem = temp1 % 10;
			int cube = 1;

//			for (int i = 1; i <= count; i++) {
//				cube *= rem;
//			}
			cube = (int) Math.pow(rem, count);
			sum = sum + cube;
			temp1 = temp1 / 10;

		}

		if (sum == original) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");

		}
	}
}

/*

Time Complexity Comparison
----------------------------

| d   | O(d) | O(d log d) | O(d²)  |
|-----|------|-------------|---------|
| 10  | 10   | ~30         | 100     |
| 100 | 100  | ~664        | 10,000  |


--------------------------------------------

Example:
d = 100


Step 1: Understand log

log₂(100)

means:

“2 raised to what power gives 100?”


We know:

2⁶ = 64
2⁷ = 128


So:

log₂(100) ≈ 6.64


--------------------------------------------

Step 2: Calculate O(d log d)

Formula:

d × log₂(d)


Put d = 100

100 × 6.64
≈ 664 operations


So:

O(100 log 100) ≈ 664


--------------------------------------------

Final Observation

O(d)        → Fastest
O(d log d) → Efficient
O(d²)       → Much slower


That is why algorithms like:

- Merge Sort
- Heap Sort
- Quick Sort (average)

use:

O(n log n)

instead of:

O(n²)
------------------------------------------------------------------------

This is related to:

How fast an algorithm grows
when input size increases.


Main Purpose:
----------------

To compare algorithm efficiency.


Example:

Suppose we have 100 elements.


Algorithm 1:
O(n)

does about:
100 operations


Algorithm 2:
O(n log n)

does about:
664 operations


Algorithm 3:
O(n²)

does about:
10,000 operations


So the conclusion is:

Some algorithms become extremely slow
as data increases.


That is why:

O(n) and O(n log n)

are considered efficient,

while:

O(n²)

becomes slow for large inputs.


This concept helps us:

- choose better algorithms
- optimize code
- avoid slow solutions in DSA

---------------------------------------------------------------------------------------------------

It is related through:

Time Complexity Analysis


Your Armstrong Solution
-------------------------

while(n != 0)
→ counts digits

Complexity:
O(d)


while(temp1 != 0)
→ runs for every digit

Inside it:

Math.pow(rem, count)

approximately constant for this discussion


So overall:

O(d)


--------------------------------------------

Old Version
-------------

You previously used:

for(int i = 1; i <= count; i++)

inside:

while(temp1 != 0)


That created:

Outer loop  → O(d)
Inner loop  → O(d)


Total:

O(d²)


--------------------------------------------

Connection with Your Notes
----------------------------

Your notes explain:

How algorithm speed changes
when complexity changes.


Your Armstrong example directly shows this.


Old Armstrong Code:
O(d²)

Optimized Armstrong Code:
O(d)


Meaning:
----------

As digits increase:

O(d²) grows much faster
than O(d)


Example:

d = 100


O(d)
→ 100 operations


O(d²)
→ 10,000 operations


So optimization matters.


--------------------------------------------

Final Connection
------------------

Your notes are the THEORY.

Your Armstrong program is the PRACTICAL example
of reducing:

O(d²) → O(d)
----------------------------------------

Complexity here depends on:

d = number of digits

Example :
n = 123;
d = 3

O(d²)= O(3²) = 9 operations (approx)
O(d) = O(3) =3 opeations (approx)
*/
