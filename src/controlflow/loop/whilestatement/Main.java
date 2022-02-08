package controlflow.loop.whilestatement;

public class Main {
	
	public static void main(String[] args) {
		
		//Display number from 0 to 9
		int num1 = 0;
		while(num1 < 10) {
			System.out.println(num1);
			num1 ++;
		}
		System.out.println("-------------------------------------");
		
		
		//Find the smallest number which is divisible by 3 and 5
		int num2 = 1;
		mainloop:
		while(true) {
			if(num2 % 3 == 0 && num2 % 5 == 0) {
				break mainloop;
			}
			num2++;
		}
		System.out.println(num2);
	}

}
