package oops_04.Inheritance_01;

public class MotorCycle extends Vehicle {
	public String handleBarStyle;
	public String suspensionType;

	public MotorCycle(String name, String model, int noOfTyres, String handleBarStyle, String suspensionType) {
		super(name, model, noOfTyres);
		this.handleBarStyle = handleBarStyle;
		this.suspensionType = suspensionType;
	}

	public void wheeli() {
		System.out.println("Motor cycle is doing wheelie " + name);
	}

}
