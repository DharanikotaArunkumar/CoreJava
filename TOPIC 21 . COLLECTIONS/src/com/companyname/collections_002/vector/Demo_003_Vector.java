/*
 * How Vector is growing the its size double ?
 * How vector implemented internally ?
 */

package com.companyname.collections_002.vector;

import java.util.Vector;

public class Demo_003_Vector {

	public static void main(String[] args) {
		
		Vector<Integer> v1 = new Vector<Integer>();
		
		/**
		 * 	protected Object[] elementData;
		 * 
		 * 	public synchronized boolean add(E e) {
        		modCount++;
        		ensureCapacityHelper(elementCount + 1);
        		elementData[elementCount++] = e;
        		return true;
    		}
    		
    		
    		private void ensureCapacityHelper(int minCapacity) {
        		// overflow-conscious code
        		if (minCapacity - elementData.length > 0)
            	grow(minCapacity);
    		}
    		
    		private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
    		
    		private void grow(int minCapacity) {
        		// overflow-conscious code
        		int oldCapacity = elementData.length;
        		int newCapacity = oldCapacity + ((capacityIncrement > 0) ? capacityIncrement : oldCapacity);
        		if (newCapacity - minCapacity < 0)
            		newCapacity = minCapacity;
        		if (newCapacity - MAX_ARRAY_SIZE > 0)
            		newCapacity = hugeCapacity(minCapacity);
        		elementData = Arrays.copyOf(elementData, newCapacity);
    		}

		 */
		
		
		for(int elementNo=1;elementNo<20;elementNo++){
			v1.add(elementNo);
			System.out.println(" Adding element to vector :- "+elementNo +"   present size of vector is   :- "+v1.size() +" present capacity of the vecot is :- "+v1.capacity());
			
		}

	}

}
