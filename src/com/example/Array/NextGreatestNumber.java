package com.example.Array;

import java.util.Arrays;

/*
 * Given a number n, find the smallest number that has same set of digits as n and is greater than n. If x is the greatest possible number with its set of digits, then print “not possible”.
 *	Examples:
 *	For simplicity of implementation, we have considered input number as a string.
 *	Input:  n = "218765"
 *	Output: "251678"
 */
public class NextGreatestNumber {

	public static void main(String[] args) {
		String num = "218765";
		//String num = "8765";
		//String num = "12345";
		findNext(num);
	}
	
	public static void findNext(String num) {
		char[] arr = num.toCharArray();
		int length = arr.length;
		
		int i;
		for(i = length-1; i > 0; i--) {
			if(arr[i-1] < arr[i])
				break;
		}
		
		if(i==0) {
			System.out.println("Next highest number not possible");
		} else {
			int dip = arr[i-1];
			int min = i;
			
			for(int j = i+1; j < length; j++) {
				if(arr[j] > dip && arr[j] < arr[min])
					min = j;
			}
			
			swap(arr, i-1, min);
			Arrays.sort(arr,i,length);
			
			String nextNum = "";
			
			for(char c: arr)
				nextNum+= c+"";
			
			System.out.println("Next greatest number is : "+nextNum);
		}
	}
	
	public static void swap(char arr[], int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
