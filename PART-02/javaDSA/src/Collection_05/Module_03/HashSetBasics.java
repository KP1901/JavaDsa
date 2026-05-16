package Collection_05.Module_03;

import java.util.HashSet;

public class HashSetBasics {
	public static void main(String[] args) {
		HashSet<Student> s = new HashSet<>();

		Student s1 = new Student(1, "Babbar");
		Student s2 = new Student(1, "Babbar");
		Student s3 = new Student(1, "Babbar");

		s.add(s1);
		s.add(s2);
		s.add(s3);

		System.out.println(s);
	}
}
/*
For custom objects, we override equals() and hashCode()
so objects are compared based on their data instead of memory address.
 */