package com.learnjava.topic8.controlstatements.selfstudy;

public class Demo_Assignment_006 {

	public static void main(String[] args) {

		int noOfRows = 15;
		int lengthOfLine = 80;
		int startPoint = lengthOfLine / 2;
		int endPoint = startPoint + 1;

		for (int row = 0; row < noOfRows; row++) {

			for (int len = 0; len < lengthOfLine; len++) {

				if (len >= startPoint && len < endPoint) {
					
						System.out.print("*");
					

				} else {
					System.out.print(" ");
				}
			}
			startPoint -= 1;
			endPoint += 1;
			System.out.println();
		}

	}

}
