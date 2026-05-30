package oops_04.Examples.Interfaces.Ex04;

public interface Animal {

	//	nomral method
	void eat();

	//	default (optional to override)
	default void sleep() {
		System.out.println("animal slepeing");
	}
}
