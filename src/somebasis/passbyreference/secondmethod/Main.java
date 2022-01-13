package somebasis.passbyreference.secondmethod;

public class Main {
	public static void main(String[] args) {
	 int number = 1;
	 
	 System.out.println("Number = " + number);
	 
	 number = update(number);
	 
	 System.out.println("Number = " + number);
	} 

	public static int update(int number) {       
		number++;
		return number; 
	}
}
