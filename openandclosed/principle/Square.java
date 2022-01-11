package solid.openandclosed.principle;

public class Square implements Polygons{
	
	private double side;
	
	@Override
	public double area() {
		return side * side;
	}
	
}
