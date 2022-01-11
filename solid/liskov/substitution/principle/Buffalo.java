package solid.liskov.substitution.principle;

public class Buffalo extends Animal {
	
	@Override
	public void eat() {
		System.out.println("The buffalo eats grass");
	}

}
