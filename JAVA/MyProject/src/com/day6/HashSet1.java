package com.day6;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(10);
		hs.add(7);
		hs.add(18);
		hs.add(93);
		
		hs.add(10);
		System.out.println(hs);
		
		//Traversing Set
		//Way-1
		System.out.println("=====================");
		for(Integer i : hs) {
			System.out.println(i);
		}
		
		//Way-2
		System.out.println("=====================");
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
