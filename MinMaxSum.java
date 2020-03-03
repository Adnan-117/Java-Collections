package com.collections;

public class MinMaxSum {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
        miniMaxSum(arr);
	}

	private static void miniMaxSum(int[] arr) {
        long minValue = arr[0];
        long maxValue = minValue;
        long sum = minValue;
        for(int i=1; i<arr.length;i++){
            sum+=arr[i];
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        System.out.print((sum-maxValue) + " "+ (sum-minValue));
		
	}

}
