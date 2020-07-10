/*
 * Intermediate Operator limit
 * 
 * 
 * Returns a stream consisting of the elements of this stream, truncated  to be
 * no longer than {@code maxSize} in length.
 */

package com.learnjava.topic39.streams.intermediate;

import java.util.stream.Stream;

public class Demo_Streams_319_Intermediate_Limit {

	public static void main(String[] args) {
		
		Stream<String> names = Stream.of("Vijay","Ajay","Jay","Raj","Suraj","Swaraj" );
	            
		names =names.filter(s -> s.startsWith("S")).limit(1);
		
		names.forEach(System.out::println);

	}

}
