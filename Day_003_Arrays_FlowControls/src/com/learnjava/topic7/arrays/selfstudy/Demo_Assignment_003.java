package com.learnjava.topic7.arrays.selfstudy;

import java.util.Arrays;

/*
 * There are 100 athletes participating in the running event . But stadium have only 10 running tracks available to make this event . What a program to find the winner of the 100 participates with sample data .
 */
public class Demo_Assignment_003 {

	public static void main(String[] args) {
		double[] athletesTIme = new double[100];

		for (int no = 0; no < athletesTIme.length; no++) {
			athletesTIme[no] =  (Math.random()+9);
		}

		for (int no = 0; no < athletesTIme.length; no++) {
			System.out.println(athletesTIme[no]);
		}

		int topIndex =0;
		
		for (int no = 0; no < athletesTIme.length; no=no+10) {
		 
			int startNo =no;
			int endNo =startNo+10;
			for(int row =startNo;row<endNo && endNo <=athletesTIme.length; row++){
				if(athletesTIme[topIndex]>athletesTIme[row]){
					topIndex=row;				
				}
			}
		}
		System.out.println("Top athlet is "+(topIndex+1)+"And the time is "+athletesTIme[topIndex]);
		
	// By using the Arrays Utill
		Arrays.sort(athletesTIme);
	System.out.println("Top athlet time is "+athletesTIme[0]);
	

		
	}

}
