package com.example.Array;

public class FrogJumpNaive {
	public static void main(String args[]) {
		int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int n = arr.length;
		System.out.print("Minimum number of jumps to reach end is " + minJumps(arr, 0, n - 1));
	}

	static int minJumps(int arr[], int start, int end) {
		if (start == end)
			return 0;

		if (arr[start] == 0)
			return Integer.MAX_VALUE;

		// Traverse through all the points
		// reachable from arr[start]. Recursively
		// get the minimum number of jumps
		// needed to reach arr[end] from these
		// reachable points.
		int min = Integer.MAX_VALUE;
		
		for (int i = start + 1; i <= end && i <= start + arr[start]; i++) {
			int jumps = minJumps(arr, i, end);
			if (jumps != Integer.MAX_VALUE && jumps + 1 < min)
				min = jumps + 1;
		}
		return min;

	}
}
