package ops;

public class Developer extends Empolyee {
	int bouns;

	Developer(String name, int baseSalary, int bouns) {
		super(name, baseSalary);
		this.bouns = bouns;
	}

	int calculateSalary() {
		return this.baseSalary + this.bouns;
	}
}
