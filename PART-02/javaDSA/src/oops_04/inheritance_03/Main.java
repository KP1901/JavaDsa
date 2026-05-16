package oops_04.inheritance_03;

public class Main {
	public static void main(String[] args) {
//		single inheritance

//		Developer d = new Developer("kiran", 1, "java");
//		d.show();


//	multiple inhertance achived by interfact

//		TechLead t = new TechLead("kiran", 101, "Proejct-x", 10);
//		t.displayInfo();

//		multi-level inheritance

		HRDirector hrD = new HRDirector("jay", 303);
		hrD.display();
		hrD.handleHRDuties();
		hrD.manageHRDep();
	}

}
