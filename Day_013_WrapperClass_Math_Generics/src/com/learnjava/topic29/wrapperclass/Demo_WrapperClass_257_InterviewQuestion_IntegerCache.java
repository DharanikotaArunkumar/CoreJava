package com.learnjava.topic29.wrapperclass;

public class Demo_WrapperClass_257_InterviewQuestion_IntegerCache {

	public static void main(String[] args) {
		Integer value1 = new Integer(100);
		Integer value2 = new Integer(100);
		
		
		System.out.println(value1 == value2); // because new always creates different objects in heap
		
		
		Integer value3 = 100; // Integer.parseInt(100);
		Integer value4 = 100;
		
		System.out.println(value3 == value4); // Integer.IntegerCache -127 to +128
		

		Integer value5 = 129; // Integer.parseInt(100);
		Integer value6 = 129;
		
		System.out.println(value5 == value6); // beyond the range it uses new Integer(129)
		
		
		// Why this range :- to improve the performance when ever we have cache
	}

}
