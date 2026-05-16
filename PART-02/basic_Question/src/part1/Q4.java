package part1;

public class Q4 {
	public static void main(String[] args) {
		int num = 5;
		int fact = 1;

		for (int i = 1 ; i <=num ; i++)
		{
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
/*
time complexity

| Complexity | How good it is    |
| ---------- | ----------------- |
| O(1)       | ⭐ Best (constant) |
| O(log n)   | Very fast         |
| O(n)       | Good              |
| O(n log n) | Acceptable        |
| O(n²)      | Slow              |
| O(2ⁿ)      | Very slow         |

 */