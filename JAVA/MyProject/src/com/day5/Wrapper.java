package com.day5;

public class Wrapper {

	public static void main(String[] args) {
		int a = 7;
		Integer obj1 = new Integer(a); //Boxing
		int b = obj1.intValue(); //Un-Boxing
		
//		JDk 1.5
		Integer obj2 = a; //Auto Boxing
		int c = obj2; //Auto Un-Boxing
	}

}
