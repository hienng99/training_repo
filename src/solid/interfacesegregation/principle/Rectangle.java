package solid.interfacesegregation.principle;

public class Rectangle implements Mul {
	
	private int h;
	private int w;
	
	@Override
	public int mul(int a, int b) {
		//Implement method
		return 0;
	}
	
	public double area() {
		return mul(h, w);
	}

}
