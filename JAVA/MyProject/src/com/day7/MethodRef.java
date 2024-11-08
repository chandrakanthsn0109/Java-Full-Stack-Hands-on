package com.day7;

interface MyInter1 {
	void myMethod();
}

public class MethodRef {

	public MethodRef() {
		System.out.println("Constructor");
	}
	
	void method1() {
		System.out.println("Instance Method");
	}
	
	static void method2() {
		System.out.println("Static Method");
	}
	
	public static void main(String[] args) {
		MethodRef obj = new MethodRef();
		MyInter1 ref = obj :: method1;
		ref.myMethod();
		
		ref = MethodRef :: method2;
		ref.myMethod();
		
		ref = MethodRef :: new;
		ref.myMethod();
	}

}
