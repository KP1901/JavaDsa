package oops_04.inheritance_02;

public class Main {
	public static void main(String[] args) {

		Truck t = new Truck("TaTa", "L30", 8, 2, "power");
		System.out.println(t.name);
		t.startEngine();
		t.startAc();
		t.stopEngine();
	}
}
