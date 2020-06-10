/*
 * javac :- javac command is used to compile the .java file 
 * 
 * java  :- to run java class
 * 
 * javap :- to print human readable generated .class file .
 * 
 * javadoc :- to generate java documentation.
 * 
 * 
 * Example:-
 * 
 *  Step 1:- Go to Package Explorer ,Click on the "Demo_100_Commands_001.java"
 *  
 *  Step 2:- Right click on file then select properties or press Alt+Enter.
 *  
 *  Step 3:- Under Resource tab,Then take the location go to that folder location
 *  
 *  Step 4:- Open Command prompt from that location and issue javac  Demo_100_Commands_001.java
 *  
 *  Step 5:- Then Run java  Demo_100_Commands_001 Hello World
 *  
 *  Step 6:- javap Demo_100_Commands_001
 *  
 *  Step 7:- Go to sre folder location then issue javadoc -d C:\javadoc\test com.test 
 *  
 *  Step 8:- In eclipse Menu bar -> Project -> Generate JavaDoc...
 *  
 *  Step 9:- Give javadoc command location of the javadocprogram on your computer. Typically, it is located under JAVA_HOME’s bin directory. For example, C:\Program Files\Java\jdk1.8.0_21\bin\javadoc.exe
 * 
 * */
package com.learnjava.topic30.commands;

public class Demo_100_Commands_001 {

	public static void main(String[] args) {
		System.out.println(args[0]+" "+args[1]+" !!!");

	}

}
