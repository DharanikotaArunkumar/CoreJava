/*
 * Intermediate Operator skip
 * 
 * 
 *Returns a stream consisting of the remaining elements of this stream
 * after discarding the first {@code n} elements of the stream.
 * 
 * If this stream contains fewer than {@code n} elements then an empty stream
 *   will be returned.
 */

package com.learnjava.topic39.streams.intermediate;

import java.util.stream.Stream;

public class Demo_Streams_320_Intermediate_Skip {

	public static void main(String[] args) {

		Stream<String> names = Stream.of("Vijay", "Ajay", "Jay", "Raj", "Suraj", "Swaraj");

		names = names.filter(s -> s.startsWith("S")).skip(1);

		names.forEach(System.out::println);

	}

}
