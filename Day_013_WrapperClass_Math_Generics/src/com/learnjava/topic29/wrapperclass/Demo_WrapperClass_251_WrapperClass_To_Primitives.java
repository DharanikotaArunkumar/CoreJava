package com.learnjava.topic29.wrapperclass;

public class Demo_WrapperClass_251_WrapperClass_To_Primitives {

	public static void main(String[] args) {

		Integer value1 = new Integer(123);
		Integer value2 = new Integer(250);

		// Wrapper class to in primitive

		int value1Primitive = value1.intValue();
		int value2Primitive = value2.intValue();

		System.out.println("Value 1 in primitive : " + value1Primitive);

		System.out.println("Value 2 in primitive : " + value2Primitive);

		// primitive to wrapper class object

		int value = 10;

		Integer valueInInteger = Integer.valueOf(value);

		System.out.println("value In Integer Object : " + valueInInteger);

		// String is most used object , integer value to String

		String tenInString = Integer.toString(10);

		System.out.println(" Value is String object " + tenInString);

	}

}
