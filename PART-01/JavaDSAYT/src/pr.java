class Studen {
	static int count = 0;
	String name;
}


public class pr {
	static int count = 0;
	String name;

	void greet() {
		int age = 30; // local variable
	}

	static void main(String[] args) {
		System.out.println(count);

		pr p1 = new pr();
		p1.name = "ajit";
		System.out.println(p1.name);
		System.out.println(p1.count);

		pr p2 = new pr();
		p2.name = "kiran";
		System.out.println(p2.name);
		System.out.println(p2.count);
	}
}
