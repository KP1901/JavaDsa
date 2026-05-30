package Array_01;

import java.util.Scanner;

public class Array_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = {
				new int[2],
				new int[5],
				new int[10],
				new int[1]
		};

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("input for " + i + " " + j);
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
