package solid.openandclosed.principle;

public class Circle implements Polygons {
	
	private double banKinh;
	
	@Override
	public double tinhDienTich() {
		return banKinh * banKinh * 3.14;
	}
	
}
