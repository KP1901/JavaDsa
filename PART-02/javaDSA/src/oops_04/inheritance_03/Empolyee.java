package oops_04.inheritance_03;

import javax.xml.namespace.QName;

public class Empolyee {

	protected String name;
	protected int empId;

	public Empolyee(String name, int empId) {
		this.name = name;
		this.empId = empId;
	}

	public void display() {
		System.out.println("Empolyee name :" + name + ", Employee Id :" + empId);
	}
}
