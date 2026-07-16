package oops_04.polymorphism_04;

public class Main {
	public static void main(String[] args) {

//		method overloading (compile time polymorphism)

		Calculator ca = new Calculator();
		int res1 = ca.add(2, 3);
		int res2 = ca.add(2, 3, 5);
		System.out.println(res1);
		System.out.println(res2);

//		runtime polymorphism (decides which method runs at the run time if Circle class dont have
//		draw method then Parent method is run) (method overriding)
		Circle c = new Circle();
		c.draw();

		React r = new React();
		r.draw();

		Shape s = new Circle();
		doDrawingStuff(s);
//		s.draw();
	}

	public static void doDrawingStuff(Shape s) {
		s.draw();
	}
}

/*

Clean Flow :

Method Overloading :
Same method name + different parameters
add(2,3)
add(2,3,5)
→ Compile Time

Method Overriding :
Parent and child have same method
draw()
→ Runtime decides which method runs

---------------------------------------------------
Visual Flow :

Compile Time
ca.add(2,3);

Compiler checks:
Which add method has 2 arguments?

FOUND:
add(int a, int b)
Decision made BEFORE execution.

Runtime
Shape s = new Circle();
s.draw();

During execution Java checks:

Actual object = Circle
So:
Circle draw()
runs.

--------------------------------------------------------------------------------------

Upcasting means:
-Storing a child class object inside a parent class reference variable.
-it helps to achieve run time polymorphism

Why Do We Use Upcasting?
Because it helps achieve:
Runtime Polymorphism
Example:

Shape s = new Circle();
s.draw();

Output:
Drawing Circle

Even though reference is Shape,
Java runs Circle method.

Why?
Because actual object is:
new Circle()
Runtime checks actual object.

-------------------------------------------------------------------------------------


  Method Overriding — Short Notes

  - A child class provides its own version of a parent class method.
  - Method name and parameters must be the same.
  - It is runtime polymorphism — JVM decides which method to run based on the actual object.

   Parent obj = new Child();

   obj.show();  // Child's show() runs

   Remember:
   Overloading → compiler decides.
   Overriding → JVM decides at runtime.

   Remember:
   static → reference type decides.
   Non-static overridden method → actual object decides.

   A child class overrides an inherited non-static method of the parent class by providing
   its own implementation with the same method signature.

   Overriding = Inheritance + Same non-static method signature + Child's own implementation + Runtime polymorphism
*/