package solid.openandclosed.principle;

public class Rectangle implements Polygons{
	
	private double canh;
	
	@Override
	public double tinhDienTich() {
		return canh * canh;
	}
	
}
