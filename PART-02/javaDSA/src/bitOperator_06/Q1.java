package bitOperator_06;

//Question 1 — Check Even or Odd Using Bit Operator
public class Q1 {
	public static void main(String[] args) {

		int n = 7;

		if ((n & 1) == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
}
/*

Idea :

- Every odd number ends with 1 in binary
- Every even number ends with 0 in binary
- So extract the last bit using: n & 1
- If result is 0 → Even
- Else → Odd

Algorithm :

1. Take number n
2. Extract last bit:
   n & 1
3. Check result:
   - If result == 0
       print "Even"
   - Else
       print "Odd"

       | Step | Work                     | Result        |
| ---- | ------------------------ | ------------- |
| 1    | Take number `n`          | `7`           |
| 2    | Binary of `7`            | `0111`        |
| 3    | Perform `n & 1`          | `0111 & 0001` |
| 4    | Result after AND         | `0001`        |
| 5    | Is result equal to `0` ? | `No`          |
| 6    | Final Answer             | `Odd`         |

 */