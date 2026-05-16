package oops_04.inheritance_03;

public class Developer extends Empolyee {
	private String progamLanguage;

	public Developer(String name, int empId, String progamLanguage) {
		super(name, empId);
		this.progamLanguage = progamLanguage;
	}

	public void show() {
		display();
		System.out.println("Specilization dev Pro lang : " + progamLanguage);
	}
}