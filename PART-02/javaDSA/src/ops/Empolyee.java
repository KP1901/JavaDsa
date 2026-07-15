package ops;

public class Empolyee {
	String name;
	int baseSalary;

	Empolyee(String name, int baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
	}

	int calculateSalary() {
		return this.baseSalary;
	}
}
