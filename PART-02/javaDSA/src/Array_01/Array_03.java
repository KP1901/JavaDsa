package Array_01;

public class Array_03 {
	//	jagged array
	public static void main(String[] args) {
		int arr[][] = {{1, 2}, {4, 5, 6}, {7}, {10, 11, 12, 14}};

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}   
}

/*

A jagged array is a 2D array where each row can have a different number of elements.
Example: {{1, 2}, {3, 4, 5}, {6}}

arr[i] - gives particular column length as you reached
 */