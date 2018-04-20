package com.example.interview;

public class SumSubarrayEqualToNumber {
	public static void main(String arg[]) {
		int arr[] = {42, 15, 12, 8, 6, 32};
		findSubArrays(arr,26);
	}

	public static void findSubArrays(int[] arr, int num) {
	    int start = 0;
	    int sum = arr[0];
	    
	    for (int i = 1; i < arr.length; i++) {
	        sum += arr[i];
	 
	        while(sum > num && start < i) {
	            sum = sum - arr[start];
	            start++;
	        }
	        
	        if (sum == num) {
	            for(int j = start; j <= i ; j++)
	            	System.out.print(arr[j]+" ");
	            System.out.println();
	        } 
	    }
	}
}
