package oops_04.Abstraction_07;

abstract class Bird {
	public abstract void fly();

	public abstract void eat();
}

class Sparrow extends Bird {
	public void fly() {
		System.out.println("sparrow flying");
	}

	public void eat() {
		System.out.println("sparrow eating");

	}
}

public class Main {
	public static void main(String[] args) {
		Sparrow s = new Sparrow();
		s.fly();

	}
}
