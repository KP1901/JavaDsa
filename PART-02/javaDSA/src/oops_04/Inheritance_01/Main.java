package oops_04.Inheritance_01;

import oops_04.inheritance_02.Truck;

public class Main {
	public static void main(String[] args) {
		Car c = new Car("maruti", "800", 4, 5, "automatic");
		System.out.println(c.name);
		c.startEngine();
		c.startAc();
		c.stopEngine();

		MotorCycle m = new MotorCycle("Splender", "Xline", 2, "U", "Soft");
		m.startEngine();
		m.wheeli();
		m.stopEngine();

		Truck t = new Truck("TaTa", "L30", 8, 2, "power");
		t.startEngine();
		t.startAc();
		t.stopEngine();
	}
}
