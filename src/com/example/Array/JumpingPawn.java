package com.example.Array;

public class JumpingPawn {

	public static void main(String[] args) {
		int[] arr = {2,1,1,-2,6,7};
		int jump = 0;
		int sum = 0;
		int index = 0;
		boolean flag = false;
		
		while(true) {
			sum+= arr[index];
			if(sum > arr.length -1 || sum < 0) 
				break;
			arr[index] = -1;
			index = sum;
			jump++;
			if(arr[index] == -1) {
				flag = true;
				break;
			}
		}
		
		if(flag)
			System.out.println("Looping pawn");
		else
			System.out.println("No of jump is ::"+jump);
	}

}
