package oops_04.polymorphism_05;

public class Main {
	public static void main(String[] args) {
		Shape s = new Rect();
		s.draw();

		Shape s1 = new Circle();
		s1.draw();

	}
}
