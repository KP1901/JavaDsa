public class Conditionals_06 {
	static void main(String[] args) {
//		if
		int score = 30;

		if (score > 18) {
			System.out.println("score is above 18");
		}

// if else
		int age = 30;

		if (age > 18) {
			System.out.println("you are eligible to vote");
		} else {
			System.out.println("You are not eligible to vote");
		}

//		if else if

		int total = 40;

		if (total == 30) {
			System.out.println("pattern_09");
		} else if (total == 35) {
			System.out.println("bye");
		} else if (total == 40) {
			System.out.println("ji");
		} else {
			System.out.println("pattern_09");
		}

//		nested if else

		boolean isLoggedIn = true;
		int solvedProblems = 220;

		if (isLoggedIn) {
			if (solvedProblems > 200) {
				System.out.println("Unlock");
			} else {
				System.out.println("Practice more");
			}
		} else {
			System.out.println("upgrade to premium");
		}

//		ternary operator

		int amount = 100;
		String result = amount > 60 ? "amount is above 50" : "amount is below 50";
		System.out.println(result);

//		switch statement

		/*
		Basic Syntax
switch(expression) {

    case value1:
        // code
        break;

    case value2:
        // code
        break;

    default:
        // code

        Conditions/ranges → if-else
		Fixed exact values → switch
}
*/
		int day = 2;

//		basic
		switch (day) {

			case 1:
				System.out.println("Monday");
				break;

			case 2:
				System.out.println("Tuesday");
				break;

			case 3:
				System.out.println("Wednesday");
				break;

			default:
				System.out.println("Invalid Day");
		}

// multiple case together

		char ch = 'a';

		switch (ch) {

			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("Vowel");
				break;

			default:
				System.out.println("Consonant");
		}


	}
}
