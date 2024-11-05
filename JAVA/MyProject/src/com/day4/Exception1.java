package com.day4;

public class Exception1 {

	public static void main(String[] args) {
		System.out.println("Before Exception");

		try {
			int a = Integer.parseInt("abc",2);
			int b = 10 / 0;//throw new ArithmeticException
		}catch(ArithmeticException e) {
//			System.out.println("Divide by zero");
			e.printStackTrace();
		}catch(NegativeArraySizeException e) {
//			System.out.println("Negative array size");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Array index out of bound");
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}

		System.out.println("After Exception");
	}

}
