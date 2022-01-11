package solid.liskov.substitution.principle;

public class Dog extends Animal {
	
	@Override
	public void eat() {
		System.out.println("The dog eats bone");
	}
	
}
