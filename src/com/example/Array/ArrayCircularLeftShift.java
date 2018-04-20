package com.example.Array;

import java.util.Arrays;

public class ArrayCircularLeftShift {
	
	public static void main( String[] args ) {
	    int[] array = {1,2,3,4,5,6,7,8};
	    int[] array1 = {1,2,3,4,5,6,7,8};
	    leftShift(array, 3);
	    rightShift(array1,3);
	    System.out.println(Arrays.toString(array));
	    System.out.println(Arrays.toString(array1));
	}

	public static void leftShift(int[] array, int n) {
	    for (int shift = 0; shift < n; shift++) {
	        int first = array[0];
	        //System.arraycopy(array, 1, array, 0, array.length - 1);
	        for(int i=0; i<array.length-1;i++) 
	        	array[i] = array[i+1];
	        
	        array[array.length - 1] = first;
	    }
	}
	
	public static void rightShift(int[] array, int n) {
		for(int shift = 0; shift < n; shift++ ) {
			int last = array[array.length-1];
			//System.arraycopy(array, 0, array, 1, array.length - 1);
			for(int i=array.length-1; i>0; i--)
				array[i] = array[i-1];
			
			array[0] = last;
		}
	}
}
