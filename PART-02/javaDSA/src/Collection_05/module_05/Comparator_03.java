package Collection_05.module_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_03 {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();

		Student s1 = new Student(25, "kiran", 175);
		Student s2 = new Student(20, "ajit", 175);
		Student s3 = new Student(21, "kaustubh", 175);

		students.add(s1);
		students.add(s2);
		students.add(s3);


//		way 1 -> anonymus class (creating comparator object directly)

//		Collections.sort(students, new Comparator<Student>() {
//			@Override
//			public int compare(Student a, Student b) {
//				return a.age - b.age;
//			}
//		});

//		way 2 -> separate comparator class

//		Collections.sort(students, new ageComparator());


//		way 3 -> lambda expression

		Collections.sort(students, (a, b) -> a.age - b.age);
		System.out.println(students);
	}
}
/*

COMPARATOR

- Used for custom sorting
- Sorting logic written outside class
- Present in java.util package
- Can create multiple sorting logics

Method:
compare()

Rules:
return 0   -> equal
return >0  -> swap
return <0  -> no swap

Syntax:
class MyComparator implements Comparator<Student>

Internal Working:
- Passed to Collections.sort()
- Used by TreeSet and PriorityQueue

Time Complexity:
Sorting -> O(n log n)

Applications:
- Custom sorting
- Multiple sorting conditions
- Sorting by name, age, marks, etc.
--------------------------------------------------------------------------------------

| Way             | Style          | Reusable  | Modern |
| --------------- | -------------- | --------- | ------ |
| Anonymous class | Old            | ❌         | ❌      |
| Separate class  | Clean reusable | ✅         | Medium |
| Lambda          | Short          | ❌ usually | ✅      |

 */