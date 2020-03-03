package com.collections;

public class DiagonalDifference {

	public static void main(String[] args) {
		int[][] arr = new int[][] { { 11, 2, 4 }, { 4, 5, 6 }, { 10, 8, -12 }};
		int n = arr.length;
		int result = diagonalDifference(arr,n);
		System.out.println(result);
	}

	private static int diagonalDifference(int[][] arr, int n) {
        int rightDiagonal = 0;
        int leftDiagonal = 0;
        int resultantDifference = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                rightDiagonal += arr[i][j];
                if (i+j == (n-1))
                leftDiagonal += arr[i][j];
            }
        }
        resultantDifference = rightDiagonal - leftDiagonal;
        return Math.abs(resultantDifference);
	}
}
