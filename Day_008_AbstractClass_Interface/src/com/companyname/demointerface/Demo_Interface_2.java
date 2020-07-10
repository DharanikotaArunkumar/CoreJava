package com.companyname.demointerface;



// Interface rules :-
//1) By default interface methods are abstract .
//2) All abstract methods are public in interface 



interface Transaction{	
	boolean transaction();
//	public abstract boolean transaction();
}


class CreditCard implements  Transaction{

	@Override
	public boolean transaction() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
public class Demo_Interface_2 {

	public static void main(String[] args) {
	
	}

}
