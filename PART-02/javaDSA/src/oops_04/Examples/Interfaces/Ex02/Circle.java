package oops_04.Examples.Interfaces.Ex02;

public class Circle implements Shape {

	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return 3.14 * radius * radius;
	}
}