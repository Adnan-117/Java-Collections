package com.collections;

import java.util.Arrays;

public class MatrixRotation {

	public static void main(String[] args) {
		int[][] myArray = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 },
				{ 16, 17, 18, 19, 20 } };

		int R = 1; // Rotation times
		for (int i = 0; i < R; i++) {
			int[][] rotatedAntiClockwise = rotateMatrixCounterClockwise(myArray);
			System.out.println(Arrays.deepToString(rotatedAntiClockwise).replace("], ", "]\n"));
			System.out.println("***********************");
			int[][] rotatedClockwise = rotateMatrixClockwise(myArray);
			System.out.println(Arrays.deepToString(rotatedClockwise).replace("], ", "]\n"));
		}
	}

	public static int[][] rotateMatrixCounterClockwise(int[][] matrix) {

		int totalRowsOfRotatedMatrix = matrix[0].length; // Total columns of Original Matrix
		int totalColsOfRotatedMatrix = matrix.length; // Total rows of Original Matrix

		int[][] rotatedMatrix = new int[totalRowsOfRotatedMatrix][totalColsOfRotatedMatrix];

		for (int i = 0; i < totalColsOfRotatedMatrix; i++) {
			for (int j = 0; j < totalRowsOfRotatedMatrix; j++) {
				rotatedMatrix[(totalRowsOfRotatedMatrix - 1) - j][i] = matrix[i][j];
			}
		}
		return rotatedMatrix;
	}

	public static int[][] rotateMatrixClockwise(int[][] matrix) {

		int totalRowsOfRotatedMatrix = matrix[0].length; // Total columns of Original Matrix
		int totalColsOfRotatedMatrix = matrix.length; // Total rows of Original Matrix

		int[][] rotatedMatrix = new int[totalRowsOfRotatedMatrix][totalColsOfRotatedMatrix];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				rotatedMatrix[j][(totalColsOfRotatedMatrix - 1) - i] = matrix[i][j];
			}
		}
		return rotatedMatrix;
	}
}
