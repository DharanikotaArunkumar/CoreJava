package com.learnjava.topic24.arrays;

/*
 * Lets see the problems with arrays 
 * 
 * 3) Memory is wasted if we are not used  
 * 
 */
public class Demo_Array_4 {
	
	public static void main(String[] args) {
		
	int student_Chair_Number[]  = new int [100];		// Planned for class of 100 students 

	student_Chair_Number[0] =1;
	student_Chair_Number[1] =2;
	student_Chair_Number[2] =3;
	student_Chair_Number[3] =4;
	student_Chair_Number[4] =5;
	// Only 5 students enrolled for program .Rest of 95 memory allocations are waste .
	
	
	}
}
