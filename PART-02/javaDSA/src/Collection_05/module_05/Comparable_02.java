package Collection_05.module_05;
//custom sorting -> way 1

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable_02 {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();

		Student s1 = new Student(21, "kiran", 100);
		Student s2 = new Student(20, "ajit", 20);
		Student s3 = new Student(21, "kaustubh", 25);

		students.add(s1);
		students.add(s2);
		students.add(s3);

		Collections.sort(students);

		System.out.println(students);
	}
}

/*

COMPARABLE

- Used for natural sorting
- Sorting logic written inside class
- Present in java.lang package
- Used to sort custom objects

Method:
compareTo()

Rules:
return 0   -> equal
return >0  -> current object greater
return <0  -> current object smaller

Syntax:
class Student implements Comparable<Student>

Internal Working:
- Used by Collections.sort()
- Used by TreeSet and TreeMap

Time Complexity:
Sorting -> O(n log n)

Applications:
- Sorting custom objects
- Default object comparison
- Natural ordering
 */