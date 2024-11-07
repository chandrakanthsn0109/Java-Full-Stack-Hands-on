package com.day6;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<Integer> ll1 = new LinkedList<>();
		ll1.add(10);
		ll1.add(20);
		ll1.add(30);
		ll1.add(40);
		ll1.add(50);
		ll1.add(10);

		System.out.println(ll1);

		ll1.remove(new Integer(20));
		System.out.println(ll1);

		//Traversing List
		//Way-1
		System.out.println("===========");
		for(int i = 0; i < ll1.size(); i++) {
			System.out.println(ll1.get(i));
		}

		//Way-2
		System.out.println("===========");
		for(Integer i : ll1) {
			System.out.println(i);
		}
		
		//Way-3
		System.out.println("===========");
		Iterator<Integer> it = ll1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
