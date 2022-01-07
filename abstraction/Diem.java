package oop.abstraction;

public class Diem { 
	
	private double x;
	private double y;
	
	public Diem(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double khoangCach(Diem a) {
		return Math.sqrt(Math.pow(a.x - this.x, 2) + Math.pow(a.y - this.y, 2));
	}
	
}
