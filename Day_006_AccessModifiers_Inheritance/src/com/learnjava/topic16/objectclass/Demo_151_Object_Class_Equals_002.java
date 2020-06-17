/* "==" operator with non primitive 
 * 		Non -Primitives :- checks the both are referring to same memory location .
 *
 */

package com.learnjava.topic16.objectclass;

class Team {
	String teamName;
	
	int age;
}

public class Demo_151_Object_Class_Equals_002 {

	public static void main(String[] args) {
		
		Team indianTeam = new Team();

		Team srilankaTeam = new Team();

		System.out.println(indianTeam == indianTeam); // Checks for the memory location
		
		System.out.println(srilankaTeam == srilankaTeam); // Checks for the memory location
		
		System.out.println(indianTeam == srilankaTeam); // Checks for the memory location
		
		System.out.println(10==10);
		
	}

}
