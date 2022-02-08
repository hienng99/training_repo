package somebasis.passbyreference.thirdmethod;

public class Main{
	  public static void main(String[] args) {
	   
	    int[] number = {1};

	    System.out.println("Number = " + number[0]);
	    
	    update(number);
	   
	    System.out.println("Number = " + number[0]);
	  } 
	
	  public static void update( int[] number) { 
	        number[0]++;
	  }
	}
