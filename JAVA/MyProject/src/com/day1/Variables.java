package com.day1;

//Three types of Variables 

public class Variables {
	
	int b = 20;//Instance or Object Variable
	
	static int c = 30;//Static or Class Variable

	public static void main(String[] args) {

		int a = 10;//Local Variable
		System.out.println(a);
		
		Variables v = new Variables();
		System.out.println(v.b);
		
		System.out.println(Variables.c);
		
		
	}

}
