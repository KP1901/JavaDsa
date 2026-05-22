package part2;

import java.util.ArrayList;
import java.util.*;

public class Q47 {
	public static void main(String[] args) {

		int n = -6;
		int res = 0;
		int i = 0;

		int arr[] = new int[32];

		while (i < 32) {
			int bit = n & 1;
			arr[i] = bit;
			n = n >> 1;
			i++;
		}
		for (i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}
}

/*

BIT MANIPULATION NOTES

1. Extracting Last Bit

int bit = n & 1;

Purpose:
- extracts the rightmost bit (LSB)

Rules:
- even number -> 0
- odd number -> 1

Example:
110 & 001 = 0
111 & 001 = 1


2. Right Shift

n = n >> 1;

Purpose:
- shifts all bits one position to the right

Example:
110 -> 011

6 >> 1 = 3


3. Important Order

Using:
n & 1

extracts bits in:
LSB -> MSB

Example:
Actual binary:
110

Extracted order:
0 1 1

(reverse order)


4. Why Array is Used

arr[i] = bit;

stores extracted bits.

Then print backward:
for(i = arr.length - 1; i >= 0; i--)

Result:
MSB -> LSB

Correct binary obtained.


5. Negative Numbers in Java

Java stores negatives using:
2's Complement

For -6:

Positive 6:
00000110

Flip bits:
11111001

Add 1:
11111010

So binary of -6:
11111111111111111111111111111010


6. Signed Right Shift (>>)

For negative numbers:
>>

fills left side with 1.

Example:
11111010 -> 11111101

Sign remains negative.


7. Why Loop Runs 32 Times

Java int always contains:
32 bits

So:
while(i < 32)

prints all bits.


8. Complexity

Time:
O(32)

Space:
O(32)

Effectively constant.


9. Final Learning

This problem teaches:
- & operator
- bit extraction
- right shift
- negative binary representation
- 2's complement
- reversing bit order
- signed shift behavior
 */

