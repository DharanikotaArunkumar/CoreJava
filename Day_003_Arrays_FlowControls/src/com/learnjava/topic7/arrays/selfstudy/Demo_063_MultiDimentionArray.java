package com.learnjava.topic7.arrays.selfstudy;

/*
 * How this multi dimensional array will be represented .
 * 
 * num [0] :- [[I@2a139a55 
 * num [1] :- [[I@7852e922
 * 
 * num [0][0] :- [I@15db9742 ,num [0][1] :- [I@6d06d69c
 * num [1][0] :- [I@4e25154f ,num [1][1] :- [I@70dea4e
 * 
 * 
 * num [0][0][0] :- 0     
 * num [0][0][1] :- 1
 * 
 * num [0][1][0] :- 1
 * num [0][1][1] :- 2
 *
 * num [1][0][0] :- 1
 * num [1][0][1] :- 2
 * 
 * num [1][1][0] :- 2
 * num [1][1][1] :- 3
 * 
 */
public class Demo_063_MultiDimentionArray {

	public static void main(String[] args) {
		int num[][][] = new int[2][2][2];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					num[i][j][k] = i + j + k;
				}
			}

		}

		for (int i = 0; i < 2; i++) {
			System.out.println("num [" + i + "] :- " + num[i]);
			for (int j = 0; j < 2; j++) {
				System.out.println("num [" + i + "][" + j + "] :- " + num[i][j]);
				for (int k = 0; k < 2; k++) {

					System.out.println("num [" + i + "][" + j + "][" + k + "] :- " + num[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();

		}

	}

}
