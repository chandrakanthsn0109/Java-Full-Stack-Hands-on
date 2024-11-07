package com.day6;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class SortedSet1 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());
		ts.add(10);
		ts.add(7);
		ts.add(18);
		ts.add(93);
		
		ts.add(10);
		System.out.println(ts);
//		System.out.println(ts.descendingSet());

		
		//Traversing Set
		//Way-1
		System.out.println("=====================");
		for(Integer i : ts) {
			System.out.println(i);
		}
		
		//Way-2
		System.out.println("=====================");
		Iterator<Integer> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
