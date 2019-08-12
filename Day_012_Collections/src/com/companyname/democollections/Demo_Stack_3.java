package com.companyname.democollections;

import java.util.Stack;

public class Demo_Stack_3 {

	public static void main(String[] args) {
		Stack<Object> st = new Stack<Object>();
		st.push("a");
		st.push("b");
		st.push("c");
		st.push("d");
		st.push("e");
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.search("b"));
		
		System.out.println(st);
	
	}
		

}
