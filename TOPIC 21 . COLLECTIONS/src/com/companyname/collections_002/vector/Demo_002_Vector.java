/*
 *  We have three constructors in vector class .Vector can have any type data in it .
 */
package com.companyname.collections_002.vector;

import java.util.Vector;

public class Demo_002_Vector {

	public static void main(String[] args) {
		/**
		 * Constructor -1 :-
		 * 
	     * Constructs an empty vector so that its internal data array
	     * has size {@code 10} and its standard capacity increment is
	     * zero.
	     *
	     		public Vector() {
	        		this(10);
	     		}
	     */
		
		Vector<Integer> v1 = new Vector<Integer>();
		
		
		
		//Capacity method in the vector class tells what is present capacity of the vector
		System.out.println("The default capacity of the vector is :-"+v1.capacity());
		
		/**
		 * Constructor -2 :-
		 * Constructs an empty vector with the specified initial capacity and
		 * with its capacity increment equal to zero.
		 *
		 * @param   initialCapacity   the initial capacity of the vector
		 * @throws IllegalArgumentException if the specified initial capacity
		 *         is negative
		 
		 		public Vector(int initialCapacity) {
		 			this(initialCapacity, 0);
		 		}
		 */
		
		Vector<Integer> v2 = new Vector<Integer>(15);
		System.out.println("The capacity of the vector v2 is :-"+v2.capacity());
		
		
		/**
		 * Constructor -3 :-
	     * Constructs an empty vector with the specified initial capacity and
	     * capacity increment.
	     *
	     * @param   initialCapacity     the initial capacity of the vector
	     * @param   capacityIncrement   the amount by which the capacity is
	     *                              increased when the vector overflows
	     * @throws IllegalArgumentException if the specified initial capacity
	     *         is negative
	     
	    			public Vector(int initialCapacity, int capacityIncrement) {
	        				super();
	        			if (initialCapacity < 0)
	            			throw new IllegalArgumentException("Illegal Capacity: "+initialCapacity);
	        				this.elementData = new Object[initialCapacity];
	        				this.capacityIncrement = capacityIncrement;
	    			}
	    */
		
		Vector<Integer> v3 = new Vector<Integer>(5,2);
		System.out.println("The capacity of the vector v3 is :-"+v3.capacity());
		
		
		/**
		 * Constructor -4 :- Added From 1.2 to support other collections 
		 * 
	     * Constructs a vector containing the elements of the specified
	     * collection, in the order they are returned by the collection's
	     * iterator.
	     *
	     * @param c the collection whose elements are to be placed into this
	     *       vector
	     * @throws NullPointerException if the specified collection is null
	     * @since   1.2
	     
	    			public Vector(Collection<? extends E> c) {
	        			elementData = c.toArray();
	        			elementCount = elementData.length;
	        			// c.toArray might (incorrectly) not return Object[] (see 6260652)
	        			if (elementData.getClass() != Object[].class)
	            		elementData = Arrays.copyOf(elementData, elementCount, Object[].class);
	    }
		*/
		
		System.out.println("-------------------------------------------");
		
		System.out.println("\n\n---------------------Adding Elements to v1 Vector ----------------------\n");
		for(int elementNo=1;elementNo<20;elementNo++){
			v1.add(elementNo);
			System.out.println(" Adding element to vector :- "+elementNo +"   present size of vector is   :- "+v1.size() +" present capacity of the vecot is :- "+v1.capacity());
			
		}
		
		
		System.out.println("\n\n---------------------Adding Elements to v2 Vector ----------------------\n");
		for(int elementNo=1;elementNo<20;elementNo++){
			v2.add(elementNo);
			System.out.println(" Adding element to vector :- "+elementNo +"   present size of vector is   :- "+v2.size() +" present capacity of the vecot is :- "+v2.capacity());
			
		}
		

		System.out.println("\n\n---------------------Adding Elements to v3 Vector ----------------------\n");
		for(int elementNo=1;elementNo<20;elementNo++){
			v3.add(elementNo);
			System.out.println(" Adding element to vector :- "+elementNo +"   present size of vector is   :- "+v3.size() +" present capacity of the vecot is :- "+v3.capacity());
			
		}
		
	}

}
