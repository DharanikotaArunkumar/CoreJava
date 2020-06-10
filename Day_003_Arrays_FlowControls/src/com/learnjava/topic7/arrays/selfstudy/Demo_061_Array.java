/*
 * two dimentional arrya
 */

package com.learnjava.topic7.arrays.selfstudy;

public class Demo_061_Array {

	public static void main(String[] args) {

		// Array Declaration
		int[][] matrix1;
		int[][] matrix2;
		int[] matrix3[];
		int matrix4[][];
		int matrix5[][];

		// Assignment

		matrix1 = new int[3][3];
		/*matrix2 = new int[3][];
		// matrix3 = new int[][3];// defining the row is mandatory .
		// matrix3 = new int[][]; // defining the row is mandatory and
		matrix3 = new int[3][3];
		matrix4 = new int[3][];
		matrix5 = new int[3][3];
*/
		// Initialization

		int i = 0;
		for (int row = 0; row < matrix1.length; row++) {
			for (int col = 0; col < 3; col++) {
				matrix1[row][col] = ++i;
			}
		}

		for (int row = 0; row < matrix1.length; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(matrix1[row][col] + " ");
			}
			System.out.println();
		}

	}

}
