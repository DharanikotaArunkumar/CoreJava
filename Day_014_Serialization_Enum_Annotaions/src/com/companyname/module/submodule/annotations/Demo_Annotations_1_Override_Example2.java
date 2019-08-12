/*
 * My intension in the earlier program to override the parent class method in child class .By introducing the @Override annotation
 * i am telling the JVM to Over ride this method . 
 */

package com.companyname.module.submodule.annotations;



class Person1{
	
	public String name ;
	public void diplayPersonName(){
		System.out.println("diplayPersonName from Person ");
	}
}

class IndianPerson1 extends Person1{
	
	// By including the @Override its checking its parent class method signature .
	@Override
	public void  diplayPersonName(){
		System.out.println("diplayPersonNamme  from indian ");	
	}
	
	
	
}

public class Demo_Annotations_1_Override_Example2 {

	public static void main(String[] args) {
		
		IndianPerson1 indian = new IndianPerson1();
		indian.diplayPersonName();
		/*
		 * By introducing the @override annotation we are correctly implementing the override from super method . annotation enforcing the 
		 * correct implementation . 
		 */

	}

}
