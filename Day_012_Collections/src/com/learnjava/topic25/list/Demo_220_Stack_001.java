package com.learnjava.topic25.list;

// Stack is used for the last in -first out .
// push is used to insert the element in the stack .

import java.util.Stack;

public class Demo_220_Stack_001 {

	public static void main(String[] args) {
	Stack<Object> st = new Stack<Object>();
	st.push("a");
	st.push("b");
	st.push("c");
	st.push("d");
	st.push("e");
	System.out.println(st);
	
	}

}
