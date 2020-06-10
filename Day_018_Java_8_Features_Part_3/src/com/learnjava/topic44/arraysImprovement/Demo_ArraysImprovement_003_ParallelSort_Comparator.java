/*
 * The range to be sorted extends from the index
 * fromIndex, inclusive,
 * toIndex, exclusive.
 * If fromIndex == toIndex, the range to be sorted is empty.

 */

package com.learnjava.topic44.arraysImprovement;

import java.util.Arrays;
import java.util.Comparator;

public class Demo_ArraysImprovement_003_ParallelSort_Comparator {
	public static void main(String[] args) {

		String[] veggies = { "Banana", "Apple", "EggPlant", "Carrot", "Drumstick" };

		System.out.println("--------------- Normal Sorting --------------- ");
		long startTime = System.nanoTime();
		Arrays.parallelSort(veggies, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}

		});
		long endTime = System.nanoTime();

		long executionTime = endTime - startTime;
		System.out.println("Sorting completed in  " + executionTime);
		System.out.print("After soring Array : ");
		for (String element : veggies) {
			System.out.print(element + " ");
		}

	}
}