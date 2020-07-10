/*
 * Intermediate Operator sorted
 * 
 * 
 * Returns a stream consisting of the elements of this stream, sorted
 * according to natural order.
 */

package com.learnjava.topic39.streams.intermediate;

import java.util.stream.Stream;

public class Demo_Streams_322_Intermediate_Sorted {

	public static void main(String[] args) {

		Stream<String> names = Stream.of("Vijay", "Ajay", "Jay", "Suraj", "Raj", "Suraj", "Swaraj");

		names = names.sorted();

		names.forEach(System.out::println);

	}

}
