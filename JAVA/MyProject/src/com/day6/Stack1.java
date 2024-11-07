package com.day6;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);

		System.out.println(st);
		
		st.pop();
		System.out.println(st);

		System.out.println(st.peek());
		System.out.println(st);

		//Traversing List
		//Way-1
		System.out.println("===========");
		for(int i = 0; i < st.size(); i++) {
			System.out.println(st.get(i));
		}

		//Way-2
		System.out.println("===========");
		for(Integer i : st) {
			System.out.println(i);
		}
		
		//Way-3
		System.out.println("===========");
		Iterator<Integer> it = st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Way-4
		System.out.println("===========");
		Enumeration<Integer> e = st.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
