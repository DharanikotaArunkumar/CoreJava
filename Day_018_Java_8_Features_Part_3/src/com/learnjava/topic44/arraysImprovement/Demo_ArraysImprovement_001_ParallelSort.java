/*
 * Arrays utility method improved with parallel sorting 
 */

package com.learnjava.topic44.arraysImprovement;

import java.util.Arrays;

public class Demo_ArraysImprovement_001_ParallelSort {
	public static void main(String[] args) {

		int[] valueSet1 = { 5, 8, 1, 0, 6, 9, 11, 19, 18, 13, 12, 15, 14, 17, 16, 20, 2, 3, 10, 4, 7 };

		
		
		System.out.println("--------------- Normal Sorting --------------- ");
		long startTime = System.nanoTime();
		Arrays.sort(valueSet1); // normal sort
		long endTime = System.nanoTime();

		long executionTime = endTime - startTime;
		System.out.println("Sorting completed in  " + executionTime);
		System.out.print("After soring Array : ");
		for (int element : valueSet1) {  
	            System.out.print(element+" ");  
	    }  

		
		System.out.println("\n\n\n --------------- Parallel Sorting --------------- ");
		
		int[] valueSet2 = { 5, 8, 1, 0, 6, 9, 11, 19, 18, 13, 12, 15, 14, 17, 16, 20, 2, 3, 10, 4, 7 };
		startTime = System.nanoTime();

		Arrays.parallelSort(valueSet2); //  array into ascending numerical order.

		endTime = System.nanoTime();
		executionTime = endTime - startTime;
		System.out.println("Sorting completed in  " + executionTime);
		System.out.print("After soring Array : ");
		for (int element : valueSet2) {  
	            System.out.print(element+" ");  
	    }

	}
}