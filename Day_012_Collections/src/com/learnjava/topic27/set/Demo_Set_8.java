package com.learnjava.topic27.set;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class Demo_Set_8 {
	public static void main(String[] args) {
		
		Set set = new CopyOnWriteArraySet<>();
		//set.add(null);
		set.add(5);
		set.add(6);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
	System.out.println(set);
	}

}
