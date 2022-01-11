package oop.abstraction;

public class Main {
	public static void main(String[] args) {
		Point p1 = new Point(2.5, 3.5);
		Point p2 = new Point( 4.0, 5.0);
		System.out.println("The distance from p1 to p2 is: " + p1.distance(p2));
	}
}
