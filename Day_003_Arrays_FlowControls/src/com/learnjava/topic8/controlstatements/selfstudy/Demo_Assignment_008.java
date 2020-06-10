package com.learnjava.topic8.controlstatements.selfstudy;

public class Demo_Assignment_008 {

	public static void main(String[] args) {
		int noOfRows = 21;
		
		int lengthOfLine = 100;
		int startPoint = lengthOfLine / 2;
		int endPoint = startPoint ;

		for (int row = 0; row < noOfRows; row++) {			
			for (int len = 0; len < lengthOfLine; len++) {
				
				if (len >= startPoint && len <=endPoint) {
						System.out.print("*");

				} else {
					System.out.print(" ");
				}
			}
			if(row<noOfRows/2)
			{
			startPoint -= 1;
			endPoint += 1;
			}else{
				startPoint += 1;
				endPoint -= 1;
			}
			System.out.println();
		}


	}

}
