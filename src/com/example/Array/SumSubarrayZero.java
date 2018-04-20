package com.example.Array;

import java.util.HashMap;
import java.util.Map;

public class SumSubarrayZero {
	public static void main(String arg[]) {
		int arr[] = {9, 2, -1, -3, 4,-2, 2, 4, 6, 0};
		findSumZeroSubArrays(arr);
	}

	public static void findSumZeroSubArrays(int[] arr) {
	    Map<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
	    Integer sum = 0;
	    
	    for (int i = 0; i < arr.length; i++) {
	        sum += arr[i];
	 
	        if (sum == 0) {
	            printSubArray(arr, 0, i);
	        }
	        
	        if (sumMap.containsKey(sum)) {
	            printSubArray(arr, sumMap.get(sum) + 1, i);
	        } else {
	            sumMap.put(sum, i);
	        }
	    }
	}
	
	public static void printSubArray(int[] arr, int startIndex, int endIndex) {
	    for (int i = startIndex; i <= endIndex; i++) {
	        System.out.print(arr[i] + " ");
	    }
	    System.out.println();
	}

}
