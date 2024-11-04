package com.day3;

abstract class MyAbstract {
	
	MyAbstract() {
		System.out.println("Abstract Class Constructor");
	}
	void myMethod1() {
		System.out.println("Normal Method");
	}
	
	abstract void myMethod2() ;
	abstract void myMethod3() ;
}

class MyNormalClass extends MyAbstract {

	void myMethod2() {
		System.out.println("Abstract Method-1");
	}

	void myMethod3() {
		System.out.println("Abstract Method-2");
	}
	
}

public class Abstract {

	public static void main(String[] args) {
		MyAbstract obj = new MyNormalClass();
		obj.myMethod1();
		obj.myMethod2();
		obj.myMethod3();
		
	}

}
