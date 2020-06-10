package com.learnjava.topic7.arrays;

public class Demo_055_Array {

	public static void main(String[] args) {
		int num[][][] = new int[2][2][2];

		for (int i = 0; i <2; i++) {
			for (int j = 0; j <2; j++) {
				for (int k = 0; k <2; k++) {
					num[i][j][k] = i + j + k;
				}
			}

		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					
					System.out.println("Location ["+i+"]["+j+"]["+k+"] :- "+num[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();

		}

	}

}
