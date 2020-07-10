package com.learnjava.topic29.wrapperclass;
class WrapperDemo {

	
	public void display(int num) {
		System.out.println(" I am from int primitive");
	}

	
	public void display(Integer num) {
		System.out.println(" I am from integer Object");
		
	}

}

public class Demo_WrapperClass_256_InterviewQuestion_AutoBoxing_Unboxing {

	public static void main(String[] args) {
		
		new WrapperDemo().display(10);
		new WrapperDemo().display(new Integer(10));

	}
}
