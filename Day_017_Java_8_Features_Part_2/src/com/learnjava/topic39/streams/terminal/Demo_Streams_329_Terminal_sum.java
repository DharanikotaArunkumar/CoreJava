/*
 * terminal Operator sum
 * 
 * 
 * Returns the maximum element of this stream according to the provided
     * {@code Comparator}. */

package com.learnjava.topic39.streams.terminal;

import java.util.stream.IntStream;

public class Demo_Streams_329_Terminal_sum {

	public static void main(String[] args) {

		IntStream values = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println(" sum number " + values.sum());

		 values = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println(" average number " + values.average());

	}

}
