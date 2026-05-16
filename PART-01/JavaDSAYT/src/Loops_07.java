public class Loops_07 {
	static void main(String[] args) {

//		1. for loop

		for (int i = 1; i <= 20; i = i + 2) {
			System.out.println(i);
		}

		//	2. nested loop

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print("x ");
			}
			System.out.println();
		}

//		3.while loop

		int a = 1;

		while (a <= 10) {
			System.out.println(a);
			a++;

		}

//		4.nested while loop
		int n1 = 1;

		while (n1 <= 2) {
			int j = 1;
			while (j <= 3) {
				System.out.println(n1 + " " + j);
				j++;
			}
			n1++;
		}

//		5. do while loop

		int age = 30;
		do {
			System.out.println(age);
			age = 40;
		} while (age == 30);

	}


}
