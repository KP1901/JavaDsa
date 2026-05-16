package oops_04.inheritance_03;

public class HRManager extends Empolyee {

	public HRManager(String name, int empId) {
		super(name, empId);
	}

	public void handleHRDuties() {
		System.out.println("HR manager handling human resources duties");
	}
}
