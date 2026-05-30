package Array_01;

import java.util.Scanner;

public class Array_01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// declaration + initialization (implicit / use here only)

		int arr[] = {1, 2, 3};

		// using new keyword (explicit / use anywhere )

		int ar1[] = new int[]{10, 20, 30};

		// If already allocated, assign values manually

		int ar2[] = new int[5];
		ar2[0] = 10;
		ar2[1] = 20;

		System.out.println(ar2[1]); // access index

		// loop over array using for loop
		for (int i = 0; i <= ar2.length - 1; i++) {
			System.out.println(ar2[i]);
		}

		// loop over array using for each loop

		for (int val : arr) {
			System.out.println(val);
		}
		// take user input

		int arr1[] = new int[5];

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("user input");
			arr1[i] = sc.nextInt();
		}

		for (int val : arr1) {
			System.out.println(val);
		}
	}
}
