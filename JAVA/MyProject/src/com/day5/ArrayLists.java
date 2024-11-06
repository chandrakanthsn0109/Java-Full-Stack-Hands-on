package com.day5;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<Object> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add("Chandra");
		l1.add(15.05f);
		
		System.out.println(l1);
		System.out.println(l1.get(2));
		System.out.println(l1.size());
		System.out.println(l1.getClass());
		
		for(Object e : l1) {
			System.out.println(e);
		}
		
		l1.remove(1);
		System.out.println(l1);
		
		l1.add(2, "Raju");
		System.out.println(l1);
		
		System.out.println(l1.contains(10)); //true
		
		System.out.println(l1.isEmpty()); //false
		
		ArrayList<Object> l2 = new ArrayList<>();
		l2.add(7);
		l2.add(200000000000l);
		l2.add(l1);
		l2.add(93);
		System.out.println(l2);
		
		System.out.println(l2.contains(l1));
		
		ArrayList<Object> l3 = (ArrayList<Object>) l1.clone();
		System.out.println(l3);
		
		l3.clear();
		System.out.println(l3);
		
		System.out.println(l1.indexOf("Raju"));
		
		l1.set(3, 15000);
		System.out.println(l1);
		
	}

}
