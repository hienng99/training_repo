package solid.interfacesegregation.principle;

public class Circle implements Pow {
	
	private int r;

	@Override
	public int pow(int a, int b) {
		//Implement method
		return 1;
	}
	
	public double area() {
		return 3.14 * pow(r, 2);
	}

}
