/* "==" operator with non primitive 
 * 		Non -Primitives :- checks the both are referring to same memory location .
 *
 */

package com.companyname.demo6.equals;

class Team {
	String teamName;
	
	int age;
}

public class Demo_Object_002_Equals {

	public static void main(String[] args) {
		
		Team indianTeam = new Team();

		Team srilankaTeam = new Team();

		System.out.println(indianTeam == indianTeam); // Checks for the memory location
		
		System.out.println(srilankaTeam == srilankaTeam); // Checks for the memory location
		
		System.out.println(indianTeam == srilankaTeam); // Checks for the memory location
		
		System.out.println(10==10);
		
	}

}
