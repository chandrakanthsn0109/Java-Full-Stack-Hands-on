package com.day7;

interface MyInterface {
	void myMethod1();
	static void myMethod2() {
		System.out.println("Static Method");
	}
	
	static void myMethod4() {
		System.out.println("Second Static Method");
	}
	
	default void myMethod3() {
		System.out.println("Default Method");
	}
}

class NormalClass implements MyInterface {
	public void myMethod1() {
		System.out.println("Abstract Method");
	}
	
	public void myMethod3() {
		System.out.println("Overridden Default Method");
	}
	
//	@Override
//	public void myMethod2() {
//		
//	}
}

public class Java8 {

	public static void main(String[] args) {
		MyInterface obj = new NormalClass();
		obj.myMethod1();
		obj.myMethod3();
		MyInterface.myMethod2();
		MyInterface.myMethod4();
	}

}
