package Collection_05.Module_03;

import java.util.Objects;

public class Student {

	public int rollNo;
	public String name;

	//  It converts an object into a String representation of that object.
	@Override
	public String toString() {
		return "Student{" + "rollNo. = " + rollNo + ",name= '" + name + "'}";
	}


	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return rollNo == student.rollNo;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(rollNo);
	}

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
}
