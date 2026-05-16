package oops_04.encapsulation;

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student(1, 12, "rahul", "tina");
		System.out.println(s1.getName());
		s1.setAge(101);
		System.out.println(s1.getAge());
	}
}
