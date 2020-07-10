/*
 * terminal Operator reduced
 * 
 * 
 *reduction stream operations allow us to produce one single result from a sequence of elements, by applying repeatedly
 * a combining operation to the elements in the sequence.
 * */

package com.learnjava.topic39.streams.terminal;

import java.util.Optional;
import java.util.stream.Stream;

public class Demo_Streams_332_Terminal_Reduce {

	public static void main(String[] args) {

		// Grouping by starting letter
		Stream<String> names = Stream.of("Vijay", "Ajay", "Jay", "Raj", "Suraj", "Swaraj");

		Optional<String> optional = names
				.reduce((result, element) -> result.charAt(0) >= element.charAt(0) ? result : element);
		System.out.println(optional);

	}

}
