package com.day6;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(10);
		lhs.add(7);
		lhs.add(18);
		lhs.add(93);
		
		lhs.add(10);
		System.out.println(lhs);
		
		//Traversing Set
		//Way-1
		System.out.println("=====================");
		for(Integer i : lhs) {
			System.out.println(i);
		}
		
		//Way-2
		System.out.println("=====================");
		Iterator<Integer> it = lhs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
