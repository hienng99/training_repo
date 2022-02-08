package loopandconditionstatements.multidimensionalarray;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
	
	public static void main(String[] args) {
		
		String[][] array = {
				{"one", "two","three"},
				{"four", "five", "six"}
		};
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][][] array2 = new int[2][3][4];	
		for(int i = 0; i < array2.length; i++) {
			for(int j = 0; j < array2[0].length; j++) {
				for(int k = 0; k < array2[0][0].length; k++) {
					array2[i][j][k] = ThreadLocalRandom.current().nextInt(1, 20 + 1);
				}
			}
		}
		System.out.println(Arrays.deepToString(array2));
	}

}
