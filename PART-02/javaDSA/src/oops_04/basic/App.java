package oops_04.basic;

public class App {
	public static void main(String[] args) {
//		default constructor
//		Student A = new Student();
//		manullay setting value
//		A.id = 1;
//		A.age = 23;
//		A.name = "ajit";
//		System.out.println(A.id);
//		System.out.println(A.age);
//		System.out.println(A.name);
//		A.study();
//		A.sleeping();
//
//		System.out.println(A.name);

//	parameterized constructor
		Student B = new Student(2, 24, "kiran");

//	parameterized constructor
		Student C = new Student(2, 24, "kiran");

//	copy constructor
		Student D= new Student(C);
		System.out.println(D.name);
	}
}

/*
Constructor is a special OOP feature used to prepare/initialize an object at the time of object creation.

Class = blueprint/template
Object = real thing created from class
Constructor = special method used to initialize the object when it is created

🔹 Why structure is designed like this?

Because constructors are made to:

-initialize object data
-set starting values
-avoid writing separate setter methods every time

Without constructor:

Student s = new Student();
s.id = 1;
s.name = "kiran";

With constructor:

Student s = new Student(1,"kiran");

Cleaner and safer.


*/