package Array_01;

public class Array_02 {
	private static int i;
	private static int[][] arr;

//	2d array -> array of array

	public static void main(String[] args) {
		int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
//		int arr[][] = new int[3][4];

//		System.out.println(arr[0][1]); // access element

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
