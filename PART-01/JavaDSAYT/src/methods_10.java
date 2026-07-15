public class methods_10 {

	// 6 : global scope
	static int value = 2;

	// 1 : basic function without parameter
	static void greet() {
		System.out.println("Hello I am kiran");
	}

	// 2 : basic function with parameter

	static void count(int num) {
		System.out.println("Hello I " + num);
	}

	// 3 : basic function with return type & parameter

	static int score(int marks) {
		return marks * 10;
	}

	// 4 : method overloading

	static float add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	// 5 : call by value

	static void solve(int num) { //  call by value (this num different memory address)
		System.out.println(num);
		num = num * 10;
		System.out.println(num);
	}

	// 6 : methods scope

	static void printMultiples() {
		int value = 20; // value have only scope inside this curly braces
	}

	static void main(String[] args) {
		System.out.println("Hi");
		greet();
		count(10);
		int res1 = score(20);
		System.out.println(res1);
		System.out.println(add(10, 20));
		System.out.println(add(10, 20, 30));
		System.out.println();
		int num = 5;
		System.out.println(num);
		solve(num); // call by value (this num different memory address)
		System.out.println(num);
		System.out.println(value);
	}
}

/*

call by value :

- Primitive: Java passes a copy of the value.
  Changing the copy does not affect the original.

- Non-primitive: Java passes a copy of the reference.
  Both references point to the same object, so changing the object's data affects the original object.

  Method Overloading — Short Notes
  - Same method name with different parameters.
  - Parameters can differ by number, type, or order.
  - Return type alone cannot overload a method.
  - It is compile-time polymorphism — the compiler decides which method to call based on the arguments.

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