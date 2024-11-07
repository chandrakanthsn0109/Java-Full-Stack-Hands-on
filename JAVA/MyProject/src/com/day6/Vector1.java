package com.day6;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<>();
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		vec.add(10);

		System.out.println(vec);

		vec.remove(new Integer(20));
		System.out.println(vec);

		//Traversing List
		//Way-1
		System.out.println("===========");
		for(int i = 0; i < vec.size(); i++) {
			System.out.println(vec.get(i));
		}

		//Way-2
		System.out.println("===========");
		for(Integer i : vec) {
			System.out.println(i);
		}
		
		//Way-3
		System.out.println("===========");
		Iterator<Integer> it = vec.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Way-4
		System.out.println("===========");
		Enumeration<Integer> e = vec.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
