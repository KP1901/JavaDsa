package oops_04.basic;

public class Student {
	public int id;
	public int age;
	public String name;

	// default
//	public  Student(){
//		System.out.println("default ctor called");
//	}

	// parameterized
	public Student(int id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}

//	copy consructor

	public Student(Student studentObj) {
		this.id = studentObj.id;
		this.age = studentObj.age;
		this.name = studentObj.name;
	}

	public void study() {
		System.out.println(name + " Studying");
	}

	public void sleeping() {
		System.out.println(name + " Sleeping");
	}
}
