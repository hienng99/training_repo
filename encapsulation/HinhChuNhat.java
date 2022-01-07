package oop.encapsulation;

public class HinhChuNhat {
	
	private int height;
	private int width;
	
	public HinhChuNhat(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	public int tinhDienTich() {
		return this.height * this.width;
	}
	
}
