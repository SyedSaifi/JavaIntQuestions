package com.example.Array;

public class JumpingPawn {

	public static void main(String[] args) {
		int[] arr = {2,1,1,-2,6,7};
		int jump = 0;
		int sum = 0;
		int index = 0;
		
		while(true) {
			sum+= arr[index];
			arr[index] = -1;
			index = sum;
			jump++;
			
			if(sum > arr.length -1 || sum < 0) {
				System.out.println("No of jump is ::"+jump);
				break;
			}
			if(arr[index] == -1) {
				System.out.println("Looping pawn");
				break;
			}
		}
	}

}
