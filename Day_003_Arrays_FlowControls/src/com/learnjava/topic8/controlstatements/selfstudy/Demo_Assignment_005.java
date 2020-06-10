package com.learnjava.topic8.controlstatements.selfstudy;

/*

Write a program to display the stars in below format ?
*
**
***
****
***** 

*/
public class Demo_Assignment_005 {

	public static void main(String[] args) {
		int noOfRows =15;
		int noOfStars=15;
		for(int row =0;row<noOfRows;row++ ){
			for(int star =0;star<noOfStars;star++)
			{
				System.out.print("*");
			}
			System.out.println();
			noOfStars -=1;
		}
	}

}
