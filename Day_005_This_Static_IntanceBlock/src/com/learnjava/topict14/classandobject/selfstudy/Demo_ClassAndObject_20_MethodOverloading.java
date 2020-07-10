package com.companyname.demo3.classandobjectautonomy;

/*
 * Can we over load main method ? if we overloaded then which main will be called first by JVM .
 */
public class Demo_ClassAndObject_20_MethodOverloading {

	public static void main(String[] args) {
		System.out.println("Main with string single array as arugument ");
	}

	
	public static void main(String args[][]) {
		System.out.println("Main with string array as arugument ");
	}
	public static void main(String args) {
		System.out.println("Main with string arugument ");
	}

	public static void main(int args[]) {
		System.out.println("Main with string arugument ");
	}

}
//Note :- while run time jvm will always calls the public static void main(String[] args) method only .