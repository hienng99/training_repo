package controlflow.conditionstatements.ifstatement;

public class Main {
	
public static void main(String[] args) {
		
		//If statement
		int age = 8;
		String result;
		
		if(age < 18) {
			result = "Child";
		}
		else {
			result = "Adult";
		}
		System.out.println(result);
		
		//Ternary if statement
		result = (age < 18) ? (true) ? "a" : "b" : "Adult";
		System.out.println(result);
		
	}

}
