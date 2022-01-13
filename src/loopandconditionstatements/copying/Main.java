package loopandconditionstatements.copying;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		int[] a = {5, 2, 7, 9, 1};
		int[] b = new int[a.length];
		b = a;
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		int[] c = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		System.out.println(Arrays.toString(c));
		c[0] = 6;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(c));
	}

}
