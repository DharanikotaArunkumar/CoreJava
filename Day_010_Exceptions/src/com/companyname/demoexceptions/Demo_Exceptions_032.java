package com.companyname.demoexceptions;

/*//If super class constructor throws Exception, Throwable, checked exception ,
We need to handle in the exceptions in sub classes .*/

public class Demo_Exceptions_032 {

	public static void main(String[] args) {
		/**
		 * @param args
		 */
		
			A a;
			try {
				a = new B();
				a.display();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	
	}

}


class A{
	A() throws Exception {
		
	}
	
	void display(){
		System.out.println("in display method");
	}
}

class B extends A{
	
	B() throws Exception{
		super();
	}
}