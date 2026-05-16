package pattern_08;

public class p7 {
	static void main(String[] args) {
//	hollow square

//		cell by cell
		int n1 = 4;
		int n2 = 6;

//		for (int row = 1; row <= n1; row++) {
//			for (int col = 1; col <= n2; col++) {
//				if (row == 1 || row == n1) {
//					System.out.print("* ");
//				} else {
//					if (col == 1 || col == n2) {
//						System.out.print("* ");
//					}
//					else{
//						System.out.print("  ");
//					}
//				}
//			}
//			System.out.println();
//		}

//  row by row
		for (int row = 1; row <= n1; row++) {
			if (row == 1 || row == n1) {
				for (int col = 1; col <= n2; col++) {
					System.out.print("* ");
				}
			} else {
				System.out.print("* ");
				for (int col = 1; col <= n2 - 2; col++) {
					System.out.print("  ");
				}
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
/*

| Factor               | Approach 1 ❌       | Approach 2 ✅       |
| -------------------- | ------------------ | ------------------ |
| Thinking             | Cell-by-cell       | Row-by-row         |
| Conditions           | Many (inside loop) | Few (outside loop) |
| Readability          | Medium             | High               |
| Optimization         | Slightly worse     | Better             |
| Interview Impression | Basic              | Strong             |

✅ Correct Strategy (Golden Rule)

👉 Step 1: Try row-by-row (structure thinking)
👉 Step 2: If structure is not clear → go cell-by-cell

* */

