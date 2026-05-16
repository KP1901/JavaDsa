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
Initial:
n1 = 0
n2 = 1


Iteration 0:
print 0

temp = 0 + 1 = 1
n1 = 1
n2 = 1


Iteration 1:
print 1

temp = 1 + 1 = 2
n1 = 1
n2 = 2


Iteration 2:
print 1

temp = 1 + 2 = 3
n1 = 2
n2 = 3


Iteration 3:
print 2

temp = 2 + 3 = 5
n1 = 3
n2 = 5


Iteration 4:
print 3

temp = 3 + 5 = 8
n1 = 5
n2 = 8


Iteration 5:
print 5

temp = 5 + 8 = 13
n1 = 8
n2 = 13


Iteration 6:
print 8

temp = 8 + 13 = 21
n1 = 13
n2 = 21


Final Output:
0 1 1 2 3 5 8

Sliding Variables Pattern ✅
 */
