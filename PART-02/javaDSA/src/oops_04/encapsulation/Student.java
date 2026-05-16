package oops_04.encapsulation;

public class Student {
	private int id;
	private int age;
	private String name;
	private String gf;
	public Student(int id, int age, String name, String gf) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.gf = gf;
	}
	private void gfChating() {
		System.out.println(name + " ghChatting");
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		if (age < 100) {
			this.age = age;
		}
	}
	public int getAge() {
		return this.age;
	}
}

/*
for perfect encapsulation we use a getter and settter so we can access data outside world
access through layer(methods)

encapsulation - bind all attribute and behaviour in one entity so outer world cant access
data directly
*/
