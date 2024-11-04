package com.day3;

class TwoWheeler2{
	void noOfWheel() {
		System.out.println("I have two Wheels.");
	}
	
	void brandName() {
		System.out.println("1");
	}
}

class Bike2 extends TwoWheeler2{
	@Override
	void brandName() {
		System.out.println("Brand Name is Honda.");
	}
}

public class MyClass {

	public static void main(String[] args) {
		TwoWheeler2 two = new Bike2();//DMD
		two.noOfWheel();
		two.brandName();
	}

}
