package ops;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Student implements Comparable<Student> {
	public int id;
	public String name;
	public int age;

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + "'" +
				", age=" + age +
				'}';
	}


	@Override
	public int compareTo(@NotNull Student that) {
		if (this.age == that.age) {
			return this.name.compareTo(that.name);
		}
		return this.age - that.age;
	}
}
