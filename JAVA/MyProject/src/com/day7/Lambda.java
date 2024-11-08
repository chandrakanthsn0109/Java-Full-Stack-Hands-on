package com.day7;

@FunctionalInterface
interface MyInter {
	int calculate(int a, int y);
	default void myMethod5() {
		System.out.println("Functional Default Method");
	}
}

public class Lambda {

	public static void main(String[] args) {
		MyInter ref = (x, y) -> x + y;
		System.out.println(ref.calculate(10, 7));
		System.out.println(ref.calculate(100, 200));
		
		ref = (x, y) -> x - y;
		System.out.println(ref.calculate(10, 7));
		System.out.println(ref.calculate(100, 200));
	}

}
