/*
 * 1 ) identifiers are case sensitive (count ,Count , COUNT are different variables)
 * 2) An identifier cannot be the same as a query language keyword.(not recommended )( No Error if we use it )
 **/


package com.learnjava.topic3.Identifiers.selfstudy;

public class Demo_007_Identifiers {

	public static void main(String[] args) {

		int count = 0;
		int Count = 10;
		int COUNT = 100;
		System.out.println("count " + count);
		System.out.println("Count " + Count);
		System.out.println("COUNT " + COUNT);

		int SELECT = 100;
		System.out.println("SELECT " + SELECT);

	}

}
