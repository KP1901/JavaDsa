package ops;

import Collection_05.Module_03.LinkedHashSet_02;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();

		Student s1 = new Student(21, "kiran", 50);
		Student s2 = new Student(20, "ajit", 100);
		Student s3 = new Student(21, "kaustubh", 20);

		students.add(s1);
		students.add(s2);
		students.add(s3);

		Collections.sort(students);

		System.out.println(students);
	}


}
