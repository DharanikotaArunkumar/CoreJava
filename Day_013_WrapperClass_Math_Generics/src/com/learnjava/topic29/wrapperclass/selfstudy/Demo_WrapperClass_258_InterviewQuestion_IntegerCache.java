/*
 * what is the output of below program ?
 */


package com.learnjava.topic29.wrapperclass.selfstudy;

public class Demo_WrapperClass_258_InterviewQuestion_IntegerCache {
	
	public static void main(String[] args) {
	
		int value10primitive = 10;
		Integer value10Wrapper = new Integer(10);
		
		if (value10primitive == value10Wrapper) {
			System.out.print("Both are same");
		} else {
			System.out.print("Both are not same");
		}
	}
}
