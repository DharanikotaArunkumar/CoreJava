/*
 * Intermediate Operator map
 * 
 * 
 *Returns a stream consisting of the results of applying the given
     * function to the elements of this stream.
 */

package com.learnjava.topic39.streams.intermediate;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo_Streams_324_Intermediate_map {

	public static void main(String[] args) {

		Stream<String> names = Stream.of("Vijay", "Ajay", "Jay", "Suraj", "Raj", "Suraj", "Swaraj");

		names = names.filter(name -> name.length() > 3).map(String::toUpperCase);
		names.forEach(System.out::println);

		names = Stream.of("Vijay", "Ajay", "Jay", "Suraj", "Raj", "Suraj", "Swaraj");

		
		IntStream mapToInt = names.filter(name -> name.length() > 3).mapToInt(String::length);
		mapToInt.forEach(System.out::println);

	}

}
