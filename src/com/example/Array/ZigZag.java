package com.example.Array;

public class ZigZag {

	public static void main(String[] args) {
		int m = 3;
		int n = 4;
		int val = 1;
		int arr[][]= new int[m][n];
		
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				arr[i][j] = val++;
			}
		}
		
		for(int i = 0; i < m; i++){
			int k = n-1;
			for(int j = 0; j < n ; j++){
				if(i%4 == 0){
					System.out.print(arr[i][j]+",");
				}
				else if(i%4 == 1 && j == n-1){
					System.out.print(arr[i][j]+",");
				}
				else if(i%4 == 2){
					System.out.print(arr[i][k]+",");
					k--;
				}
				else if(i%4 == 3 && j == 1)
					System.out.print(arr[i][j]+",");
			}
		}

	}
}
