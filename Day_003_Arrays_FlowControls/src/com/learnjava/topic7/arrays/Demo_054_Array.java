package com.learnjava.topic7.arrays;

public class Demo_054_Array {

	public static void main(String[] args) {
		// Declarations, Assignment, Initialization

		int[][] matrix1 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, {7,8,9}};


		int[][] matrix2 =  { { 1, 2, 3 }, { 4, 5, 6 }, {7,8,9}};
		
		
		for (int row = 0; row < matrix1.length; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(matrix1[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int row = 0; row < matrix1.length; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(matrix2[row][col] + " ");
			}
			System.out.println();
		}
		
		
		//Addition
		int[][] matrix3  =new int[3][3];
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				matrix3[row][col] = matrix1[row][col] + matrix2[row][col];
			}
			System.out.println();
		}
		
		System.out.println("Addition of two matrix");

		for (int row = 0; row < matrix1.length; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(matrix3[row][col] + " ");
			}
			System.out.println();
		}
		
	
	
	}

}
