package controlflow.loop.forloop;

public class Main {
	
	public static void main(String[] args) {
		
		for(int i = 0; i< 10; i++) {
			System.out.println(i);
		}
		
		outerloop:
		for(int i = 0; i < 10; i++) {
			innerloop:
			for(int j = 0; j < 10; j++) {
				if(j == i && j ==7) {
					break outerloop;
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

}
