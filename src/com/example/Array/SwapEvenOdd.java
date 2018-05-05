package com.example.Array;

public class SwapEvenOdd {

	public static void main(String[] args) {
		int[] arr = {1,2,3,10,5,6,7,8,9};
		System.out.println(moves(arr));
	}
	
	static int moves(int[] a) {
		int temp;
		int noOfSwaps = 0;
		int left = 0;
		int right = a.length-1;
		
		while (left < right)
	    {
	        while (a[left]%2 == 0 && left < right)
	            left++;
	 
	        while (a[right]%2 != 0 && left < right)
	            right--;
	 
	        if (left < right)
	        {
	        	temp = a[left];
	            a[left] = a[right];
	            a[right] = temp;
	            left++;
	            right--;
	            noOfSwaps++;
	        }
	    }
		return noOfSwaps;
    }

}
