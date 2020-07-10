/*
 * Intermediate Operator filter
 * 
 * 
 * Returns a stream consisting of the elements of this stream that match the given predicate
 */

package com.learnjava.topic39.streams.intermediate;

import java.util.stream.Stream;

public class Demo_Streams_318_Intermediate_FIlter {

	public static void main(String[] args) {
		
		Stream<String> names = Stream.of("Vijay","Ajay","Jay","Raj","Suraj","Swaraj" );
	            
		names =names.filter(name -> name.startsWith("S"));
		
		names.forEach(System.out::println);
		
		
		//collection.stream().intermediate().<intermediate()>.<intermediate()>.terminal()

	}

}
