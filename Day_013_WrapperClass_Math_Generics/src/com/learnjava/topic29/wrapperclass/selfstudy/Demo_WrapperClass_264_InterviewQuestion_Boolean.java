/*
 * what is the output of below program ?
 * 
 * 
* Answer :-  
* 
* other than true , Java treats every thing as false .
* 
*/

package com.learnjava.topic29.wrapperclass.selfstudy;

public class Demo_WrapperClass_264_InterviewQuestion_Boolean {

	public static void main(String[] args) {

		String s1 = "true";

		boolean b1 = Boolean.parseBoolean(s1.toLowerCase());
		System.out.println(b1);

		String s2 = "false";
		boolean b2 = Boolean.parseBoolean(s2.toLowerCase());
		System.out.println(b2);

		String s3 = "false or true";
		boolean b3 = Boolean.parseBoolean(s3.toLowerCase());
		System.out.println(b3);

	}
}
