/*
 * The Object class defines the basic state and behavior that all objects must have, 
			
			such as ,
				the ability to compare oneself to another object,
				to convert to a string, 
				to wait on a condition variable,
				to notify other objects that a condition variable has changed,
				and to return the object's class.

 */

package com.learnjava.topic16.objectclass;

public class Demo_139_Object_Class_003 {

	public static void main(String[] args) throws InterruptedException {

		Object obj = new Object();
		System.out.println(obj.equals(obj));
		System.out.println(obj.getClass());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());;
		obj.notify();
		obj.notifyAll();
		obj.wait();
		obj.wait(100);
		obj.wait(100L, 10);

	}

}
