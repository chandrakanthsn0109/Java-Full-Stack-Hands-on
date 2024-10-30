package com.day1;

public class InstanceStatic {
	
//	int b = 20;
	
	static int b = 20;

	public static void main(String[] args) {
		InstanceStatic is1 = new InstanceStatic();
		InstanceStatic is2 = new InstanceStatic();
		
		System.out.println(is1.b);//20 //20
		System.out.println(is2.b);//20 //20
		
		is1.b = 93;
		
		System.out.println(is1.b);//93 //93
		System.out.println(is2.b);//20 //93

	}

}
