/*
 * This program explains the problem not overriding the method in parent class because of the spell mistake .
 */

package com.companyname.module.submodule.annotations;



class Person{
	
	public String name ;
	public void diplayPersonName(){
		System.out.println("diplayPersonName from Person ");
	}
}

class IndianPerson extends Person{
	
	@Override
	public void  diplayPersonName(){
		System.out.println("diplayPersonNamme  from indian ");	
	}
	
}

public class Demo_Annotations_1_Override_Example1 {

	public static void main(String[] args) {
		
		IndianPerson indian = new IndianPerson();
		indian.diplayPersonName();
		indian.diplayPersonNamme();

	}

}
