package loopandconditionstatements.sorting;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		int[] array1 = {4, 2, 9, 1, 5, 3};
		
		//Sorting using loop
		for(int i = 0; i< array1.length - 1; i++) {
			for(int j = 0; j < array1.length - i - 1; j++) {
				if(array1[j] > array1[j+1]) {
					int temp = array1[j];
					array1[j] = array1[j+1];
					array1[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(array1));
		
		int[] array2 = {4, 2, 9, 1, 5, 3};
		Arrays.sort(array2, 2, 5);
		System.out.println(Arrays.toString(array2));
		
	}

}
