package com.day6;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(10);

		System.out.println(l1);

		l1.remove(new Integer(20));
		System.out.println(l1);

		//Traversing List
		//Way-1
		System.out.println("===========");
		for(int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}

		//Way-2
		System.out.println("===========");
		for(Integer i : l1) {
			System.out.println(i);
		}
		
		//Way-3
		System.out.println("===========");
		Iterator<Integer> it = l1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
