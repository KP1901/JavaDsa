package oops_04.inheritance_03;

public class HRDirector extends HRManager {

	public HRDirector(String name, int empId) {
		super(name, empId);
	}

	public void manageHRDep() {
		System.out.println("HR director manges hr department");
	}
}
