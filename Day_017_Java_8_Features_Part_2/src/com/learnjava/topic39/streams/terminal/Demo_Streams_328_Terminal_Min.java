/*
 * terminal Operator min
 * 
 * 
 * Returns the maximum element of this stream according to the provided
     * {@code Comparator}. */

package com.learnjava.topic39.streams.terminal;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo_Streams_328_Terminal_Min {

	public static void main(String[] args) {

		IntStream values = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println(" min number " + values.min());

		Stream<String> namesStream = Stream.of("Vijay", "Ajay", "Jay", "Raj", "Suraj", "Swaraj");

		System.out.println(" min number " + namesStream.min(new Comparator<String>() {

			@Override
			public int compare(String name1, String name2) {
				// TODO Auto-generated method stub
				return name1.compareTo(name2);
			}
		}));

	}

}
