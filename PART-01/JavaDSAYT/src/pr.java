class Animal {
	static void info() {
		System.out.println("it give information about animal");
	}
}


class Cat extends Animal {
	static void info() {
		System.out.println("this is Cat");
	}
}

class Dog extends Animal {
	static void info() {
		System.out.println("this is Dog");
	}
}


public class pr {
	static void main(String[] args) {

		Animal a = new Cat();
		a.info();
	}
}