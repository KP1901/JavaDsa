package part1;

public class Q1 {


	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		int n = 7;


		for (int i = 0; i < n; i++) {
			System.out.print(n1 + " ");
			int temp = n1 + n2;
			n1 = n2;
			n2 = temp;
		}
	}

}

/*

n1 = 0
n2 = 1
n = 7

| Iteration | i | Printed | temp = n1 + n2 | n1 = n2 | n2 = temp |
| --------- | - | ------- | -------------- | ------- | --------- |
| 1         | 0 | 0       | 0 + 1 = 1      | 1       | 1         |
| 2         | 1 | 1       | 1 + 1 = 2      | 1       | 2         |
| 3         | 2 | 1       | 1 + 2 = 3      | 2       | 3         |
| 4         | 3 | 2       | 2 + 3 = 5      | 3       | 5         |
| 5         | 4 | 3       | 3 + 5 = 8      | 5       | 8         |
| 6         | 5 | 5       | 5 + 8 = 13     | 8       | 13        |
| 7         | 6 | 8       | 8 + 13 = 21    | 13      | 21        |

Final Output:
0 1 1 2 3 5 8

Sliding Variables Pattern ✅
 */
