package oops_04.Abstraction_07;

abstract class Bird {
	public abstract void fly();

	public abstract void eat();

	public void greet() {
		System.out.println("Hello");
	}
}

/*
We use the parent class reference/interface (abstraction), while the actual
implementation is provided by the child class and hidden from the user.

Bird → rules / contract
Sparrow → implementation
User → uses Bird reference without caring about details
 */