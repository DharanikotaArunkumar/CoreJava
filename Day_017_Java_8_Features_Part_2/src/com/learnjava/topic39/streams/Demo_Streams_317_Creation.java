package com.learnjava.topic39.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo_Streams_317_Creation {

	public static void main(String[] args) {

		System.out.println("Empty Stream");
		
		Stream<String> streamEmpty = Stream.empty();
		
		streamEmpty.forEach(System.out::println);

		
		System.out.println("Builder Stream");
		
		
		Stream.Builder<String> builder = Stream.builder();

		Stream<String> streamBuilder = builder.add("Vijay").add("Ajay").add("John").build();

		streamBuilder.forEach(System.out::print);
		
		
		System.out.println(" \n Stream Of");

		Stream<String> streamOfNames = Stream.of("Vijay", "Ajay", "John");

		streamOfNames.forEach(System.out::println);
		
		
		
		System.out.println(" \n Stream From Any collection");

		List<String> list = new ArrayList<>();
		list.add("Vijay");
		list.add("Ajay");
		list.add("John");

		Stream<String> streamOfNames2 = list.stream();

		streamOfNames2.forEach(System.out::println);

		
		System.out.println(" \n Stream From Any Array");
		
		String arr[] = new String[] { "Vijay", "Ajay", "John" };
		Stream<String> streamOfArray = Arrays.stream(arr);
		streamOfArray.forEach(System.out::println);

		
	}

}
