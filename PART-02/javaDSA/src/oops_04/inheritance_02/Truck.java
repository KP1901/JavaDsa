package oops_04.inheritance_02;

import oops_04.Inheritance_01.Vehicle;

public class Truck extends Vehicle {
	public int noOfDoors;
	public String transmissionType;

	public Truck(String name, String model, int noOfTyres, int noOfDoors, String transmissionType) {
		super(name, model, noOfTyres);
		this.noOfDoors = noOfDoors;
		this.transmissionType = transmissionType;
	}

	public void startAc() {
		System.out.println("Ac started of " + name);
	}

}
