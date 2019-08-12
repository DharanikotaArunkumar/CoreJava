package com.companyname.demo2.accessmodifiers.samepackage;

//only public and default is applicable access modifiers in java .

/*private class classPrivate{	
	classPrivate(){
		System.out.println(" I am private class");
	}	
}*/


/*protected class classProtected{
	classProtected(){
		System.out.println(" I am protected class");
	}	
}*/

class classDefault{	
	classDefault(){
		System.out.println(" I am Default class");
	}	
}
 


public class Demo_Class_Access_Modifiers_1 {
	
	public Demo_Class_Access_Modifiers_1(){
		System.out.println(" I am public class");
	}

	public static void main(String[] args) {
		classDefault obj = new classDefault();
	}

}
