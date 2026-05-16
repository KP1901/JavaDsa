package Collection_05.module_05;

import java.util.Comparator;

public class ageComparator implements Comparator<Student> {

	public int compare(Student a, Student b) {
		return a.age - b.age;
	}
}
