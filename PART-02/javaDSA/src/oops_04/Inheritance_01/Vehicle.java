package oops_04.Inheritance_01;

public class Vehicle {
	public String name;
	public String model;
	public int noOfTyres;

	public Vehicle(String name, String model, int noOfTyres) {
		this.name = name;
		this.model = model;
		this.noOfTyres = noOfTyres;
	}

	public void startEngine() {
		System.out.println("Engine is Starting " + name + ":" + model);
	}

	public void stopEngine() {
		System.out.println("Engine is Stopping " + name + ":" + model);
	}
}
