package com.companyname.demoexceptions;

/*Exception throw Or Exception Propagation  :-
Exception Occurred at creditCard.saveTranscation(Demo_Exceptions_21.java:24) ,
(Demo_Exceptions_21.java:24) exception occurred by but out put shows the exception 
Demo_Exceptions_21.java:14 also . why ?*/


public class Demo_Exceptions_021 {

	public static void main(String[] args) {
		
			CreditCard card = new CreditCard();
			card.saveTranscation();
	
	}

}

class CreditCard {

	public void saveTranscation() {
		String st = null;
		st.length();
	}
}




/*Explaination :- 
Because code execution will be done using stack , once the main method is called . 
it will be pushed into the stack , if main method calls any other method then that will be pushed 
into the stack .in this way all the methods will be pushed into the stack and on sucessfull 
completion it will be popped out the stack , 


If any exception is raised on the during execution inside the method , the runtime environment will
remove the method from the stack and propagate the exception to the calling method , this way the 
Propagation of exceptions happens till reached end or till its cached the catch block .
This propagation will be done automatically .


The process of automatic forcefully removal of the method from the stack for the
un checked exception is called stack unwinding .*/