package solid.liskov.substitution.principle;

public class Robot extends Animal {

	@Override
	public void eat() {
		System.out.println("The robot cannot eat");
	}
	
}
