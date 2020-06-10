package com.learnjava.topic25.list;
// pop operation is removing the element from the stack.

import java.util.Stack;

public class Demo_221_Stack_002 {

	public static void main(String[] args) {
		Stack<Object> st = new Stack<Object>();
		st.push("a");
		st.push("b");
		st.push("c");
		st.push("d");
		st.push("e");
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.pop());
	}

}
