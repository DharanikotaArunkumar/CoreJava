package com.learnjava.topic32.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo_004_Generics_BoundedType {

	public static void main(String[] args) {

		List<String> arrayList = new ArrayList<>();

		arrayList.add("A");

		arrayList.add("B");

		arrayList.add("C");
		Store3<List> store3 = new Store3<>();

		store3.set(arrayList);

		//store.set("Java");

		//List list = store.get();

		//System.out.println("Book Name" + list);

		List<String> linkedList = new LinkedList<>();

		linkedList.add("ABC");

		linkedList.add("BCA");

		linkedList.add("CAB");
	//	Store3<List> store1 = new Store3<>();

		store3.set(linkedList);

		List linkedListValue = store3.get();

		System.out.println("Book Name" + linkedListValue);

	}

}

class Store3<T extends Person> { // T means Type .

	private T value; // Cleaner code

	void set(T t) {
		value = t;
	}

	T get() {
		return value;
	}

}
