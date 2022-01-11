package solid.openandclosed.principle;

public class Circle implements Polygons {
	
	private double radius;
	
	@Override
	public double area() {
		return radius * radius * 3.14;
	}
	
}
