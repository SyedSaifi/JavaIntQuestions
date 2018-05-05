package com.example.Array;

public class FindMiddleIndexSumEqualLeftandRight {
	 
    public static int findMiddleIndex(int[] numbers) throws Exception {
    	int start = 0;
        int end = numbers.length - 1;
        int sumLeft = 0;
        int sumRight = 0;
        
        while (true) {
            if (sumLeft > sumRight) {
                sumRight += numbers[end--];
            } else {
                sumLeft += numbers[start++];
            }
            if (start > end) {
                if (sumLeft == sumRight) {
                    break;
                } else {
                    throw new Exception("Please pass proper array to match the requirement");
                }
            }
        }
        return end;
    }
 
    public static void main(String a[]) {
        int[] num = { 2, 4, 4, 5, 4, 1 };
        try {
            System.out.println("Middle index is "+ findMiddleIndex(num));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}