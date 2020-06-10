package com.learnjava.topic24.arrays;

/*
 * Till now we have seen problems with arrays . Now lets see the advantage 
 * 
 *  Array is recommended in performance .
 *  Because they store the elements Continuously    
 * 
 *  Just Keep In Mind :- Arrays are best in performance when compare to collections .
 *  
 *  if you writing any application for better performance we need the array (if and only if you know size) .
 *  if your writing any application with memory is major ,then go collections
 *  in deed all data types are gives better performance and all class give additional functionality . 
 */
public class Demo_Array_6 {

	public static void main(String[] args) {
		
		int noOfStudents[] = new int[5];
		noOfStudents[0] =101;
		noOfStudents[1] =102;
		noOfStudents[2] =103;
		noOfStudents[3] =104;
		noOfStudents[4] =105;

		System.out.println(noOfStudents.hashCode()); // Its starts storing the elements from printed hash code location 
		
	}

}
