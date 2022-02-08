package controlflow.loop.dowhilestatement;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		//Sum of input number until the zero appears
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int num;
		do {
			num = scanner.nextInt();
			sum += num;
		}
		while(num != 0);
		System.out.println(sum);
		scanner.close();
	}

}
