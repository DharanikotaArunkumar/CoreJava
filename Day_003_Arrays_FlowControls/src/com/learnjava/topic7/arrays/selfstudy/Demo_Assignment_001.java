package com.learnjava.topic7.arrays.selfstudy;

import java.util.Arrays;

public class Demo_Assignment_001 {

	public static void main(String[] args) {
		
		double[] playerCompletationTime = new double[] { 9.99, 9.85, 9.84, 9.79, 9.81, 10.02, 10.45, 9.71, 11.34,10.54 };
		System.out.println("No of players participarting in the event :- " + playerCompletationTime.length);
		

		double temp = 0;
		for (int index = 0; index < playerCompletationTime.length; index++) {
			for (int comparItemIndex = index; comparItemIndex < playerCompletationTime.length; comparItemIndex++) {
				if (playerCompletationTime[index] > playerCompletationTime[comparItemIndex]) {
					temp = playerCompletationTime[index];
					playerCompletationTime[index] = playerCompletationTime[comparItemIndex];
					playerCompletationTime[comparItemIndex] = temp;

				}
			}
		}

		System.out.print("Ranks of the Players :- ");
		for (int index = 0; index < playerCompletationTime.length; index++) {
			System.out.print(playerCompletationTime[index] + ",");
		}

		  System.out.println("\nGold Medal For :- "+playerCompletationTime[0]);
		  System.out.println( "Silver Medal For :- "+playerCompletationTime[1]);
		  System.out.println("bronze  Medal For :- " +playerCompletationTime[2]);
		  
		
		  
		  // Approach -2 by using the Arrays Class .
		  
		  /*Arrays.sort(playerCompletationTime);
		  System.out.println("Gold Medal For :- "+playerCompletationTime[0]);
		  System.out.println( "Silver Medal For :- "+playerCompletationTime[1]);
		  System.out.println("bronze  Medal For :- " +playerCompletationTime[2]);
		  */
		 
	}

}
