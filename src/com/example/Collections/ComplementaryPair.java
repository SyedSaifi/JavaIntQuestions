package com.example.Collections;

import java.util.HashMap;
import java.util.Map;

public class ComplementaryPair {

	public static void main(String[] args) {
		int[] arr = {5,4,5,10,6,3};
		int sum = 15;
		System.out.println("No of complimentary pairs is : "+NoOfPairs(arr, sum));
		System.out.println("Pairs are :: ");
		Pairs(arr, sum);
	}
	
	public static int NoOfPairs(int[] arr, int sum) {
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int number: arr) {
			map.put(number, map.containsKey(number) ? map.get(number)+1 : 1);
		}
		
		int noOfPairs = 0;
		for(int number : map.keySet()) {
			int target = sum - number;
			if(map.containsKey(target)) {
				int c1 = map.get(number);
				int c2 = map.get(target);
				noOfPairs+=c1*c2;
			}
		}
		return noOfPairs;
	}
	
	public static void Pairs(int[] arr, int sum) {
		Map<Integer,Integer> map = new HashMap<>();

		for(int number: arr) {
			map.put(number, map.containsKey(number) ? map.get(number)+1 : 1);
		}
		
		for(int num : map.keySet()) {
			int target = sum - num;
			if(map.containsKey(target)) {
				int c1 = map.get(num);
				int c2 = map.get(target);
				for(int i = 0; i < c1*c2; i++) {
					System.out.println(num +" "+ target);
				}
			}
		}
	}
}
