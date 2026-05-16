package part2;

public class Q8 {
	public static void main(String[] args) {
		int num = 1234;
		int finalRes = 1;
		while (num != 0) {
			int rem = num % 10;
			finalRes *= rem;
			num = num / 10;
		}
		System.out.println(finalRes);
	}
}

/*
factors means a divisor
🔍 For 20:

Start checking from 1 upward:

1 → 20 ÷ 1 = 20 → pair: (1, 20)
2 → 20 ÷ 2 = 10 → pair: (2, 10)
3 → not divisible
4 → 20 ÷ 4 = 5 → pair: (4, 5)

Now you reached √20 ≈ 4.47 → stop here

Factor → any divisor
Prime Factor → only prime numbers that multiply to give the number

Example factor of 18 => 1,2,3,6,9,18
        prime factor of 18 => 2,3,3
        => 2 X 3 X 3 = 18
*/