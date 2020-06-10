/*
 * The range to be sorted extends from the index
 * fromIndex, inclusive,
 * toIndex, exclusive.
 * If fromIndex == toIndex, the range to be sorted is empty.

 */

package com.learnjava.topic44.arraysImprovement;

import java.util.Arrays;

public class Demo_ArraysImprovement_002_ParallelSort_With_Range {
	public static void main(String[] args) {

		int[] valueSet1 = { 5, 8, 1, 0, 6, 9, 2, 3, 10, 4, 7, 11, 19, 18, 13, 12, 15, 14, 17, 16, 20 };

		System.out.println("--------------- Normal Sorting --------------- ");
		long startTime = System.nanoTime();
		Arrays.sort(valueSet1, 0, 11); // it sorts only from 0 to 11 index ,later indexes it does not sorts
		long endTime = System.nanoTime();

		long executionTime = endTime - startTime;
		System.out.println("Sorting completed in  " + executionTime);
		System.out.print("After soring Array : ");
		for (int element : valueSet1) {
			System.out.print(element + " ");
		}

		System.out.println("\n\n\n --------------- Parallel Sorting --------------- ");

		int[] valueSet2 = { 5, 8, 1, 0, 6, 9, 2, 3, 10, 4, 7, 11, 19, 18, 13, 12, 15, 14, 17, 16, 20 };
		startTime = System.nanoTime();

		Arrays.parallelSort(valueSet2,0, 11); // it sorts only from 0 to 11 index ,later indexes it does not sorts

		endTime = System.nanoTime();
		executionTime = endTime - startTime;
		System.out.println("Sorting completed in  " + executionTime);
		System.out.print("After soring Array : ");
		for (int element : valueSet2) {
			System.out.print(element + " ");
		}

	}
}