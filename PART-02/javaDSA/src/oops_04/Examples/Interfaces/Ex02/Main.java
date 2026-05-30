package oops_04.Examples.Interfaces.Ex02;

//Task 2: Interface with Different Implementations — Shape Area Calculator


public class Main {

	public static void main(String[] args) {

		Shape s1 = new Circle(4);
		Shape s2 = new Rectangle(5, 2);

		System.out.println(s1.area());
		System.out.println(s2.area());
	}
}