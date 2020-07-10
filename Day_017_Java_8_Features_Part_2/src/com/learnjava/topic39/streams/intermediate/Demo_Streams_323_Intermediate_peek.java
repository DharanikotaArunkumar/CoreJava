/*
 * Intermediate Operator peek
 * 
 * 
 *Returns a stream consisting of the elements of this stream, additionally
 * performing the provided action on each element as elements are consumed
 *  from the resulting stream.
 */

package com.learnjava.topic39.streams.intermediate;

import java.util.stream.Stream;

public class Demo_Streams_323_Intermediate_peek {

	public static void main(String[] args) {

		Stream<String> names = Stream.of("Vijay", "Ajay", "Jay", "Suraj", "Raj", "Suraj", "Swaraj");

		names = names.filter(e -> e.length() > 3).peek(e -> System.out.println("Filtered value: " + e.toUpperCase()));
		names.forEach(System.out::println);

	}

}
