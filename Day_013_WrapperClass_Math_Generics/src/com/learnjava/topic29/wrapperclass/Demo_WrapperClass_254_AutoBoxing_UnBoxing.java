package com.learnjava.topic29.wrapperclass;

public class Demo_WrapperClass_254_AutoBoxing_UnBoxing {
	
	public static void main(String[] args) {
		
		byte grade_byte = 2;
		int marks_int = 50;
		float price_float = 8.6f;
		double distance_double = 50.5;
		
		Byte grade_Byte = new Byte(grade_byte); // wrapping them to wrapper class 
		Integer marks_Integer = new Integer(marks_int);
		Float price_Float = new Float(price_float);
		Double distance_Double = new Double(distance_double);

		// let us print the values from  wrapper class objects
		System.out.println("Values of Wrapper objects (printing as objects)");
		System.out.println("Byte object grade_Byte value : " + grade_Byte);
		System.out.println("Integer object marks_Integer value : " + marks_Integer);
		System.out.println("Float object price_Float value : " + price_Float);
		System.out.println("Double object distance_Double value : " + distance_Double);
		
		
		
		// objects to data types (retrieving data types from objects)

		byte bv = grade_Byte.byteValue(); // unwrapping
		int iv = marks_Integer.intValue();
		float fv = price_Float.floatValue();
		double dv = distance_Double.doubleValue();

		// let us print the values from data types
		System.out.println("Unwrapped values (printing as data types)");
		System.out.println("byte value, bv: " + bv);
		System.out.println("int value, iv: " + iv);
		System.out.println("float value, fv: " + fv);
		System.out.println("double value, dv: " + dv);
		
	}

}
