package ops;

public class Manager extends Empolyee {
	int incentive;

	Manager(String name, int baseSalary, int incentive) {
		super(name, baseSalary);
		this.incentive = incentive;
	}

	int calculateSalary() {
		return this.baseSalary + this.incentive;
	}
}
