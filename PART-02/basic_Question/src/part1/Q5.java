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

*
| d   | O(d) | O(d log d) | O(d²)  |
| --- | ---- | ---------- | ------ |
| 10  | 10   | ~30        | 100    |
| 100 | 100  | ~700       | 10,000 |

d = 100;

2^ 6 = 64
2^ 7 = 128

so

log2(100) approcx 6.64

-------------------------------------------

🔹 Key idea of log

log2(100) => ?

means:

“2 raised to what power gives 100?”

🔹 Step 1: Find log₂(100)

We know:

2^6 = 64
2^7 = 128

So:

log2 (100)≈6.64

🔹 Step 2: Multiply

d X logd=100 X6.64 ≈664 steps

🔥 Final Answer : O(100log100)≈664

*/
