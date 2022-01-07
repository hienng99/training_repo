package oop.abstraction;

public class Main {
	public static void main(String[] args) {
		Diem diemA = new Diem(2.5, 3.5);
		Diem diemB = new Diem( 4.0, 5.0);
		System.out.println("Khoang cach tu A toi B la: " + diemA.khoangCach(diemB));
	}
}
