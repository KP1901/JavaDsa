package Collection_05.module_05;


public class Student implements Comparable<Student> {
	public int age;
	public String name;
	public int weight;


	@Override
	public String toString() {
		return "Student{" +
				"age=" + age +
				", name='" + name + '\'' +
				", weight=" + weight +
				'}';
	}

	public Student(int age, String name, int weight) {
		this.age = age;
		this.name = name;
		this.weight = weight;
	}

	public int compareTo(Student that) {
		if (this.age == that.age) {
			return this.name.compareTo(that.name);
		}
		return this.age - that.age;

	}


}
