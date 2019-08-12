package com.companyname.demointerface;

//if a class contains all non Concrete  methods then that is called 100% abstract class 
//is abstract class is not 100% abstract class . because it had the none abstract constructor and fields 

// If i want to achieve the 100% abstract class then i can do this with interface .

abstract class Transactions11{
	boolean isTransSucess;
	int transNo;	
	abstract boolean transaction();
	abstract  public  int  displayTransactionId();
}

class CreditCard1 extends Transactions11{
	int cardNumber;
	String nameOnCard;
	int cvv;
	
	 boolean transaction(){
		 
		 System.out.println("Credit card method ");
		 return isTransSucess;
		 
	 }
	 
	 public  int  displayTransactionId(){return 10;}
	 
	
}

public class Demo_Interface_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
