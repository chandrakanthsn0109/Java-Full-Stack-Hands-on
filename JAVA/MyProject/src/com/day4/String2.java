package com.day4;

//Strings are Immutable Object
//StringBuffers are Mutable Object

public class String2 {

	public static void main(String[] args) {
		String s1 = "Java";
		s1 = s1.concat(" World");
		
		System.out.println(s1);
		
		StringBuffer sb = new StringBuffer("Java");
		sb.append(" World");
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());
	}

}
