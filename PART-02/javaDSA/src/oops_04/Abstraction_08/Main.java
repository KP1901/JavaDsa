package oops_04.Abstraction_08;

interface Bird {
	void fly();

	void eat();

}

class Sparrow implements Bird {
	public void fly() {
		System.out.println("Sparrow Flying");
	}

	public void eat() {
		System.out.println("Sparrow Eating");

	}
}


class Crow implements Bird {
	public void fly() {
		System.out.println("Crow Flying");
	}

	public void eat() {
		System.out.println("Crow Eating");
	}
}


public class Main {

	public static void doBirdStuff(Bird b) {
		b.fly();
		b.eat();
	}

	public static void main(String[] args) {
//		Sparrow s = new Sparrow();
//		s.eat();
//		s.fly();
//
//		Crow c = new Crow();
//		c.eat();
//		c.fly();

		doBirdStuff(new Sparrow());
		doBirdStuff(new Crow());
	}
}

/*

| Feature              | Abstract Class                             | Interface                                                                                      |
| -------------------- | ------------------------------------------ | ---------------------------------------------------------------------------------------------- |
| Instantiation        | Cannot be instantiated directly            | Cannot be instantiated                                                                         |
| Method Types         | Can have abstract + concrete methods       | Before Java 8 → only abstract methods. After Java 8 → default, static, private methods allowed |
| Constructor          | Can have constructors                      | Cannot have constructors                                                                       |
| Variables / Fields   | Can have normal variables                  | Variables are public static final by default                                                   |
| Access Modifiers     | Methods can be public, protected, private  | Methods are public by default                                                                  |
| Inheritance          | A class can extend only one abstract class | A class can implement multiple interfaces                                                      |
| Keyword              | `extends`                                  | `implements`                                                                                   |
| Object State         | Can store object state                     | Mainly used for behavior/contracts                                                             |
| Use Case             | Common base class with shared code         | Rules/capabilities for classes                                                                 |
| Example              | `Vehicle`, `Animal`                        | `Runnable`, `Serializable`, `Comparable`                                                       |
| Relationship         | IS-A                                       | CAN-DO                                                                                         |
| Speed                | Slightly faster sometimes                  | Slightly slower due to abstraction layer                                                       |
| Multiple Inheritance | Not possible                               | Possible through multiple interfaces                                                           |


*/