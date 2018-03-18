package com.example.interview;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* Degree of array is the length of the subarray which has the highest occurrence in the array
 * 
 */
public class DegreeOfArray {
    public static void findShortestSubArray(int[] nums) {
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (left.get(x) == null) 
            	left.put(x, i);
            right.put(x, i);
            count.put(x, count.get(x) == null? 1:count.get(x)+1);
        }

        int length = nums.length;
        int degree = Collections.max(count.values());
        int start = 0,end = 0;
        
        for (int x : count.keySet()) {
            if (count.get(x) == degree) {
                //length = Math.min(length, right.get(x) - left.get(x) + 1);
            	int subLength = right.get(x) - left.get(x) + 1;
            	if(subLength < length) {
            		length = subLength;
            		start = left.get(x);
            		end = right.get(x);
            	}
            }
        }
        System.out.println("Degree of array is :: "+length);
        System.out.println("Subarray is ::");
        for(int i = start; i<=end; i++)
        	System.out.print(nums[i]+" ");
    }
    
    public static void main(String[] args) {
    	int[] arr = {1,2,1,2,3,4};
    	DegreeOfArray.findShortestSubArray(arr);
    }
}