class Student {
	String name; // instance variable (have own copies for each object)
	static String college = "ABC"; // static variable (have same copies for all object)
}

public class variable_03 {

	static int a = 20;
	int b = 50;

	void greet() {
		int num = 1; // local variable
		System.out.println(num);
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Kiran";

		Student s2 = new Student();
		s2.name = "Rahul";

		System.out.println(s1.college);
		System.out.println(s2.college);
//		System.out.println(num);
		System.out.println(a);

		variable_03 v = new variable_03();
		v.greet();
		System.out.println(v.b);
		System.out.println(Student.college);


	}
}

/*

If you mean outside the class (in another class), then:
-static members → access using ClassName
-non-static members → create object of that class


If you mean inside the class, then:
static members → can be accessed directly
non-static members → need object creation

*/