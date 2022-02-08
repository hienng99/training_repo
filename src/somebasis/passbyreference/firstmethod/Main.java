package somebasis.passbyreference.firstmethod;

import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		 MyNumber object = new MyNumber();
		
		 out.println("Number = " + object.number);
		 
		 update(object);
		 
		 out.println("Number = " + object.number);
		 
		 int i2 = 2;
		 updatePrimitive(i2);
	} 
	
	 public static void update(MyNumber obj) {     
		 obj.number++;  
	 }
	 
	 public static void updatePrimitive(int num) {
		 num++;
	 }
	 
}

class MyNumber {
	public int number;

	public MyNumber() {
	 number = 1;
	}
}