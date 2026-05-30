package ops;

public interface Animal {

	//	nomral method
	void eat();

	//	default
	default void sleep() {
		System.out.println("animal slepeing");
	}
}
